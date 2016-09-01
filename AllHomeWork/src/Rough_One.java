import java.util.*;

import javax.script.ScriptContext;

import Homework.My_Test;

public class Rough_One {
	public void middleNumber(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your First Number : ");
		int firstNum = sc.nextInt();
		System.out.print("Enter Your Second Number : ");
		int secondNumber = sc.nextInt();
		System.out.print("Enter Your First Number : ");
		int thiredNumber = sc.nextInt();
int max = Math.max(Math.max(firstNum, secondNumber),thiredNumber);
int min = Math.min(Math.min(firstNum, secondNumber),thiredNumber);

if (firstNum>min && firstNum<max) {
	System.out.println("Your Middle Number Is : "+firstNum);	
}
else if (secondNumber>min && secondNumber<max) {
	System.out.println("Your Middle Number Is : "+secondNumber);
}
else System.out.println("Your Middle Number Is : "+thiredNumber);


	}
	
	
	
	public void max_min_Numbers(){
		int a =100;
		int b= 200;
		int c= 211;
		System.out.println("The Math.Max is ( "+ a + " and " + b + ") = "+Math.max(Math.max(a, b),c));
		System.out.println("The Math.Min is ( "+ a + " and " + b + ") = "+Math.min(Math.min(a, b),c));
	}
	
	
	public void max_min_Numbers_Dynamic(){
		int [] numberList = new int[] {90, 33, 23, 59, 48, 39, 91,27,54,71,98, 89, 87, 8};
		int largNumber = numberList[0];
		int smallNumber= numberList[0];
		for (int i = 0; i < numberList.length; i++) {
			if (numberList[i]>largNumber)
			largNumber=numberList[i];
			else if (numberList[i]<smallNumber)
			smallNumber = numberList[i];
			}
		System.out.println("Total Number of the Langht in the list are : " +numberList.length);
		System.out.println("The Highest Number in the List is : " +largNumber);
		System.out.println("The Smallest Number in the List is : " +smallNumber);
	}
	
	
	
	public void piramide() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your row Number for Peramid");
		int rowNum = sc.nextInt();
		System.out.println("Here is your Peramid !!");

		for (int i = 0; i < rowNum; i++) {
			for (int j = 0; j < rowNum - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public void absDynamic() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you desire Number");
		int myNum = sc.nextInt();
		if (myNum < 0) {
			System.out.println("its not an Absulute Value :" + myNum);
		} else if (myNum > 0) {
			System.out.println("Perfact!! this is an Absulute value :" + myNum);
		}
	}

	public void absStatic() {
		int a = -10;
		double d = -0.20456543;

		System.out.println("The first average value of" + a + " is :" + Math.abs(a));
		System.out.println("The first average value of" + d + " is :" + Math.abs(d));
	}

	public void averageValue() {
		int[] numberes = new int[] { 11, 22, 3, 3, 4, 4, 5, 5, 6, 77, 8, 8 };
		int realNumber = 0;
		for (int i = 0; i < numberes.length; i++)
			realNumber = realNumber + numberes[i];
		double totalAverage = realNumber / numberes.length;
		System.out.println("this is your average Number : " + totalAverage);

	}

	public void febonachchi() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num");
		int fab = sc.nextInt();
		System.out.println("here you go");
		int a = 0;
		int b = 1;
		int result = 0;
		for (int i = 0; i < fab; i++) {
			result = a + b;
			System.out.print(result + " ");
			a = b;
			b = result;
		}

	}
	public void piramid(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		int numbers = sc.nextInt();
		System.out.println("Here your Peramid : " );
		for (int i = 0; i < numbers; i++) {
			for (int j = 0; j < numbers-i; j++) {
			System.out.print(" ");	
			}
			for (int k = 0; k <=i; k++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
	}
public void row_column(){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter Number Of Column");
	int columnNumb = input.nextInt();
	System.out.println("Enter Number Of Rows");
	int rowsNumb = input.nextInt();
	System.out.println("Here you Go!! " );
	
	for (int i = 0; i < columnNumb; i++) {
		for (int j = 0; j < rowsNumb; j++) {
			System.out.print("*");
		}
		System.out.println(" ");
	}
	
}
	public void primeNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		int numbers = sc.nextInt();
		System.out.println("Here your Prime numbers for : " + numbers);
		for (int i = 1; i < numbers; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				System.out.println(i + ",");
			}

		}

	}

}
