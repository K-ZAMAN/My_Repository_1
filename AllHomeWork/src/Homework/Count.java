package Homework;
import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 22, 3, 4, 4, 4, 54, 54, 54, 65, 65, 65, 65, 65, 76, 87 };
		System.out.println("Total Number of data is : " + a.length);
		Scanner sc = new Scanner(System.in);
		System.out.println("Put your Desire Index number\n");
		int rownum = sc.nextInt();
		System.out.println("Here your number : ");
		
		System.out.println(a[rownum-1]);		}


		
		
	}


