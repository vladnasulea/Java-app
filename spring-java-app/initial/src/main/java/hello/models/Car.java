package hello.models;


import java.util.List;
import java.util.ArrayList;

public class Car {
	private int id;
	private String brand;
	private int serialNumber;
	private int year;

	public Car(){}

	public Car(int id,int serialNumber,int year,String brand){
		this.id=id;
		this.serialNumber=serialNumber;
		this.year=year;
		this.brand=brand;
	}

	public int getId(){
		return this.id;
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


