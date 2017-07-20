package com.datawise;

import java.util.Date;
import java.text.*;

public class DateDemo {

   public static void main(String args[]) {
      // Instantiate a Date object
      Date date = new Date();
      
      String inputString = "03/13/2017";
      SimpleDateFormat ft = new SimpleDateFormat("MM/dd/yyyy");
      Date date2 = null;
      try {
    	  date2 = ft.parse(inputString);
      } catch (ParseException e) {
    	  
      }
      // display time and date using toString()
      System.out.println(date);
      
      //System.out.println(date.before(date2));
      System.out.println(date.compareTo(date2));
      System.out.println(date2.toString());

   }
}