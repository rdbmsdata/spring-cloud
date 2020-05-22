package zipkin.service.all.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class ZepkinServiceAggregrator implements ServiceAggregator {

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public ResponseEntity<String> getStringResponse(String url) {
		// TODO Auto-generated method stub
		ResponseEntity<String> response = null;
		try {
			response = new ResponseEntity<String>(this.restTemplate.getForEntity(url, String.class).getBody(),
					HttpStatus.OK);
		} catch (RestClientException ex) {
			response = new ResponseEntity<String>(ex.getMessage(), HttpStatus.BAD_REQUEST);
		}
		return response;

	}

}
