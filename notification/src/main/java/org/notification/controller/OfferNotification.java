/**
 * 
 */
package org.notification.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author x136858
 *
 */
@RestController
public class OfferNotification {

	@GetMapping(path = "/notify/offer")
	public String getOfferNotification() {
		return "Offer is related to voice call";
	}
}
