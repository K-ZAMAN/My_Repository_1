
public class facetorial {

	public static void main(String[] args) {
		int value = 1;
		int factorial = value;
		for (int i=1; i<5; i++)
			{
			factorial = factorial*i;
			System.out.println("The value is :" + factorial);
			}
	}

}

/*
 * // even no: and odd numbr: for (int i=0; i<=100; i++) {
 * 
 * if (i%2 !=0) System.out.println(i); }
 * //===================================================// // for loop int value
 * = 1; int factorial = value; for (int i=1; i<=7; i++) { factorial =
 * factorial*i; System.out.println("The value is :" + factorial); }
 * 
 * //======================================================// //do-while: int i
 * = 1; int factorial = i; do { factorial = factorial*i; System.out.println(
 * "Thre value is :" + factorial); i++; } while (i<=7);
 * //==================================================// while: int value = 1;
 * int factorial = value; int i =1; //for (int i=1; i<=7; i++){ while(i<=99){
 * factorial= factorial*i; i++; System.out.println("Thre value is :" +
 * factorial);
 * 
 * 
 * }
 */
