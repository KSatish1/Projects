package com.te.aehr.service;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.te.aehr.dto.PatientDTO;
import com.te.aehr.entity.Patient;
import com.te.aehr.repository.PatientRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class PatientService {

	private final PatientRepository patientRepository;

	public int addPatient(PatientDTO patientDTO) {
		Patient patient = new Patient();
		BeanUtils.copyProperties(patientDTO,patient);
		log.info(patient.getPatientName());
		patientRepository.save(patient);
		return patient.getPatientId();
	}
}
