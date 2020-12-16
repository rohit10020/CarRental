package com.deloitte.car.data;

import java.util.ArrayList;

import com.deloitte.car.module.CarList;
import com.deloitte.car.module.CarRental;


public class Cardata {
	
	static CarList carlist = new CarList();

    public static CarList getCardataList() {
        ArrayList<CarRental> mycars = new ArrayList<>();
        mycars.add(new CarRental("Maruti","zx",2200.8,4,1000.5,"nice one",true));
        mycars.add(new CarRental("Honda","somt",22300.8,6,13000.5,"nice one",true));
        mycars.add(new CarRental("Hyundai","zx",25200.8,8,16000.5,"nice one",false));
        mycars.add(new CarRental("Audi","lx",21200.8,3,10000.5,"nice one",true));
        mycars.add(new CarRental("BMW","sx",22600.8,2,10700.5,"nice one",false));
        mycars.add(new CarRental("Benz","wx",22200.8,4,19000.5,"nice one",true));
   
        carlist.setCarlist(mycars);
        return carlist;
    }

}
