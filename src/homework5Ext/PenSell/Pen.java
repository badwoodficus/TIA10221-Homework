package homework5Ext.PenSell;

public class Pen {
	private String brand;
	private double price = 0;

	public Pen() {
	}

	public Pen(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brandXXX) {
		brand = brandXXX;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double priceXXX) {
		if (priceXXX > 0)
			price = priceXXX;
		else
			System.out.println("請確認售價設定");
	}

	void write() {
	}
}
