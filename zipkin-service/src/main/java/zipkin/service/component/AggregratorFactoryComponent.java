/**
 * 
 */
package zipkin.service.component;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author x136858
 *
 */
@Component
public class AggregratorFactoryComponent {

	@Bean
	public RestTemplate createRestTemplate() {
		return new RestTemplate();
	}

}
