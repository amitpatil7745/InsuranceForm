package com.example.sampleproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sampleproject.model.Insurance;
import com.example.sampleproject.repository.InsuranceRepository;

@Service
public class InsuranceServiceImpl implements InsuranceService {

	@Autowired
	private InsuranceRepository insuranceRepository;

	@Override
	public Insurance saveInsuranceDetails(Insurance insurance) {

		return insuranceRepository.save(insurance);
	}

	@Override
	public List<Insurance> getAllInsuranceDetails() {

		return (List<Insurance>) insuranceRepository.findAll();
	}

	@Override
	public Insurance getInsuranceById(Integer insuranceId) {

		return insuranceRepository.findById(insuranceId).get();
	}

	@Override
	public void deleteInsuranceById(Integer insuranceId) {
		insuranceRepository.deleteById(insuranceId);

	}

}
