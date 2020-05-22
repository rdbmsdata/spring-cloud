package zipkin.service.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "notification", url = "http://localhost:8083/")
public interface NotificationClient {

	@GetMapping(value = "/notify/offer")
	public String getOfferNotification();
}
