package homework5Ext.PenSell;

public class Pencil extends Pen {
	public Pencil() {
		
	}
	public Pencil(String brand, double price ) {
		super(brand,price);
	}
	
	public void write() {
		System.out.println("削鉛筆再寫");
	}
//	Pencil實際售價為定價8折
	public void setPrice(double price) {
		super.setPrice(price);
		price *=0.8;
	}
	public double getPrice(double price) {
		return price;
	}
	
}
