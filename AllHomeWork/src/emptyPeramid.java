
public class emptyPeramid {

	public static void main(String[] args) {
		
		
		int i,j,n;
		n=5;
		 for(i=1; i<=n; i++)
		    {
		        for(j=i; j<n; j++)
		        {
		        	System.out.print(" ");
		        }
		 
		        for(j=1; j<=(2*i-1); j++)
		        {
		            if(i==n || j==1 || j==(2*i-1))
		            {
		            	System.out.print("*");
		            }
		            else
		            {
		            	System.out.print(" ");
		            }
		        }
		 
		        System.out.print("\n");
		    }
		
		

	}

}
