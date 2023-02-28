package com.example.sampleproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sampleproject.model.Insurance;
import com.example.sampleproject.service.InsuranceService;
import com.example.sampleproject.service.InsuranceServiceImpl;



@RestController
@RequestMapping("/insurance")
public class InsuranceController {
	
	@Autowired
	private InsuranceService insuranceService;
	
	@PostMapping("/save")
	public ResponseEntity<Insurance> saveInsuranceDetails(@RequestBody Insurance insurance){
		
		Insurance insu = insuranceService.saveInsuranceDetails(insurance);
		
		return ResponseEntity.ok().body(insu);
	}
	
	@GetMapping("/details")
	public List<Insurance> getAllInsuranceDetails() {
		
		return getAllInsuranceDetails(); 
	}
	
	@GetMapping("/detail/{id}")
	public Insurance getInsuranceByID(@PathVariable("id") Integer insuranceId){
		
		return insuranceService.getInsuranceById(insuranceId);
	}
	
	@DeleteMapping("/detail/{id}")
	public String deleteInsuranceById(@PathVariable("id") Integer insuranceId) {
		insuranceService.deleteInsuranceById(insuranceId);
		
		return "Deleted Sucessfully !!";
	}

}
