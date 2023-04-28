package org.redquark.aem.tutorials.core.j2ee;

//Java program for Prime Number

import java.util.*;

public class PrimeNumber
{
  public static void main(String args[]){
      int num,loop;
      boolean flag=false;
       
      Scanner bf=new Scanner(System.in);
       
      //input an integer number
      System.out.print("Enter any integer number: ");
      num= bf.nextInt();
       
      //check prime
      for(loop=2; loop<=(num/2); loop++)
      {
    	  System.out.println("loop :: "+loop);
    	  System.out.println("numb "+ num);
          if(num%loop==0)
          {
              flag=true;
              break;
          }
      }
       
      if(flag==false)
          System.out.println(num + " is a prime number.");
      else
          System.out.println(num + " is not a prime number.");
  }
}
