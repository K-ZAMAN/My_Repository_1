package Homework;
import java.awt.Window;
import java.io.Closeable;
import java.util.Scanner;

public class New_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

	}
}
