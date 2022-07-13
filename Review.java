package trainingday13FUNCTIONCALLS;

public class Review {
	public String add (int a,int b) {
		int c=a+b;
		int d=a-b;
		int e=a*b;
		int f=a/b;

				return c+" "+e+" "+f+" "+d;
				
				
			
		}
		
	
	
public static void main(String[] args) {
	Review ad=new Review();
	int a=66;
	int b=30;
	System.out.println(ad.add(a,b));
}
	
}

