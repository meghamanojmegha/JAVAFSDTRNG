package com.example.demo;

import org.springframework.data.mongodb.core.mapping.Document;



public class Patient {

	private int id;  
	
	private String name;  
	 
	private int age;  
	
	public int getId()   
	{  
	return id;  
	}  
	public void setId(int id)   
	{  
	this.id = id;  
	}  
	public String getName()  
	{  
	return name;  
	}  
	public void setName(String name)   
	{  
	this.name = name;  
	}  
	
	public int getAge()   
	{  
	return age;  
	}  
	public void setAge(int age)   
	{  
	this.age = age;  
	}
	public Patient orElseThrow(Patient patient) {
		
		return null;
	}  

}  