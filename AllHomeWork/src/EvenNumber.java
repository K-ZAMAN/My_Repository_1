import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number");
		int NUm = sc.nextInt();
		//System.out.println("here you goo");
		if (NUm %2 == 0)
			System.out.println("this is Even Number");
		else {
			System.out.println("this is odd number");

		}

	}
}
