package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class HospitalService {
	@Autowired
	private HospitalService HosSer;
	public void admitpatient(Hospital m) {
		HosSer.save(m);
	}
	
	private void save(Hospital m) {
		// TODO Auto-generated method stub
		
	}

	public List<Hospital> getAllMed() {
		return HosSer.findAll();
	}
	
	private List<Hospital> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Hospital getByDisPatientId(String id) {
		Optional<Hospital> m= HosSer.findById(id);
		if(m.isPresent()) {
			return m.get();
		}
		return null;
	}
	
	private Optional<Hospital> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteDisPatient(String id) {
		HosSer.deleteById(id);
	}

	private void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}

	public List<Hospital> getAllHospital() {
		// TODO Auto-generated method stub
		return null;
	}

	public Hospital getHospitalByName(Hospital name) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(String name) {
		// TODO Auto-generated method stub
		
	}

	public void saveOrUpdate(Hospital hospital) {
		// TODO Auto-generated method stub
		
	}

	
}
