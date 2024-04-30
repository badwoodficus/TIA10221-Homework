package homework3;

/*• 阿文很喜歡簽大樂透(1～49)，但他是個善變的人，
 * 上次討厭數字是4，但這次他想要依心情決定討厭哪個數字，
 * 請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，
 * 畫面會顯示他可以選擇的號碼與總數，如圖：
 */
 import java.util.Scanner;
 
 public class Q3_LuckyNum {
	
	public static void main(String[] args) {
		System.out.println("阿文...請輸入你討厭哪個數字?(1~9)");
		Scanner no = new Scanner(System.in);

		int noNum = no.nextInt();
		int luc = 0;
		if (noNum > 0 && noNum < 5) {
			 for(int i = 1; i <= 49; i++) {
				int dig = i % 10;
				int div = i / 10;
				if (div != noNum && dig != noNum) {
					luc = i;
					System.out.print(luc + ", ");
				}
			}
			System.out.println("目前可以選擇的數字如上");
		} else if (noNum > 4 && noNum < 10) {
			for (int i = 1; i <= 49; i++) {
				int dig = i % 10;
				if (noNum != dig) {
					luc = i;
					System.out.print(luc + ", ");
				}
			}
			System.out.println("目前可以選擇的數字如上");
		}else {
			System.out.println("輸入數字不符合格式");
		}
		no.close();
	}
}