package com.te.aehr.entity;

public enum Gender {

	MALE("MALE"),FEMALE("FEMALE"),OTHERS("OTHERS");
	
	private String gender;
	
	private Gender(String gender) {
		this.gender = gender;
	}
}
