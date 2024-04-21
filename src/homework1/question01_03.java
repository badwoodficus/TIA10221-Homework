package homework1;

public class Question01_03 {

	public static void main(String[] args) {

//		請設計一隻Java程式，計算12，6這兩個數值的和與積

		int a = 6;
		int b = 12;
		System.out.println("12與6的和" + (a + b) + ",積" + (a * b));

//		請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)

		int egg = 200;
		System.out.println("200顆蛋是" + (egg / 12) + "打," + (egg % 12) + "顆");

//		請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int totalSec = 256559;
		int secRemDay = totalSec % (60 * 60 * 24); // 不足一天的秒數
		int secRemHr = secRemDay % (60 * 60); // 不足一小時的秒數
		int secRemMin = secRemHr % 60; // 不足一分鐘的秒數
		System.out.println("256559秒是" + (totalSec / (60 * 60 * 24)) + "天," + (secRemDay) / (60 * 60) + "小時,"
				+ (secRemHr) / 60 + "分鐘," + secRemMin + "秒");

	}

}
