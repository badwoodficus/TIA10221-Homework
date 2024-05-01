package homework3;

/*• 阿文很喜歡簽大樂透(1～49)，但他是個善變的人，
 * 上次討厭數字是4，但這次他想要依心情決定討厭哪個數字，
 * 請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，
 * 畫面會顯示他可以選擇的號碼與總數，如圖：
 * 進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複
 */
import java.util.Scanner;
import java.lang.Math;

/*
   case1 : 1<= noNum <5   用之前的
   case2 : 5<= noNum <= 9 只需要排除個位數
   生成第一個介於1~49的亂數>判斷是否符合規則>生成第二個亂數>判斷是否等於第一個>判斷是否符合規則>生成第三個亂數>判斷是否等同第二個.....
   要產生重複的數很難但我還是想要增加判斷式
   不確定次數應該使用while來跑迴圈
*/
public class Q3_LuckyWhile {

	public static void main(String[] args) {
		System.out.println("阿文...請輸入你討厭哪個數字?(1~9)");
		Scanner no = new Scanner(System.in);
		int noNum = no.nextInt();

		int count = 1;
		do {
			int numRan = (int) (Math.random() * 49) + 1; // 先產生一個亂數介於1~49
			if (numRan % 10 != noNum && numRan / 10 != noNum) {
				System.out.print(numRan + "  ");
				count++;
			}

		} while (count <= 6); // 讓迴圈跑六次
		System.out.println();

		System.out.println("以上為電腦選號，祝您中獎！");

		no.close();
	}
}
