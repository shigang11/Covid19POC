package com.heckthon.serviceorchestration.service;

import org.springframework.stereotype.Service;

import com.heckthon.serviceorchestration.model.UserDetails;


/**
 * @author IQUBAL MUSTAFA KAKI
 *
 */

@Service
public interface MSOService {
	
	public UserDetails getAppointment(UserDetails user);
}
