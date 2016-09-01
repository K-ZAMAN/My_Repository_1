package Homework;
import java.util.Scanner;

public class pyramid {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many rows do you want to count: ");
		int rowNum = scanner.nextInt();
		//System.out.println("Here is your Pyramid : " + rowNum);

		for (int i = 0; i <= rowNum; i++) {
			for (int j = 0; j <= rowNum; j++) {
				System.out.print(" * ");
			}
				
		System.out.println(" ");
		}

	}

}