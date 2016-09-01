import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number : ");
		int myNum = sc.nextInt();
		System.out.println("Here you Go!!");
		for (int i = 1; i < myNum; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				System.out.print(i + " ");
			}
		}
	}

}
