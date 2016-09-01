package Homework;
import java.io.BufferedReader;
import java.io.InputStream;
import java.util.Scanner;

import javax.xml.ws.soap.Addressing;

public class NewMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}

	public int addition(int firstNumber, int secondNumber)
	{
		int result = firstNumber + secondNumber;
		System.out.println("The Total Additional Calculation is : " + result);

		return 0;
	}

	public static int substruction(int firstNumber, int secondNumber) {
		int result = firstNumber-secondNumber;
		System.out.println("The Total Substructional Calculation is : " + result);
		return 0;
	}

	public static int Multiplicatioh(int firstNumber, int secondNumber) {

		int result =  firstNumber* secondNumber;
		System.out.println("The Total Multiplicational Calculation is : " + result);
		return 0;
	}

	public static int Division(int firstNumber, int secondNumber) {
		int result =  firstNumber / secondNumber;
		System.out.println("The Total Divisional Calculation is : " + result);
		return 0;

	}

	public static int EvenNumber(int eNumber) {
		System.out.print("Here is your EVEN Number : ");
		int a = eNumber;
		for (int i = 0; i < eNumber; i++) {
			if (i % 2 == 0) {
				System.out.print("  " + i);
			}
			// System.out.println();
		}
		return 0;

	}

	public static int OddNumber(int oNumber) {
		System.out.print("Here is your ODD Number : ");
		int a = oNumber;
		for (int i = 0; i < oNumber; i++) {
			if (i % 2 != 0) {
				System.out.print(" " + i);
			}

		}
		return 0;
	}

	public static int FactorialNumber(int factorialN) {
		System.out.print("Here is your Factorial : ");
		// int i = 1;
		int factorial = 1;
		for (int i = 1; i < factorialN; i++) {
			factorial = factorial * i;
			System.out.print(factorial + " ");
		}

		return 0;

	}

	public static int Febonaci(int fNumber) {
		System.out.print("Here is your Febonaci : ");

		int a = 0;
		int b = 1;
		int result = 0;
		for (int i = 1; i < fNumber; i++) {
			result = a + b;
			System.out.print("  " + result);
			a = b;
			b = result;
		}
		return 0;

	}

	// Pyramid....
	public static int Pyramid(int rowNUm) {
		System.out.println("Here is your Pyramid : ");
		int a = 0;
		for (int i = 0; i <= rowNUm; i++) {
			for (int j = 0; j < rowNUm - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		return 0;
	}
	public static int calculator(){
		Scanner scranner = new Scanner(System.in);
		System.out.println("Enter a number from Below list. " + "\n" + "Only Chose the given Number on your Left had side");
		System.out.println("1. Add\n" + "2. Sub\n" + "3. Mul\n" + "4. Div");

		int selectOption;
		do {
			{
				selectOption = scranner.nextInt();
				if (selectOption < 5)	{
				System.out.println("Plese Enter your First Number : ");
				int i = scranner.nextInt();
				System.out.println("Please Enter Your Scond Number : ");
				int j = scranner.nextInt();

				if (selectOption == 1) {
					System.out.println("Your Answer Is : " + i + "+" + j + "=" + (i + j));
				} else if (selectOption == 2) {
					System.out.println("Your Answer Is : " + i + "-" + j + "=" + (i - j));
				} else if (selectOption == 3) {
					System.out.println("Your Answer Is : " + i + "*" + j + "=" + (i * j));
				} else if (selectOption == 4) {
					System.out.println("Your Answer Is : " + i + "/" + j + "=" + (i / j));
				}
				}
			}
		} while (selectOption < 5);
		System.out.print("Number " + selectOption + " is Not in The Calculation List. ");
		System.out.print("Thank You, Have a Good Day!!!");

		return 0;
		
	}

}



















