package precties1;

import java.util.HashMap;
import java.util.Hashtable;

import Homework.newMethod;

/*how do you use Thread?
 * by using implements runnable either i can use extends thread.
*/

public class Mythread extends Thread {
	public static void main(String[] args) {
		
		new Runnable() {
			public void run() {
				System.out.println("this is runnable");
			}
		};

	}
}
/*
 * @Override public void run() { // TODO Auto-generated method stub
 * 
 * }
 * 
 * public static void main(String[] args) { Thread thread = new Thread(new
 * Runnable() {
 * 
 * @Override public void run() { System.out.println( "this is for Nested Thred"
 * );
 * 
 * } });
 */

/*
 * Hashtable hashtable = new Hashtable<>(); hashtable.put("name", "zaman");
 * hashtable.put(null, "4567890"); hashtable.size();
 * 
 * for (int i = 0; i <hashtable.size(); i++) {
 * System.out.println(hashtable.values()); break; }
 * 
 * 
 * HashMap<String, String> hashMap = new HashMap<>(); hashMap.put(null,
 * "zaman"); hashMap.get(hashtable); System.out.println(hashMap);
 * 
 * }
 * 
 * }
 */