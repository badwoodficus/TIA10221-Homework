package homework4;

/*
 * 有個字串陣列如下 (八大行星)：
{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
(提示：字元比對，String方法)
 */
//輸入字串>字元比對>true>count++>輸出count
public class StringCompare {
	public String[] planets = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };

	public static void main(String[] args) {
		StringCompare planets = new StringCompare();
		planets.typeConversion();
		System.out.print("A:" + planets.countA() + "\t");
		System.out.print("E:" + planets.countE() + "\t");
		System.out.print("I:" + planets.countI() + "\t");
		System.out.print("O:" + planets.countO() + "\t");
		System.out.print("U:" + planets.countU() + "\n");
		System.out.println("total:" + planets.countVowel());
	}
//		讓planets 成為可以操作的物件
		
	public StringCompare() {
	}
//		把字串轉換成字元的二維陣列
//		外層是字串陣列其中一個的長度
//		內層是字串陣列的元素
	char[][] c = new char[planets.length][];

	public void typeConversion() {
		for (int i = 0; i < planets.length; i++) {
			c[i] = planets[i].toCharArray();
		}
	}
//		計算各個母音與全部母音數量的Method
	public int countA() {
		int countA = 0;
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				if (c[i][j] == 'a')
					countA++;
			}
		}
		return countA;
	}

	public int countE() {
		int countE = 0;
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				if (c[i][j] == 'e')
					countE++;
			}
		}
		return countE;
	}

	public int countI() {
		int countI = 0;
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				if (c[i][j] == 'i')
					countI++;
			}
		}
		return countI;
	}

	public int countO() {
		int countO = 0;
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				if (c[i][j] == 'o')
					countO++;
			}
		}
		return countO;
	}

	public int countU() {
		int countU = 0;
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				if (c[i][j] == 'u')
					countU++;
			}
		}
		return countU;
	}

	public int countVowel() {
		int countVowel = 0;
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				if (c[i][j] == 'u' || c[i][j] == 'o' || c[i][j] == 'i' || c[i][j] == 'e' || c[i][j] == 'a')
					countVowel++;
			}
		}
		return countVowel;
	}

}
