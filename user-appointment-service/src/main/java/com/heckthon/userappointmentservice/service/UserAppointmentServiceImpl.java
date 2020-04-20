package com.heckthon.userappointmentservice.service;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.heckthon.userappointmentservice.model.UserDetails;
/**
 * @author IQUBAL MUSTAFA KAKI
 *
 */

@Service
@Configuration
public class UserAppointmentServiceImpl implements UserAppointmentService {

	@Override
	public UserDetails registerUser(UserDetails user) {
		return user;
	}

	@Override
	public boolean validateUser(UserDetails user) {
		return true;
	}

	@Override
	public UserDetails updateUserAppointment(UserDetails user) {
		return user;
	}

}
