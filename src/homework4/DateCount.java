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
	private String evan = "evanMonth";
	private String odd = "oddMonth";

	public static boolean form(int yy , int mm , int dd) {
		if(yy < 1 || mm<1 || mm>12 || dd < 1 ) {
			return false;
		}
		if(mm == 1|| mm== 3|| mm==5 ||mm==7||mm==8||mm==10||mm==12) {
			return dd <=31;
		}else if(mm==4||mm==6||mm==9||mm==11) {
			return dd <=30;
		}else if(mm==2) {
			if(isLeapYear(yy)) {
				return dd<=29;
			}else {
				return dd<=28;
			}
		}
		return dd >0;
	}
	
	public static boolean isLeapYear(int yy) {
        return (yy % 4 == 0 && yy % 100 != 0) || (yy % 400 == 0);
    }

	public DateCount() {
	};

	public static int dayCount(int yy, int mm, int dd) {
		int month = 0;
		int day = dd;

		while (month < mm ) {

			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
				count += 31;
				month++;
				continue;
			} else if (month == 4 || month == 6 || month == 9 || month == 11) {
				count += 30;
				month++;
				continue;
			} else if (month == 2) {
				if (isLeapYear(yy)){
					count +=29;
				}else {
					count +=28;
				}
				month++;
				continue;
			}else {
				month++;
			}
		}
		count += dd;
		
		return count;
	}

	public static void main(String[] args) {
		System.out.println("請輸入年:");
		Scanner sc = new Scanner(System.in);
		int yy = sc.nextInt();
		System.out.println("請輸入月:");
		int mm = sc.nextInt();
		System.out.println("請輸入日:");
		int dd = sc.nextInt();
		System.out.println("輸入的時間為:" + yy+"年"+mm+"月"+dd+"日");


		if (form(yy,mm,dd)) {
			int count = dayCount(yy,mm,dd);
			System.out.println("是該年第: " + count  + "天");
		} else {
			System.out.println("格式錯誤，無法運算!");
		}

		sc.close();
	}

}