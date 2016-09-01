

import java.util.Scanner;

/* Factorial,
* Fabonacci Number
*/
public class Fabonacci {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Desir Number : ");
		int fabNacci=sc.nextInt();
		System.out.print("Here You Go : ");
		
				
		int a = 0;
		int b = 1;
		int result = 0;
		for (int i = 0; i <fabNacci; i++) {
			result=a+b;
			System.out.println(result);
			a=b;
			b=result;
		}
	}
}
		
	
		
	