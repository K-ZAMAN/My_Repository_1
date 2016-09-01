package precties1;

import java.util.Scanner;

public class jsa {
	public static void main(String[] args) {
int [] numbers = new int[]{1,2,3,4,5,6,7,8,9,5,4,3,2,2,1}; 
		int largestnumber = numbers[0];
		int smallestNumber = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i]> largestnumber) 
				largestnumber=numbers[i];
			
			else if (numbers[i]<smallestNumber) 
				smallestNumber=numbers[i];
			
			
		}
		System.out.println(largestnumber);
		System.out.println(smallestNumber);
		
		
	}
}