package hello.controllers;

import hello.models.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.ArrayList;



@RestController
public class CarController{
	private List<Car> cars = new ArrayList<Car>();

	CarController(){
		Car p1 = new Car(1,500,2005,"Fiat");
		Car p2 = new Car(2,200,2006,"Skoda");
		Car p3 = new Car(3,124,2011,"Ford");
		Car p4 = new Car(4,1000,2015,"Peugeot");

		cars.add(p1);
		cars.add(p2);
		cars.add(p3);
		cars.add(p4);
	}

	@RequestMapping(value="/car",method = RequestMethod.GET)
	public List<Car> index(){
		return this.cars;
	}

	
	@RequestMapping(value="/car/{id}",method = RequestMethod.GET)
	public ResponseEntity show(@PathVariable("id") int id){
		for(Car p : this.cars){
			if(p.getId() == id){
				return new ResponseEntity<Car>(p,new HttpHeaders(),HttpStatus.OK);
			}
		}
		return new ResponseEntity<String>(null,new HttpHeaders(),HttpStatus.NOT_FOUND);
	}


	@RequestMapping(value="/car/", method = RequestMethod.POST)
	  public ResponseEntity create() {

	Car p = new Car(4,172,2011,"Mazda");
	 	this.cars.add(p);
	        return new ResponseEntity<Car>(p, new HttpHeaders(), HttpStatus.OK);
	    

	}


	@RequestMapping(value="/car/{id}", method = RequestMethod.PUT)
	  public ResponseEntity update(@PathVariable("id") int id) {
	    for(Car p : this.cars) { 
	      if(p.getId() == id) { p.setBrand("Audi");
	        return new ResponseEntity<Car>(p, new HttpHeaders(), HttpStatus.OK);
	      	}
	    }
	    return new ResponseEntity<String>(null, new HttpHeaders(), HttpStatus.NOT_FOUND);
	}



	
	@RequestMapping(value="/car/{id}",method = RequestMethod.DELETE)
	public ResponseEntity remove(@PathVariable("id") int id){
		for(Car p : this.cars){
			if(p.getId() == id){
				this.cars.remove(p);
				return new ResponseEntity<String>(null,new HttpHeaders(),HttpStatus.NO_CONTENT);
			}
		}
		return new ResponseEntity<String>(null,new HttpHeaders(),HttpStatus.NOT_FOUND);
	}





}