package zipkin.service.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import zipkin.service.all.service.ZepkinServiceAggregrator;

@RestController
public class ZipkinController {

	private Log log = LogFactory.getLog(ZipkinController.class);

	@Autowired
	private ZepkinServiceAggregrator aggregrator;

	@Autowired
	private NotificationClient notificationClient;

	@GetMapping(path = "/hi")
	@HystrixCommand(fallbackMethod = "defaultResponse")
	public ResponseEntity<String> hi() {
		String message = "";
		log.info("Handling request");
		message = notificationClient.getOfferNotification();
		// aggregrator.getStringResponse("http://localhost:8083/notify/offer");
		return new ResponseEntity<String>(message, HttpStatus.OK);
	}

	public ResponseEntity<String> defaultResponse() {
		return new ResponseEntity<String>("Notificaion service is not available", HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
