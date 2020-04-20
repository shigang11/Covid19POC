package com.heckthon.userappointmentservice.model;

public class UserDetails {
	
	/**
	 * @author IQUBAL MUSTAFA KAKI
	 *
	 */
	private String userName;
	private String appointmentTestCenter;
	private String appointmentSlot;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAppointmentTestCenter() {
		return appointmentTestCenter;
	}
	public void setAppointmentTestCenter(String appointmentTestCenter) {
		this.appointmentTestCenter = appointmentTestCenter;
	}
	public String getAppointmentSlot() {
		return appointmentSlot;
	}
	public void setAppointmentSlot(String appointmentSlot) {
		this.appointmentSlot = appointmentSlot;
	}

}
