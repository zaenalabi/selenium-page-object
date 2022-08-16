package com.juaracoding.selenium;

//import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {
//		Date today = new Date();
//		System.out.println(today);
		
		String input = "12/08/2022 07:10:10 PM";
		DateFormat formatDate = new SimpleDateFormat("dd/MM/yyy hh:mm:ss aa");
		DateFormat outputDate = new SimpleDateFormat("dd/MM/yyy hh:mm:ss");
		Date date = null;
		String output = null;
		
		try {
			date = formatDate.parse(input);
			output =  outputDate.format(date);
			System.out.println(output);
		} catch (java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
