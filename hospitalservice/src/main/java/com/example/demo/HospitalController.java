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

import com.example.demo.Hospital;
import com.example.demo.HospitalService;
@Controller
@RestController
	public class HospitalController {
		
		@RequestMapping("/hospitals")
		public ModelAndView home1() {
			ModelAndView model=new ModelAndView("hospitals");
			
			//ModelAndView m=new ModelAndView("color");
			RestTemplate resttemplate=new RestTemplate();
			
			Hospitals result=resttemplate.getForObject("http://localhost:8086/hospitals/hospital",Hospitals.class);
			System.out.println(result);
			//System.out.println(result.getColo());
			model.addObject("hospitals",result.gethosp());
		
			return model;
			
			
		}
		@Autowired  
		HospitalService HService;  
		//creating a get mapping that retrieves all the books detail from the database   
		@GetMapping("/hospital")  
		private List<Hospital> getAllHospital()   
		{  
		return HService.getAllHospital();  
		}  
		//creating a get mapping that retrieves the detail of a specific book  
		@GetMapping("/hospital/{name}")  
		private Hospital getHospital(@PathVariable("name") Hospital name)   
		{  
		return HService.getHospitalByName(name);  
		}  
		//creating a delete mapping that deletes a specified book  
		@DeleteMapping("/hospital/{name}")  
		private void deleteHospital(@PathVariable("name") String name)   
		{  
			HService.delete(name);  
		}  
		//creating post mapping that post the book detail in the database  
		@PostMapping("/hospital")  
		private String saveHospital(@RequestBody Hospital hospital)   
		{  
			HService.saveOrUpdate(hospital);  
		return hospital.getName();  
		}  
		//creating put mapping that updates the book detail   
		@PutMapping("/hospital")  
		private Hospital update(@RequestBody Hospital hospital)   
		{  
			HService.saveOrUpdate(hospital);  
		return hospital;  
		}  
}