package homework1;

public class TestNineNine {
//	請建立一個TestNineNine.java程式，可輸出九九乘法表

	public static void main(String[] args) {
//		• 一：使用for迴圈 + while迴圈
		int i, j;
		for (i = 1; i <= 9; i++) {
			j = 1;
			while (j <= 9) {
				System.out.print(i + "*" + j + "=" + (i * j) + "\t");
				j++;
			}
			System.out.println();
			continue;
		}
//		• 二：使用for迴圈 + do while迴圈
		int z, x;
		for (z = 1; z <= 9; z++) {
			x = 1;
			do {
				System.out.print(z + "*" + x + "=" + (z * x) + "\t");
				x++;
			} while (x <= 9);
			System.out.println();
		}
//		• 三：使用while迴圈 + do while迴圈
		int a, b;
		a = 1;
		b = 1;
		while (a <= 9) {
			b = 1;
			do {
				System.out.print(a + "*" + b + "=" + (a * b) + "\t");
				b++;
			} while (b <= 9);
			System.out.println();
			a++;
		}
	}

}
