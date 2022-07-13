package trainingday13FUNCTIONCALLS;

public class OddEven {
	public String toFindOddEven(int a) {
		if(a%2==0) {
			return(a+"is EVen");
		}
		else {
			return(a+"is Odd");
		}
	}
	public static void main(String[] args) {
		OddEven oe=new OddEven();
		int c=5;
		System.out.println(oe.toFindOddEven(c));
		}
	}


