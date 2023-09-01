package funtionsInJava;

import CoreJava.ArrayList;

public class FuntionTest {
	
	public void main(String[] args) {
		FuntionTest ft = new FuntionTest();
		ft.getCityName("Rio");
	
		
	}
  
 

	
	public String getCityName(String cityname) 
	{
		System.out.println("get city name method");
		if(cityname.equals("Hyderabad")) {
			return "India";
		}
		else if(cityname.equals("Rio")){
			return "Brazil";
		}
		else if(cityname.equals("New York")){
			return "USA";
		}
	return cityname;
}
}