package org.redquark.aem.tutorials.core.j2ee;

/*Java program to print Fibonacci Series.*/

import java.util.Scanner;

public class fibnocciNumber {
  public static void main(String[] args) {
    int SeriesNum;
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the length of fibonacci series : ");
    SeriesNum = sc.nextInt();

   
    
    int a=1; /// only one store 
    
    int [] b= new int[10]; // b[0],b[1],b[2]....b[9]
    
    
    int[] num = new int[SeriesNum]; /// int [] num
    num[0] = 0;
    num[1] = 1;
    //number should be sum of last two numbers of Series     
    for (int i = 2; i < SeriesNum; i++) {
    	
      num[i] = num[i - 1] + num[i - 2];
    }

    System.out.println("fibonacci series : ");
    for (int i = 0; i < SeriesNum; i++) {
      System.out.print(num[i] + " ");
    }
    
  }
}
