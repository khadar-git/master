package org.redquark.aem.tutorials.core.j2ee;

//Java program to Reverse a String.

import java.util.*;

public class ReverseString
{
  public static void main(String args[]){
      String str;
      String x="value";
      
      
      System.out.println(x.charAt(0));
      
      String rStr;
      int a=1;
     Scanner scanner=new Scanner(System.in);
       
      //input an integer number
      System.out.print("Enter any string: ");
         str= scanner.nextLine();
     // str=bf.nextLine(); // Hello    0 1 2 3 4     index
     // str="Satish";
      
      
      //Reversing String
      rStr="";
      
     
    	  
      
      for(int loop=str.length()-1; loop>=0; loop--) {
          rStr= rStr + str.charAt(loop); // rstr =olleh
      }
       
      System.out.println("Reversed string is: " + rStr);
  }
}
