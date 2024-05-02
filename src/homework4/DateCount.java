package homework4;

import java.util.Arrays;
/*
 * 請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
(提示1：Scanner，陣列)
(提示2：需將閏年條件加入)
(提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)
 */
/*		思考方式
 * 		如何讓一次輸入的數字拆成三個?
		三組數字怎麼放到變數內去運算?取得陣列{yy, mm, dd}
		一三五七八十十二月有31天 
		Jan31Feb28or29Mar31Apr30May31Jan30Jul31Aug31Sep30Oct31Nov30Dec31
		四六九十一有30天
		二月有28天或29天
		設定mm dd 從一月往上加到輸入的日期?
		2024為閏年 yy%4=0 >>>有29天 年份只有決定是否多一天
		int[] time = { yy, mm, dd}
	    int yy = time[0]; int mm = time[1]; int dd = time[2];
*/
import java.util.Scanner;

public class DateCount {
	private static int count = 0;

	private static boolean form = false;

	public DateCount() {
	};

	public int dayCount(int yy, int mm, int dd) {
		int year = yy % 4;
		int month = mm - 1;
		int day = dd;

		while (month != 0) {

			if (dd > 32) {
				System.out.println("輸入格式錯誤!");
				break;
			} else if (mm == 2 && dd > 29) {
				System.out.println("輸入格式錯誤!");
				break;
			}

			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
				if (0 < dd && dd < 32) {
					count += 31;
					form = true;
				} else {
					System.out.println("輸入格式錯誤!");
					form = false;
					break;
				}
				month--;
			} else if (month == 4 || month == 6 || month == 9 || month == 11) {
				if (0 < dd && dd < 31) {
					count += 30;
					form = true;
				} else {
					System.out.println("輸入格式錯誤!");
					form = false;
					break;
				}
				month--;
			} else if (month == 2) {
				if (dd > 0 && dd <= 29) {
					if (yy % 4 == 0) {
						count += 29;
					} else {
						count += 28;
					}
				}
				month--;
			} else {
				System.out.println("輸入格式錯誤");
				form = false;
				break;
			}
		}
		if (form == true) {
			count += dd;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println("請輸入年/月/日:");
		Scanner sc = new Scanner(System.in);
		int[] time = new int[3];
		for (int i = 0; i < 3; i++) {
			time[i] = sc.nextInt();
		}
		System.out.println("輸入的時間為:" + Arrays.toString(time));
		DateCount date = new DateCount();
		int yy = time[0];
		int mm = time[1];
		int dd = time[2];

		date.dayCount(yy, mm, dd);

		if (form == true) {
			System.out.println(Arrays.toString(time) + "是該年第: " + count + "天");
		} else {
			System.out.println("無法運算!");
		}

		sc.close();
	}

}
