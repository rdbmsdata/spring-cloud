package sample.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RefreshScope
public class SampleConfigClientApplication {

	//@Value("${welcome.message}")
	String welcomeText;
	public static void main(String[] args) {
		SpringApplication.run(SampleConfigClientApplication.class, args);
	}
	
	

}
