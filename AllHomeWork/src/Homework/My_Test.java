package Homework;
import java.util.Scanner;

public class My_Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many rows do you want to count: ");
		int rows = scanner.nextInt();
		System.out.println("How many Column do you want to count: ");
	 	int column = scanner.nextInt();

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(" * ");
			}
				
		System.out.println(" "+"\n");
		}

		
				
	}
	}
		