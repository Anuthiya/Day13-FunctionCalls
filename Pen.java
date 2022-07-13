package trainingday13FUNCTIONCALLS;

public class Pen {
	String brand;
	int price;
	String color;
	public void output(Pen[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i].brand);
		}
	}

}
