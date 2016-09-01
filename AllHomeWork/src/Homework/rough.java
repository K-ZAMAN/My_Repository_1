package Homework;
import java.util.Scanner;

public class rough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Type your desire Number: ");
		int rowNum= scanner.nextInt();
		System.out.println("Here Is Your Pyramid :" +rowNum);
		int rowCount=1;
		for ( int i=0; i<rowNum; i++)
		{
			for (int j=0; j<=rowNum-i; j++){
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
		

	}

}
