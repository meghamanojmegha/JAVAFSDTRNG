package com.example.demo;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Patient;
import com.example.demo.PatientService;
@Controller
@RestController
	public class PatientController {
		
		@RequestMapping("/patients")
		public ModelAndView home1() {
			ModelAndView model=new ModelAndView("patients");
			
			//ModelAndView m=new ModelAndView("color");
			RestTemplate resttemplate=new RestTemplate();
			
			Patients result=resttemplate.getForObject("http://localhost:8085/patients/patient",Patients.class);
			System.out.println(result);
			//System.out.println(result.getColo());
			model.addObject("patients",result.getpat());
		
			return model;
			
			
		}
  
	
	@Autowired  
	PatientService PService;  
	//creating a get mapping that retrieves all the books detail from the database   
	@GetMapping("/patient")  
	private List<Patient> getAllPatient()   
	{  
	return PService.getAllPatient();  
	}  
	//creating a get mapping that retrieves the detail of a specific book  
	@GetMapping("/patient/{id}")  
	private Patient getPatient(@PathVariable("id") Patient id)   
	{  
	return PService.getPatientById(id);  
	}  
	//creating a delete mapping that deletes a specified book  
	@DeleteMapping("/patient/{id}")  
	private void deletePatient(@PathVariable("id") int id)   
	{  
		PService.delete(id);  
	}  
	//creating post mapping that post the book detail in the database  
	@PostMapping("/patient")  
	private int savePatient(@RequestBody Patient patient)   
	{  
		PService.saveOrUpdate(patient);  
	return patient.getId();  
	}  
	//creating put mapping that updates the book detail   
	@PutMapping("/patient")  
	private Patient update(@RequestBody Patient patient)   
	{  
		PService.saveOrUpdate(patient);  
	return patient;  
	}  
	  
	
}