package com.datawise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches2 {

   public static void main( String args[] ) {
      // String to be scanned to find the pattern.
      String line = "12/04/2017";
      String pattern = "([0-9]{2})/([0-9]{2})/([0-9]{4})";

      // Create a Pattern object
      Pattern r = Pattern.compile(pattern);

      // Now create matcher object.
      Matcher m = r.matcher(line);
      
      int grpCnt = m.groupCount();
      System.out.println("Group Count: "+grpCnt);
      
//      if (m.find()) {
//    	  for(int i=1; i<= grpCnt; i++) {
//    		  System.out.println("Found value: " + m.group(i) );
//    	  }
//      } else {
//         System.out.println("NO MATCH");
//      }
      

	   while (m.find()) {
		   System.out.println("MATCH");
		   for(int i=1; i<= grpCnt; i++) {
			  System.out.println("Found value: " + m.group(i) );
		   }
	  } 
      

   }
}
