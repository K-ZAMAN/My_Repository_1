import java.util.Scanner;

public class MiddleNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your First Number : ");
		int firstNum = sc.nextInt();
		System.out.print("Enter Your Second Number : ");
		int secondNumber = sc.nextInt();
		System.out.print("Enter Your First Number : ");
		int thiredNumber = sc.nextInt();

		int max = Math.max(Math.max(firstNum, secondNumber), thiredNumber);
		int min = Math.min(Math.min(firstNum, secondNumber), thiredNumber);

		if (firstNum > min && firstNum < max) {
			System.out.println("This is the middle Number of your input : " + firstNum);
		} else if (secondNumber > min && secondNumber < max) {
			System.out.println("This is the middle Number of your input : " + secondNumber);
		} else
			System.out.println("This is the middle Number of your input : " + thiredNumber);
	}

}
