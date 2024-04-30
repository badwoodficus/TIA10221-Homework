package homework3;

import java.util.*;

import static java.lang.System.out;
/*請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形，如圖示結果：
 * 加入直角三角形的判斷
 */

public class Triangle {

	public static void main(String[] args) {
		try {
			out.println("請輸入三個正整數:");
			Scanner sc = new Scanner(System.in);
			int t1 = sc.nextInt();
			int t2 = sc.nextInt();
			int t3 = sc.nextInt();
			int[] tri = { t1, t2, t3 };
			Arrays.sort(tri);
			int[] def = new int[3];
			System.arraycopy(tri, 0, def, 0, 3);

			if (def[0] + def[1] > def[2]) {
				if (def[0] == def[1] || def[1] == def[2]) {
					if (def[0] == def[2]) {
						out.println("這是正三角形");
					} else {
						out.println("這是等腰三角形");
					}
				} else if ((int) (Math.pow(def[0], 2)) + (int) (Math.pow(def[1], 2)) == (int) (Math.pow(def[2], 2))) {
					out.println("這是直角三角形");
				} else {
					out.println("這是三角形");
				}

			} else {
				out.println("這不是三角形");
			}

		} catch (InputMismatchException ex) {
			out.println("必須輸入整數!");
		}
	}
}
