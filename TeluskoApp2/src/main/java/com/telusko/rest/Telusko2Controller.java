package com.telusko.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Telusko2Controller 
{
	@Autowired
	private feignClientExample feignClientExample;

	@GetMapping("/moreinfo")
	public String getMoreCourseInfo()
	{
//		RestTemplate template=new RestTemplate();
//		ResponseEntity<String> re = template.getForEntity("http://localhost:8484/info", String.class);
//		String apiResponse=re.getBody();
		String msg = feignClientExample.invokeGetRequest();
		return msg + "  This course starts on 9th Aug and 7 am IST to 8:30 am IST MON-Fri";
	}

}
