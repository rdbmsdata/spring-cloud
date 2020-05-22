/**
 * 
 */
package sample.config.client.controler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author x136858
 *
 */

@RestController
public class ConfigControler {

	@Value("${welcome.message}")
	String message;
	@Value("${client.name}")
	String clientName;

	@GetMapping(path = "/message")
	public String getMessage() {
		return message;
	}

	@GetMapping(path = "/client")
	public String getClientName() {
		return clientName;
	}

}
