
public class Factorial_Recursive {

	
	//We know N=n(n-1)(n-1)(n-3)(n-4)(n-5)
	public static void main(String[] args) {


		int n= 5; //Factorial for 5
		int result= 0;
	for (int i = 0; i <n; i++) {
		result = (n-1);
		if (n-1 == i) {
			result=result*n;
		}
		System.out.println(result+1);
	}	
 	}

}
