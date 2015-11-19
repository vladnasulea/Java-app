package hello.models;


import java.util.List;
import java.util.ArrayList;

public class Car {
	private String brand;
	private int serialNumber;
	private int year;

	public Car(){}

	public Car(int serialNumber,int year,String brand){
		this.serialNumber=serialNumber;
		this.year=year;
		this.brand=brand;
	}

	public String getBrand(){
		return this.brand;
	}

	public int getSerialNumber(){
		return this.serialNumber;
	}

	public int getYear(){
		return this.year;
	}
	public void setBrand(String Brand) {
		this.brand=Brand;    
  	}
}


