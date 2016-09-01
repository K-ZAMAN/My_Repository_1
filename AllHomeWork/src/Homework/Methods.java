package Homework;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//fibonaci(10);
		factorial(4);
		
		
		
	}

	// print for fibonaci
	public  void fibonaci(int number) {
		int firstNumber = 0;
		int secondNumber = 0;
		int result = 0;
		for (int i = 0; i < number - 2; i++) {

			if (i == 0) {
				firstNumber = i;
				secondNumber = i + 1;
				System.out.println(firstNumber);
				System.out.println(secondNumber);
			}

			result = firstNumber + secondNumber;
			System.out.println(result);
			firstNumber = secondNumber;
			secondNumber = result;
		}

	}

	// print for fibonaci
	public static void factorial(int number) {

		int result=1;
		
		for(int i=number; i>1; i--){
			result *=i;
		}
		
		System.out.println(result);
	}

}
