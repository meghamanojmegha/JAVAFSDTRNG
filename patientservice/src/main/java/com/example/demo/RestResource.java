package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Patient;
import com.example.demo.Patients;

@RestController
@RequestMapping("/patients")
public class RestResource {
	@RequestMapping("/patient")
	public Patients getColors()
	
	{
		List<Patient> patients = new ArrayList<>();
		Patient c1 = new Patient();
		c1.setId(1);
		c1.setName("Megha");
		c1.setAge(24);
		
		
		patients.add(c1);
		
		Patients colorlist=new Patients(patients);
		
		return colorlist;
	}
	
}
