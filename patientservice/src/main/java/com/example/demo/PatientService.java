package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Patient;
@Service
public class PatientService {
	List<Patient> pat;

	public PatientService(List<Patient> pat) {
		super();
		this.pat = pat;
	}

	public List<Patient> getpat() {
		return pat;
	}

	public PatientService() {
		super();
	}

	public void setpat(List<Patient> pat) {
		this.pat = pat;
	}
	public List<Patient> getAllPatient() {
		
		return pat;
	}

	public Patient getPatientById(Patient id) {
	
		return id;
	}

	public void delete(Patient patient) {
		
		
	}

	public void saveOrUpdate(Patient patient) {
		
		
	}

	public List<Patient> findAll() {
		
		return null;
	}

	public Long findById(Long patientId) {
		
		return null;
	}

	public Patient save(Patient patient) {
		
		return null;
	}

	

	@Override
	public String toString() {
		return "pats [pat=" + pat + "]";
	}



	

}
