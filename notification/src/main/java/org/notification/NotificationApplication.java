/**
 * 
 */
package org.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author x136858
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class NotificationApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(NotificationApplication.class, args);
	}

}
