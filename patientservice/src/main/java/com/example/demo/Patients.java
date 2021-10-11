package com.example.demo;

import java.util.List;

import com.example.demo.Patient;

public class Patients {
	List<Patient> pat;

	public Patients(List<Patient> pat) {
		super();
		this.pat = pat;
	}

	public List<Patient> getpat() {
		return pat;
	}

	public Patients() {
		super();
	}

	public void setpat(List<Patient> pat) {
		this.pat = pat;
	}

	@Override
	public String toString() {
		return "pats [pat=" + pat + "]";
	}

}
