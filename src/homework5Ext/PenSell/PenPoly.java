package homework5Ext.PenSell;

public class PenPoly {
	public static void main(String[] args) {
		Pen[] p = new Pen[2];
		p[0] = new Pencil("LIBERTY", 30.0);
		p[1] = new InkBrush("DERWENT", 50);

		p[0].write();
		System.out.println("品牌: " + p[0].getBrand() + "售價: " + p[0].getPrice());

		p[1].write();
		System.out.println("品牌: " + p[1].getBrand() + "售價: " + p[1].getPrice());
	}
}
