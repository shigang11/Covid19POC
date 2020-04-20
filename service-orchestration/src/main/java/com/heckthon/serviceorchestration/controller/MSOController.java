package com.heckthon.serviceorchestration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.heckthon.serviceorchestration.model.UserDetails;
import com.heckthon.serviceorchestration.service.MSOService;

/**
 * @author IQUBAL MUSTAFA KAKI
 *
 */

@RestController
@RequestMapping("/")
public class MSOController {
	
	@Autowired
	MSOService uas;
	
	@GetMapping(value="appDetails", produces = MediaType.APPLICATION_JSON_VALUE)
	public String getApplicationDetails() {
		return "Heckthon Covid19 Testing Center";
	}
	
	@RequestMapping(value="getAppointment", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public UserDetails getAppointment(@RequestBody UserDetails userDetails){
		return null;
	}
}
