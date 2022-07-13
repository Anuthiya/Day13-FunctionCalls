package trainingday13FUNCTIONCALLS;

public class HighestPrice {
	String brand;
	int price;
	String color;
	int high;
	
	public void highe(HighestPrice [] a) {
		int high=a[0].price;
		for(int i=0;i<a.length;i++) {
			
			if(a[i].price>high) {
				high=a[i].price;
			}
			
		}
		System.out.println("Highest Price= "+high);
		}

	public class UseHighestPrice {
	public static void main(String[] args) {
		HighestPrice pen1=new HighestPrice();
		pen1.brand="Renolds";
		pen1.price=20;
		pen1.color="Red";
		
		HighestPrice pen2=new HighestPrice();
		pen2.brand="Cello";
		pen2.price=30;
		pen2.color="Yellow";
		
		HighestPrice pen3=new HighestPrice();
		pen3.brand="Parker";
		pen3.price=10;
		pen3.color="White";
		
		HighestPrice[] pens= {pen1,pen2,pen3};
		
		pen1.highe(pens);
			
		}
	}
}


