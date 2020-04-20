package com.heckthon.userappointmentservice.service;

import org.springframework.stereotype.Service;

import com.heckthon.userappointmentservice.model.UserDetails;

/**
 * @author IQUBAL MUSTAFA KAKI
 *
 */

@Service
public interface UserAppointmentService {
	
	public UserDetails registerUser(UserDetails user);
	public UserDetails updateUserAppointment(UserDetails user);
	public boolean validateUser(UserDetails user);

}
