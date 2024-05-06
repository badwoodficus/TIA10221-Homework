package homework5;

import java.util.Random;

public class CAPTCHA {

	int[] code = new int[62];

	public void genAuthCode() {
		for (int i = 0; i < code.length; i++)
			if (i < 10) {
				code[i] = 48 + i;
			} // 將數字 0-9ASCII碼(Int)放入 array[0-9]
			else if (i < 36) {
				code[i] = 55 + i;
			} // 將大寫英文 ASCII碼(Int)放入 array[10-35]
			else {
				code[i] = 61 + i;
			}

		int arryBsize = 8; // 取8個
		int[] arrayB = new int[arryBsize];
		Random r = new Random();
		for (int i = 0; i < arryBsize; i++)
			arrayB[i] = code[r.nextInt(62)]; // 從array陣列中取亂數0-62位置的元素放入arrayB陣列中

		for (int i = 0; i < arryBsize; i++)
			System.out.print((char) arrayB[i]); // 將 int 強制轉型 char 印出相對應 ASCII

	}
	public static void main(String[] args) {
		System.out.println("本次隨機產生驗證碼為: ");
		CAPTCHA code = new CAPTCHA();
		code.genAuthCode();
	}

}
