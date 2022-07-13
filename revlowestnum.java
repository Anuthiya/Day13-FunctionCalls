package trainingday13FUNCTIONCALLS;

public class revlowestnum {
	public void low() {
		int[] a= {10,20,30};
		int min=0;
		for(int i=0;i<=a.length;i++) {
		if(min>=a[i]) {
			a[i]=min;
		}
		System.out.println(min);
		
			
		}
	}
	
	public static void main(String args[]) {
		revlowestnum r=new revlowestnum();
		//int[] a= {10,20,30};
		r.low();
		
	}
		
	}


