package com.zaman.test1;

public class newold {

	public static void main(String[] args) {
		
		 // TODO Auto-generated method stub
		int[] myList = new int[4];
		myList[0]=909;
		myList[1]=232;
		myList[2]=122;
		myList[3]=872;
		
		
		//{10, 39, 34, 90,70,45};

	      // Print all the array elements
	      for (int i = 0; i < myList.length; i++) {
	         System.out.println(myList[i]);
	      }
     // Summing all elements
	      int total = 0;
	      for (int i = 0; i < myList.length; i++) {
	    	  
	    	  total =total+myList[i];
	    		  //total += myList[i];
	      }
	       System.out.println("Total is: " + total);	 
	        // Finding the largest elementp
	      int max = myList[0];
	      for (int i = 1; i < myList.length; i++) {
	         if (myList[i] > max)max = myList[i];
	      }
	      System.out.println("Max is " + max);		
		}

	}

