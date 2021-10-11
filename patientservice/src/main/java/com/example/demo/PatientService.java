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

	@Override
	public String toString() {
		return "pats [pat=" + pat + "]";
	}

	public List<Patient> getAllPatient() {
		// TODO Auto-generated method stub
		return pat;
	}

	public Patient getPatientById(Patient id) {
		// TODO Auto-generated method stub
		return id;
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	public void saveOrUpdate(Patient patient) {
		// TODO Auto-generated method stub
		
	}

	

}
