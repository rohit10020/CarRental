package com.deloitte.car.module;

import org.springframework.stereotype.Component;

@Component
public class CarRental {
	
	String brandName;
	String model;
	Double engineCapacity;
	Integer numberOfCylinders;
	Double priceForOneDay;
	String description;
	boolean availability;
	
	public CarRental()
	{
		
	}
	
	public CarRental(String brandName, String model, Double engineCapacity, Integer numberOfCylinders,
			Double priceForOneDay, String description, boolean availability) {
		super();
		this.brandName = brandName;
		this.model = model;
		this.engineCapacity = engineCapacity;
		this.numberOfCylinders = numberOfCylinders;
		this.priceForOneDay = priceForOneDay;
		this.description = description;
		this.availability = availability;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Double getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(Double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public Integer getNumberOfCylinders() {
		return numberOfCylinders;
	}

	public void setNumberOfCylinders(Integer numberOfCylinders) {
		this.numberOfCylinders = numberOfCylinders;
	}

	public Double getPriceForOneDay() {
		return priceForOneDay;
	}

	public void setPriceForOneDay(Double priceForOneDay) {
		this.priceForOneDay = priceForOneDay;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	

	@Override
	public String toString() {
		return "CarRental [brandName=" + brandName + ", model=" + model + ", engineCapacity=" + engineCapacity
				+ ", numberOfCylinders=" + numberOfCylinders + ", priceForOneDay=" + priceForOneDay + ", description="
				+ description + ", availability=" + availability + "]";
	}	
	
	
	
	
	
	
	


}
