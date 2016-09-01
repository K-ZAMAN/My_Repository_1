
import java.util.Scanner;

import Homework.My_Test;

public class perimide {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("How Many Rows You Want In Your Pyramid?");
		int rowsNum = scanner.nextInt();
		// int rowCount = 1;
		System.out.println("Here Is Your Pyramid");

for (int i = 0; i < rowsNum; i++) {
	for (int j = 0; j < rowsNum-i; j++) {
		System.out.print(" ");
	}
	for (int k = 0; k <=i; k++) {
		System.out.print("* ");
	}
	System.out.println();
}
}
	 }