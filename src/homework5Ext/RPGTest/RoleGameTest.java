package homework5Ext.RPGTest;

public class RoleGameTest {

	public static void main(String[] args) {
//		使用介面替代下面方式
//		Hero saber = new SwordMan("亞拉岡", 1, 0);
//		Hero archer = new ArrowMan("勒苟拉斯", 1, 0);
//		saber.attack();
//		saber.move();
//		archer.attack();
//		archer.move();
		Hero[] character = new Hero[2];
		character[0] = new SwordMan("亞拉岡",1,0);
		character[1] = new ArrowMan("勒苟拉斯",1,0);
		
		System.out.println(character[0].getName("亞拉岡"));
		character[0].attack();
		character[0].defensiveAction();
		System.out.println(character[1].getName("勒苟拉斯"));
		character[1].attack();
		character[1].defensiveAction();
		
		Token[] servant = new Token[2];
		servant[0] = new TokenMammal("野比雄太",100,30.0,"零分考卷");
		servant[1] = new TokenMammal("野獸先輩",2,50.0,"昏睡紅茶");
		System.out.println(servant[0].getName("野比雄太"));
		servant[0].showItem();
		servant[0].defensiveAction();
		System.out.println(servant[1].getName("野獸先輩"));
		servant[1].showItem();
		servant[1].defensiveAction();
	}

}
