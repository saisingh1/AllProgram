package com.app;

import java.util.Scanner;

public class QuadraticSequencesDynamic {
	
	    
	   public static void main(String[] args) {
		   int j=0;
		 System.out.println("Enter the number::");
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
      
		
         if(n!=0) {	 
	 for(int i=1; i<=n; i++) { 
		 j+=i;
		 System.out.println(j+",");
		 
         }
}
	   }
}

