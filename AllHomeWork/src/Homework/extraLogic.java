package Homework;
import java.util.Scanner;

import javax.annotation.processing.RoundEnvironment;

public class extraLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scraner = new Scanner(System.in);
		System.out.println("Enter Your Row Number: ");
		int rowNum = scraner.nextInt();
		System.out.println("This is your Pyramid: " + rowNum);


		for (int i = 0; i <rowNum; i++) {
			for (int j = 0; j <rowNum-i; j++) {
				System.out.print(" ");
			}
		
			for (int k = 0; k <=i; k++) {
				System.out.print("* ");
			}
		

			if (i == (rowNum - 1)) {
				break;
			}
			System.out.println();
	
		}

	}

}
