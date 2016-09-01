import java.util.Scanner;

public class AbsuluteValueDynamic {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter yor number");
		int numAbs = sc.nextInt();
		if (numAbs > 0) {
			System.out.println("this is absulute number");
		} else
			System.out.println("its Not abslute value");

	}
}
