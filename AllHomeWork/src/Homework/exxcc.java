package Homework;

public class exxcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b = 1;
		int result = a + b;
		for (int i = 1 ; i < 20; i++) {
			result = a + b;
			System.out.println(result);
			a = b;
			b = result;
		}

	}

}
