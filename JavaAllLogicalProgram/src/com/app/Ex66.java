package com.app;

import java.util.HashMap;
import java.util.Map;

public class Ex66 {
	
	public static void main(String[] args) {
	      String s1="APPENSURE";
	      int val=1;
	      Map<Character,Integer> map=new HashMap<>();
	      for(int i=0;i<s1.length();i++) {
	    	  char ch=s1.charAt(i);
	    	  System.out.println(ch+" ");
	    	 if(map.containsKey(ch))
	    	 {
	    		 int value=map.get(ch);
	    		 map.put(ch,value+1);
	    	 }
	    	 else
	    	 {
	    		 map.put(ch, val);
	    	 }
	    	  
	      }
	      System.out.println(map);	      
}
}