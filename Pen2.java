package trainingday13FUNCTIONCALLS;

public class Pen2 {
	String brand;
	int price;
	String color;
	public void output(Pen2[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i].brand);
		}

}
	public class UsePen2 {
	public static void main(String[] args) {
		Pen2 pen1=new Pen2();
		pen1.brand="Renolds";
		pen1.price=20;
		pen1.color="Red";
		
		Pen2 pen2=new Pen2();
		pen2.brand="Cello";
		pen2.price=30;
		pen2.color="Yellow";
		
		Pen2 pen3=new Pen2();
		pen3.brand="Parker";
		pen3.price=10;
		pen3.color="White";
		
		Pen2[] pens= {pen1,pen2,pen3};
		
		pen1.output(pens);
			
		}
	}
}