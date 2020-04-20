package com.heckthon.testcenterservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.heckthon.testcenterservice.model.TestCenterDetails;

/**
 * @author IQUBAL MUSTAFA KAKI
 *
 */
@Service
@Configuration
public class TestCenterServiceImpl implements TestCenterService{

	@Override
	public List<TestCenterDetails> getListOfTestCenter() {
		
		List<TestCenterDetails> tcdlist = new ArrayList<TestCenterDetails>();
		
		TestCenterDetails tcd1 = new TestCenterDetails();
		tcd1.setTestCenterName("Apollo");
		tcd1.setAvailableSlot("10:30 AM");
		
		tcdlist.add(tcd1);
		
		TestCenterDetails tcd2 = new TestCenterDetails();
		tcd1.setTestCenterName("Fortis");
		tcd1.setAvailableSlot("11:30 AM");
		
		tcdlist.add(tcd2);
		return tcdlist;
	}

}
