package homework10;

import java.text.DecimalFormat;
/*請設計一隻程式，讓使用者可以輸入一個任意數後，可以選擇要以下列何種表示方法顯示(1)千分位
(2)百分比(3)科學記號，而輸入非任意數會顯示提示訊息如圖 (提示： TestFormatter.java, Java API
文件, 判斷數字可用正規表示法)
*/
import java.util.Scanner;

public class Formatter {
	// 檢查輸入的字串是否可以轉換成數字
	public static boolean isNumeric(String str) {
		return str.matches("-?\\d+(\\.\\d+)?");// 輸入格式為數字回傳true
	}

	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("請輸入一個數字");
			String input = sc.next();
			if (!isNumeric(input)) {
				System.out.println("數字格式不正確！請再輸入一次");
				continue;
			}

			System.out.println("欲格式化成(1)千分位,(2)百分比,(3)科學記號：");
			int choice = sc.nextInt();
			double number = Double.parseDouble(input);
			String output;
			switch (choice) {
			case 1:

				output = new DecimalFormat(",###").format(number);
				break;

			case 2:

				output = new DecimalFormat("##.##%").format(number);
				break;

			case 3:
				
				output = new DecimalFormat("0.######E0").format(number);
				break;

			default:

				output = "選擇錯誤";
				break;
			}
			System.out.println(output);
			break;
		}
	}
}
