package homework5;

public class MyRectangleMain {
	public static void main(String[] args) {
		MyRectangle m1 = new MyRectangle();
		m1.setDepth(20);
		m1.setWidth(10);
		System.out.println(m1.getArea());
		
		MyRectangle m2 = new MyRectangle(10.0,20.0);
		System.out.println(m2.getArea());
	}
}
