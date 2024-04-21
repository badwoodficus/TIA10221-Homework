package homework2;

public class Question01_04 {

	public static void main(String[] args) {
//		請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)
		int sum = 0;
		int i;
		for (i = 1; i <= 1000; i++) {
			int d = i % 2;
			if (d == 0) {
				sum += i;
			}
		}
		System.out.println("1～1000的偶數和=" + sum);

//		請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)
		int mclForSum = 1;
		int k;
		for (k = 1; k <= 10; k++) {
			mclForSum *= k;
		}
		System.out.println("Ans2:1～10的連乘積=" + mclForSum);

//		請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)
		int mclWhileSum = 1;
		int j = 1;
		while (j <= 10) {
			mclWhileSum *= j;
			j++;
		}
		System.out.println("Ans3:1～10的連乘積=" + mclWhileSum);

//		請設計一隻Java程式，輸出結果為以下：
//		1 4 9 16 25 36 49 64 81 100
		int x, y;
		for (x = 1; x <= 10; x++) {
			for (y = 1; y <= 10; y++) {
				if (x == y) {
					System.out.print((x * y) + "\t");
					break;
				}
			}
		}

	}

}
