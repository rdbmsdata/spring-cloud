package zipkin.service;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 
 */

/**
 * @author x136858
 *
 */

@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
public class ZipkinServiceApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(ZipkinServiceApplication.class, args);

	}

}
