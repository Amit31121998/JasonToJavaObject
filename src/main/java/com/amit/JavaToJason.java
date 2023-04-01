package com.amit;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJason {
	
	public static void main(String[] args) {
		
		Employee e=new Employee(1,"Amit","TCS");
		ObjectMapper omp=new ObjectMapper();
		
		try {
			String asString = omp.writeValueAsString(e);
			System.out.println(asString);
			
			
		} catch (JsonProcessingException e2) {
			e2.printStackTrace();
		}
	}

}
