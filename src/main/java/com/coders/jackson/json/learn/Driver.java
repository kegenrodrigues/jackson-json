package com.coders.jackson.json.learn;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		
		
		try{
			//create object mapper
			ObjectMapper mapper = new ObjectMapper();
			
			//read JSON file and map/convert to java POJO: data sample-lite.json
			Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);
			
			//print first name and last name
			System.out.println(theStudent.getFirstName());
			System.out.println(theStudent.getLastName());
			
			Address theAddress = theStudent.getAddress();
			System.out.println("City : "+theAddress.getCity());
			System.out.println("Country : "+theAddress.getCountry());
			
			for(String tempLang : theStudent.getLanguages()) {
				System.out.println(tempLang);
			}
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}
		
	}

}
