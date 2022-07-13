package trainingday13FUNCTIONCALLS;

public class UsePen {
	public static void main(String[] args) {
		Pen pen1=new Pen();
		pen1.brand="Renolds";
		pen1.price=20;
		pen1.color="Red";
		
		Pen pen2=new Pen();
		pen2.brand="Cello";
		pen2.price=30;
		pen2.color="Yellow";
		
		Pen pen3=new Pen();
		pen3.brand="Parker";
		pen3.price=10;
		pen3.color="White";
		
		Pen[] pens= {pen1,pen2,pen3};
		
		pen1.output(pens);
			
		}
	}


