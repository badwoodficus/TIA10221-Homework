package homework8;

public class Train implements Comparable<Train> {
	private int number;
	private String type;
	private String start;
	private String dest;
	double price;

	public Train() {

	}

	public Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	public void setNumber() {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setType() {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setStart() {
		this.start = start;
	}

	public String getStart() {
		return start;
	}

	public void setDest() {
		this.dest = dest;
	}

	public String getDest() {
		return dest;
	}

	public void setPrice() {
		this.price = price;
	}

	public double getprice() {
		return price;
	}
	
	//印出火車資訊的方法
	public void showTrain() {
		System.out.println("車次: " + number + " ,車種: " + type + " ,出發: " + start
		+ " ,終點: " + dest + " ,票價: " + price);
	}

	// 覆寫Object 的 hashCode 跟 equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((start == null) ? 0 : start.hashCode());
		result = prime * result + ((dest == null) ? 0 : dest.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		if (number != other.number)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (start == null) {
			if (other.start != null)
				return false;
		} else if (!start.equals(other.start))
			return false;
		if (dest == null) {
			if (other.dest != null)
				return false;
		} else if (!dest.equals(other.dest))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

	@Override
	public int compareTo(Train tr) {

		if (this.number > tr.number) {
			return 1;
		} else if (this.number == tr.number) {
			return 0;
		} else {
			return -1;
		}
		// TODO Auto-generated method stub
	}

}
