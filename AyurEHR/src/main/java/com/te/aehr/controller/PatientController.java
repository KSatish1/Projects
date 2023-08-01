package com.te.aehr.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.aehr.dto.PatientDTO;
import com.te.aehr.entity.Patient;
import com.te.aehr.service.PatientService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/patient")
@RequiredArgsConstructor
public class PatientController {

	private static final Logger log = LoggerFactory.getLogger(Patient.class);
	private final PatientService patientService;
	
	@PostMapping("/")
	public ResponseEntity<Integer> addPatient(@RequestBody PatientDTO patientDTO) {
		log.info("Info logging is enabled!!");
		log.debug("Debugging is enabled!!");
		log.info(patientDTO.getPatientName());
		return ResponseEntity.<Integer>ok(patientService.addPatient(patientDTO)) ;
	}
}
