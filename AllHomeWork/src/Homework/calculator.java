package Homework;
import java.awt.Window;
import java.io.Closeable;
import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner scranner = new Scanner(System.in);
		System.out.println("Choose an Calculation from bellow list:");
		System.out.println("1.Add\n" + "2.Sub\n" + "3.Mul\n" + "4.Div\n" + "5.Exit");

		int optionNumber;

		do {

			optionNumber = scranner.nextInt();
			if (optionNumber<5) {
				System.out.print("Write your first Number: ");
				int i = scranner.nextInt();
				System.out.print("Write your second Number: ");
				int j = scranner.nextInt();

				if (optionNumber == 1) {
					System.out.print(i + j);
				} else if (optionNumber == 2) {
					System.out.print(i - j);
				} else if (optionNumber == 3) {
					System.out.print(i * j);
				} else if (optionNumber == 4) {
					System.out.print(i / j);
				}
			}

		}

		while (optionNumber < 5);
		System.out.print("There is no any calculation left.because " + optionNumber + " is only for exit option.");
	}
}
