package com.heckthon.serviceorchestration.service;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

//import org.apache.http.HttpEntity;
//import org.apache.http.client.methods.CloseableHttpResponse;
//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.entity.StringEntity;
//import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.HttpClients;
//import org.apache.http.util.EntityUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.env.Environment;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;

import com.heckthon.serviceorchestration.model.UserDetails;

/**
 * @author IQUBAL MUSTAFA KAKI
 *
 */

@Service
@Configuration
public class MSOServiceImpl implements MSOService {

//	@Autowired
//	private Environment env;
//	
//	@Autowired
//	private RestTemplate restTemplate;
	
	@Override
	public UserDetails getAppointment(UserDetails user) {
		String resp = "";
		try {
//			//checking testing center
//			ResponseEntity<String> response = restTemplate.exchange(env.getProperty("getTestCenterListUrl"), HttpMethod.POST, null, String.class);
//			if(response.getBody()!= null) {
//				// Update Appointment
//				HttpPost httpPost = new HttpPost(env.getProperty("updateUserAppointmentUrl"));
//				String json = "{\"userName\":\"Alan\", \"appointmentTestCenter\": \"Apollo\", \"appointmentSlot\":\"10:30\"}";
//				StringEntity stringEntity = new StringEntity(json);
//				httpPost.setEntity(stringEntity);
//				CloseableHttpClient httpClient1 = HttpClients.createDefault();
//				CloseableHttpResponse response1 = httpClient1.execute(httpPost);
//				
//				HttpEntity entity = response1.getEntity();
//				if(entity != null) {
//					resp = EntityUtils.toString(entity);
//				}
//			}
		}catch(Exception e) {
			
		}
		return user;
		
	}
}
