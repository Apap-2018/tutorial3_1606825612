package com.apap.tutorial3.service;

import java.util.List;

import com.apap.tutorial3.model.CarModel;

/**
 * Car Service
 * @author zhelialifa
 *
 */

public interface CarService {
	
	void addCar(CarModel car);
	
	List<CarModel> getCarList();
	
	CarModel getCarDetail(String id);
	
	CarModel deleteCar(String id);

}
