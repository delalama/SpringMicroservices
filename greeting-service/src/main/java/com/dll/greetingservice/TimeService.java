package com.dll.greetingservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("time-service")
public interface TimeService {

	@GetMapping
	String getTime();

}
