package com.example.demo;
import java.util.List;

import com.example.demo.Hospital;

public class Hospitals {
	List<Hospital> hosp;

	public Hospitals(List<Hospital> hosp) {
		super();
		this.hosp = hosp;
	}

	public List<Hospital> gethosp() {
		return hosp;
	}

	public Hospitals() {
		super();
	}

	public void sethosp(List<Hospital> hosp) {
		this.hosp = hosp;
	}

	@Override
	public String toString() {
		return "hosps [hosp=" + hosp + "]";
	}

}
