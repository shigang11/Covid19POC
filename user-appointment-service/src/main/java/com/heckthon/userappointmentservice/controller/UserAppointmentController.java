package com.heckthon.userappointmentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.heckthon.userappointmentservice.model.UserDetails;
import com.heckthon.userappointmentservice.service.UserAppointmentService;

/**
 * @author IQUBAL MUSTAFA KAKI
 *
 */
@RestController
@RequestMapping("/")
public class UserAppointmentController {
	
	@Autowired
	UserAppointmentService uas;
	
	@RequestMapping(value = "isRegisteredUser", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean isRegisteredUser(@RequestBody UserDetails userDetails) {
		boolean isValidUser = uas.validateUser(userDetails);
		return isValidUser;
	}
	
	@RequestMapping(value = "registerUser", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public UserDetails registerUser(@RequestBody UserDetails userDetails) {
		UserDetails user = uas.registerUser(userDetails);
		return user;
	}

	@RequestMapping(value = "updateUserAppointment", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public UserDetails updateUserAppointment(@RequestBody UserDetails userDetails) {
		UserDetails user = uas.updateUserAppointment(userDetails);
		return user;
	}
}
