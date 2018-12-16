package com.springdemo.sam.Springrestdemo.filtering;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilterController {
	
	@RequestMapping("/filter")
	private SomeBean filter() {
		return new SomeBean("field1","field2","field3");
	}

}
