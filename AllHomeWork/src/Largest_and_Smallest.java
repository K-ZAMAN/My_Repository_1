import java.util.*;

public class Largest_and_Smallest {

	public static void main(String[] args) {

		int[] numbers = new int[] { 90, 33, 23, 59, 48, 392, 98, 89, 87, 8 };
		int largestNumber = numbers[0];
		int smallestNumber = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > largestNumber)
				largestNumber = numbers[i];
			else if (numbers[i] < smallestNumber)
				smallestNumber = numbers[i];

		}
System.out.println("The Largest Number on this List is : "+ largestNumber);
System.out.println("The Smallest Number on this List is : "+ smallestNumber);
	}

}
