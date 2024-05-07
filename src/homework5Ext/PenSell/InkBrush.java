package homework5Ext.PenSell;

public class InkBrush extends Pen {
	public InkBrush() {
		
	}
	public InkBrush(String brand,double price) {
		super(brand,price);
	}
	
	public void write() {
		System.out.println("沾墨汁再寫");
	}
//	InkBrush為定價9折
	public void setPrice(double price) {
		super.setPrice(price);
		price *= 0.9;
	}
	public double getPrice(double price) {
		return price;
	}
	
}
