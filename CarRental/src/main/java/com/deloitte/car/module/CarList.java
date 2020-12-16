package com.deloitte.car.module;

import java.util.ArrayList;
import java.util.List;



public class CarList {
	
	   List<CarRental> carlist;

	public CarList(List<CarRental> carlist) {
		super();
		this.carlist = carlist;
	}

	public CarList() {
		// TODO Auto-generated constructor stub
	}

	public List<CarRental> getCarlist() {
		return carlist;
	}

	public void setCarlist(List<CarRental> carlist) {
		this.carlist = carlist;
	}

	

}
