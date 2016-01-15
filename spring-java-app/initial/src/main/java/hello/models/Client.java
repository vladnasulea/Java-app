package hello.models;

import java.util.List;
import java.util.ArrayList;

public class Client {
	private int id;
	private String name;
	private int client_code;
	private int billing_code;

	public Client(){}

	public Client(int id,int client_code,int billing_code,String name){
		this.id=id;
		this.client_code=client_code;
		this.billing_code=billing_code;
		this.name=name;
	}

	public int getId(){
		return this.id;
	}

	public String getName(){
		return this.name;
	}

	public int getClientCode(){
		return this.client_code;
	}

	public int getBillingCode(){
		return this.billing_code;
	}
	public void setName(String Name) {
		this.name=Name;    
  	}
}


