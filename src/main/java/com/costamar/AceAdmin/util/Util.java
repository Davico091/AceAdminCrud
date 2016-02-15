package com.costamar.AceAdmin.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {

	public static String parseDate(String input){
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		String output=null;
		try {
			Date date = sdf1.parse(input);
			sdf1 = new SimpleDateFormat("yyyy/MM/dd");
			output = sdf1.format(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return output;
	}
	
}
