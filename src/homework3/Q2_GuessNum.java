package homework3;

/*請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜對則顯示正確訊息，如圖示結果：
 * (進階功能：產生0～100亂數，每次猜就會提示你是大於還是小於正確答案)
 * 如果輸入文字還是能繼續輸入下一個數字繼續遊戲直到結束?
 * 使用var宣告來規避InputMismatchException
 */
import java.util.*;

public class Q2_GuessNum {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int min = 0;
		int max = 100;
		Random r = new Random();
		int secret = r.nextInt(max - min) + min;
		var console = new Scanner(System.in);
//        System.out.println("secret number is :" + secret);
//		崩潰的原因是因為輸入的文字陷入無窮迴圈，要想辦法阻止程式重複這一步驟
		while (true) {
			try {
			System.out.println("請猜一個數字介於 ( " + min + " 與 " + max + "):");
			var guess = console.nextInt();
				if (guess > max || guess < min) {
					System.out.println("請猜一個符合規則的數字");
					continue;
				}

				if (guess == secret) {
					System.out.println("答對!答案就是: " + secret);
					break;
				} else if (guess < secret) {
					min = guess;
				} else if (guess > secret) {
					max = guess;
				}

			} catch (InputMismatchException ex) {
				System.out.printf("請不要輸入數字以外的文字!再次輸入一個整數:",console.next());
			}

		}
		scanner.close();
	}
}