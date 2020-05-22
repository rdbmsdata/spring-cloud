/**
 * 
 */
package zipkin.service.all.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author x136858
 *
 */
public interface ServiceAggregator {
	
	public ResponseEntity<String> getStringResponse(String url);
}
