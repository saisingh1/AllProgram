package com.app;

public class QuadraticSequencesStatic {
	
	
	 public static String getQuaricSequence(int n) {
         if(n!=0) {	 
	 for(int i=1; i<=1; i++) { 
		 if(n==2) {
			 System.out.println(i+"," +i*(i*3));
		 }else if(n==5) {
			 System.out.println(i+","+i*(i*3)+","+(i*6)+","+(i*10)+","+(i*15)+"");
		 }else if(n==10) {
			 System.out.println(i+","+i*(i*3)+","+(i*6)+","+(i*10)+","+(i*21)+","+(i*28)+","+(i*36)+","+(i*45)+","+(i*55)+"");
		 }
		  
	 }
         }
         
	    return "Data is Successful";
	 
	  }
	    
	   public static void main(String[] args) {
		   QuadraticSequencesStatic.getQuaricSequence(10);

}
	   }
