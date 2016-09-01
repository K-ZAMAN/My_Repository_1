package Homework;

import java.util.Scanner;

public class return1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your desired nuber");
	int factorialN = sc.nextInt();
	System.out.print("Here is your Factorial : ");
			// int i = 1;
			int factorial = 1;
			for (int i = 1; i <factorialN; i++) {
				factorial = factorial * i;
				System.out.print(factorial + " ");
			}

}
}
