package com.example.sampleproject.service;

import java.util.List;

import com.example.sampleproject.model.Insurance;

public interface InsuranceService {

	public Insurance saveInsuranceDetails(Insurance insurance);

	List<Insurance> getAllInsuranceDetails();

	public Insurance getInsuranceById(Integer insuranceId);

	public void deleteInsuranceById(Integer insuranceId);

}
