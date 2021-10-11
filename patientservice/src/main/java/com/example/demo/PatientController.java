package com.example.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Patient;
import com.example.demo.PatientService;
@RestController
@RequestMapping("/patients")
public class PatientController {
	@Autowired
	private PatientService PService;

	@GetMapping("/patients")
	public List<Patient> getAllEmployees() {
		return PService.findAll();
	}

	@GetMapping("/patients/{id}")
	public Patient getEmployeeById(@PathVariable(value = "id")  Long patientId){
			
		Long patient = PService.findById(patientId);
		if(patient==null) {
			 return   (Patient) ResponseEntity.status(HttpStatus.NOT_FOUND);
	}
		return ResponseEntity.ok().body(patient);
	}

	@PostMapping("/patients")
	public Patient createEmployee( @RequestBody Patient patient) {
		return PService.save(patient);
	}

	@PutMapping("/patients/{id}")
	public ResponseEntity<Patient> updateEmployee(@PathVariable(value = "id") Long patientId,
			 @RequestBody Patient employeeDetails) throws ResourceNotFoundException {
		Patient patient = PService.findById(patientId)
				.orElseThrow(() -> new ResourceNotFoundException("204:: " + patientId));

		patient.setId(employeeDetails.getId());
		patient.setName(employeeDetails.getName());
		patient.setAge(employeeDetails.getAge());
		final Patient updatedEmployee = PService.save(patient);
		return ResponseEntity.ok(updatedEmployee);
	}

	@DeleteMapping("/patients/{id}")
	public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long patientId)
			throws ResourceNotFoundException {
		Patient employee = PService.findById(patientId)
				.orElseThrow(() -> new ResourceNotFoundException("200 :: " + patientId));

		PService.delete(employee);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}