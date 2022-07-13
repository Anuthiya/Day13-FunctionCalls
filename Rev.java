package trainingday13FUNCTIONCALLS;

public class Rev {
	public int add(int a,int b) {
		int c=a+b;
		return(c);
	}
	public int sub(int a,int b) {
		int c=a-b;
		return(c);
	}
	public int mul(int a, int b) {
		int c=a*b;
		return(c);
	}
	public int div(int a, int b) {
		int c=a/b;
		return(c);
	}
public static void main(String[] args) {
	Rev r=new Rev();
	System.out.println(r.add(66,30));
	System.out.println(r.sub(66,30));
	System.out.println(r.mul(66,30));
	System.out.println(r.div(66,30));
	}
		
	}


