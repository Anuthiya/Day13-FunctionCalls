package trainingday13FUNCTIONCALLS;

public class Eve {
	public String even() {
		int a=4;
		if(a%2==0) {
		return(a+"is Even");
	}
	else {
		return(a+"is odd");
	}
	}



public static void main(String[] args) {
	Eve e=new Eve(); 
	System.out.println(e.even());
}
}
