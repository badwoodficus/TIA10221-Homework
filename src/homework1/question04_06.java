package homework1;

public class question04_06 {

	public static void main(String[] args) {

//		請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		final double PI = 3.14159;
		double perimeter = 2 * PI * 5;
		double area = PI * Math.pow(5, 2);
		System.out.println("半徑為5的圓面積為" + area + ",圓周長為" + perimeter);

//		某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
//		金加利息共有多少錢 (用複利計算，公式請自行google)
		int deposit = 1_500_000;
		double dep10y = deposit * Math.pow(1.02, 10);
		System.out.println("十年後的本利合為" + dep10y);

		char c = '5';
		System.out.println((int) c);
//		請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//		5 + 5
//		5 + ‘5’
//		5 + “5”
//		並請用註解各別說明答案的產生原因
		System.out.println(5 + 5); // 5的資料型別為int,做值的運算得到10
		System.out.println(5 + '5'); // '5'的資料型別為char,運算中被JVM自動轉換為十進制的數字53變成int類型再跟5運算得到58
		System.out.println(5 + "5"); // "5"的資料型別為String,運算時遇到String會被視為自串串接，前面的5被轉換成文字所以得到55
//		上面三項,前兩項的結果資料型別為int,第三項的資料型別為String
	}

}
