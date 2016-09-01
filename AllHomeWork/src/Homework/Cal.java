package Homework;

import java.awt.Window;
import java.io.Closeable;
import java.util.Scanner;

public class Cal {

	public static void main(String[] args) {
		Scanner scranner = new Scanner(System.in);
		System.out.println("Choose an Calculation from Bellow List");
		System.out.println("1.Add\n" + "2.Sub\n" + "3.Mul\n" + "4.Div\n" + "5.Exit");

		int selectOption;

		do {

			{
				selectOption = scranner.nextInt();
				if (selectOption < 5) {
					System.out.println("Enter Your First Number: ");
					int i = scranner.nextInt();
					System.out.println("Enter Your Second Number:");
					int j = scranner.nextInt();

					if (selectOption == 1) {

						System.out.println("Your Answer Is : " + i + "+" + j + "=" + (i + j));
						System.out.println("------------------------------------------");
					} else if (selectOption == 2) {
						System.out.println("Your Answer Is : " + i + "-" + j + "=" + (i - j));
						System.out.println("------------------------------------------");
					} else if (selectOption == 3) {
						System.out.println("Your Answer Is : " + i + "*" + j + "=" + (i * j));
						System.out.println("------------------------------------------");
					} else if (selectOption == 4) {
						System.out.println("Your Answer Is : " + i + "/" + j + "=" + (i / j));
						System.out.println("------------------------------------------");
					}

				}

				// System.out.print("This is your Result"+ selectOption );
			}

		} while (selectOption < 5);
		System.out.print("The Number " + selectOption + " is Not in Calculation List");
		System.out.print("Thank You Have a Good Day");
	}
}
