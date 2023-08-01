package com.te.aehr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.aehr.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer>{

}
