package precties1;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTabelandMap {


	public static void main(String[] args) {
		
		
		
		 Hashtable<String,String> hashtableobj = new Hashtable<String, String>();
	        hashtableobj.put("Alive is ", "awesome");
	        hashtableobj.put("Love", "yourself");
	        System.out.println("Hashtable object output :"+ hashtableobj);
		
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				hashtableobj.remove("Love");
				System.out.println("hahaaa");
				System.out.println("ffff"+hashtableobj.toString());
			}
		});
		
   Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				hashtableobj.remove("Love");
				System.out.println("ffffff"+hashtableobj.toString());
			}
			});
		
	 t.start();
	 t1.start();
	 
	 
   
   
   
	         
	 
	        HashMap hashmapobj = new HashMap();
	        hashmapobj.put(null, null);  
	        hashmapobj.put("Love", "yourself"); 
	        System.out.println("HashMap object output :"+hashmapobj);
	}

}
