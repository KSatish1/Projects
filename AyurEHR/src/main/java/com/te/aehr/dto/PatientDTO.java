package com.te.aehr.dto;

import java.time.LocalDate;

import com.te.aehr.entity.Gender;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class PatientDTO {

	private String patientName;
	private String address;
	private String emailId;
	private long phoneNumber;
	private LocalDate dateOfBirth;
	private Gender gender;
}
