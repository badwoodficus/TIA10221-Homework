package homework5Ext.RPGTest;

public abstract class Token implements DrawDefensiveAction{
	private String name;
	private String item;
	private int packCapacity;
	private double loyalty;
	
	public Token() {
		
	}
	public void setName(String nameXXX) {
		name = nameXXX;
	}
	public String getName(String name) {
		return name;
	}
	public void setItem(String itemXXX) {
		item = itemXXX;
	}
	public String getItem(String item) {
		return item;
	}
	
	public Token(String name, int packCapacity, double loyalty,String item) {
		this.name = name;
		this.packCapacity = packCapacity;
		this.loyalty = loyalty;
		this.item = item;
	}
	
	public void pickUp() {
		System.out.println("(*隨從撿起戰利品)");
	}
	public void showItem() {
		System.out.println("隨從拿出隨身攜帶的: "+item);
	}
	@Override
	public void defensiveAction() {
		System.out.println("躲避: "+move+"\n防守: "+defend);
	}
}
