
public class AbsuluteStaticValue {

	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				System.out.println(i + " ");
			}
		}
		
		
		
		
	}
}