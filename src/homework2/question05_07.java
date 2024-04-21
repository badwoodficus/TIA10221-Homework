package homework2;

public class Question05_07 {

	public static void main(String[] args) {
//		阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
//		輸出結果為阿文可以選擇的數字有哪些？總共有幾個？

		int luc, sum, dig;
		luc = 1;
		sum = 0;
		dig = 0;
		for (luc = 1; luc <= 49; luc++) {
			dig = luc % 10;
			if (luc < 40 && dig != 4) {
				System.out.print(luc + ", ");
				sum++;
			}
		}
		System.out.println();
		System.out.println(sum + "個數字");
		System.out.println();

//		請設計一隻Java程式，輸出結果為以下：
//		1 2 3 4 5 6 7 8 9 10
//		1 2 3 4 5 6 7 8 9
//		1 2 3 4 5 6 7 8
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1
		int y, x;
		for (y = 10; y > 0; y--) {
			for (x = 1; x <= y; x++) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		System.out.print("====================" + "\n");
//		請設計一隻Java程式，輸出結果為以下：
//		A      值=65
//		BB     值=66
//		CCC    值=67
//		DDDD   值=68
//		EEEEE  值=69
//		FFFFFF 值=70
		int a, b, c;
		c = 65;
		for (a = 1; a <= 6; a++) {
			for (b = 1; b <= a; b++) {
				System.out.print((char) c);
			}
			System.out.println();
			c += 1;
		}
	}

}
