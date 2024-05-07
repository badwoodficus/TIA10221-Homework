package homework5Ext.RPGTest;

public abstract class Hero implements DrawDefensiveAction{
	// 省略 getter/setter...
	
	private String name;
	private int level;
	private double exp;
	
	public Hero() {
		this("David", 1, 0);
	}
	public void setName(String nameXXX) {
		name = nameXXX;
	}
	public String getName(String name) {
		return name;
	}
	
	public Hero(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}
//	使用介面實作
	@Override
	public void defensiveAction() {
		System.out.println("移動: "+move+"\n防守: "+defend);
	} 
	
	public abstract void attack();
	
//	下方使用介面取代
//	public abstract void move();
	
//	public abstract void defend();
}
