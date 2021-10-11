package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Hospital;
import com.example.demo.Hospitals;

@RestController
@RequestMapping("/hospitals")
public class RestResource {
	@RequestMapping("/hospital")
	public Hospitals getColors()
	
	{
		List<Hospital> hospitals = new ArrayList<>();
		Hospital c1 = new Hospital();
		
		c1.setName("Megha");
		
		
		
		hospitals.add(c1);
		
		Hospitals colorlist=new Hospitals(hospitals);
		
		return colorlist;
	}
	
}
