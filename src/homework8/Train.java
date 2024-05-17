package homework8;

public class Train {
	private int number;
	private String type;
	private String start;
	private String dest;
	double price;
	public Train() {
		
	}
	public Train(int number, String type,String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}
}
