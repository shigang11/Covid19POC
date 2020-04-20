package com.heckthon.testcenterservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.heckthon.testcenterservice.model.TestCenterDetails;
import com.heckthon.testcenterservice.service.TestCenterService;

/**
 * @author IQUBAL MUSTAFA KAKI
 *
 */
@RestController
@RequestMapping("/")
public class TestCenterController {

	@Autowired
	TestCenterService tcs;
	
	@RequestMapping(value = "getTestCenterList", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<TestCenterDetails> getTestCenterList() {
		List<TestCenterDetails> tcdlist = tcs.getListOfTestCenter();
		return tcdlist;
	}
}
