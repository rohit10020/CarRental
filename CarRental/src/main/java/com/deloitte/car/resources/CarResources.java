package com.deloitte.car.resources;

import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.car.data.Cardata;
import com.deloitte.car.module.CarList;


@RestController
@RequestMapping("/")
public class CarResources {
	
    @GetMapping("")
    public CarList getFoodItem() {
        return Cardata.getCardataList();
    }

    @GetMapping("/show/brand/Audi")
    public CarList getAudiCars() {
       CarList carlist = new CarList();
        carlist.setCarlist(
                Cardata.getCardataList().getCarlist().stream().filter(
                        CarRental -> CarRental.getBrandName().equals("Audi")
                ).collect(Collectors.toList()));
        return carlist;
    }
    @GetMapping("/show/brand/Benz")
    public CarList getBenzCars() {
       CarList carlist = new CarList();
        carlist.setCarlist(
                Cardata.getCardataList().getCarlist().stream().filter(
                        CarRental -> CarRental.getBrandName().equals("Benz")
                ).collect(Collectors.toList()));
        return carlist;
    }
    
    @GetMapping("/show/model/lx")
    public CarList getLxModel() {
       CarList carlist = new CarList();
        carlist.setCarlist(
                Cardata.getCardataList().getCarlist().stream().filter(
                        CarRental -> CarRental.getModel().equals("lx")
                ).collect(Collectors.toList()));
        return carlist;
    }
    
    @GetMapping("/show/model/zx")
    public CarList getZxModel() {
       CarList carlist = new CarList();
        carlist.setCarlist(
                Cardata.getCardataList().getCarlist().stream().filter(
                        CarRental -> CarRental.getModel().equals("zx")
                ).collect(Collectors.toList()));
        return carlist;
    }



}
