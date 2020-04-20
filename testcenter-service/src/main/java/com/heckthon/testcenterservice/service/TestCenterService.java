package com.heckthon.testcenterservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.heckthon.testcenterservice.model.TestCenterDetails;

/**
 * @author IQUBAL MUSTAFA KAKI
 *
 */
@Service
public interface TestCenterService {

	public List<TestCenterDetails> getListOfTestCenter();
}
