package com.interview.uuid.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.interview.uuid.model.Parameters;
import com.interview.uuid.service.UuidService;

@RestController
public class UuidController {
	
	@Autowired
	UuidService uuidService;

	@RequestMapping(value = "/api/uuid/v1", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String createUUID1(@Valid @RequestBody(required=false) Parameters parameters) {
		//default values from spec?
		int x = 2, y = 7, z = 5;
		if(parameters != null) {
			x = parameters.getX();
			y = parameters.getY();
			z = parameters.getZ();
		} 
				
		return uuidService.generateUuid(x, y, z);
	}
	
	@RequestMapping(value = "/api/uuid/v2", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String createUUID2(@Valid @RequestBody(required=false) Parameters parameters) {
		//default values from spec?
		int x = 2, y = 7, z = 5;
		if(parameters != null) {
			x = parameters.getX();
			y = parameters.getY();
			z = parameters.getZ();
		} 
				
		return uuidService.generateUuid2(x, y, z);
	}
	
}
