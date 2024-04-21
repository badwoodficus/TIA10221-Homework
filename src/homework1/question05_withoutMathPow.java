package homework1;

public class Question05_withoutMathPow {

//	某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
//	金加利息共有多少錢 (用複利計算，公式請自行google)

	public static void main(String[] args) {

		double yearlySavings = 1500000;
		int years = 10;
		int yearCount = 0;
		double totalSavings = 0;

		while (yearCount < years) {
			yearlySavings *= 1.02;
			totalSavings = yearlySavings;
			System.out.println("此時的本利合為" + totalSavings);
			yearCount++;
		}

		/*
		 * 用for迴圈的寫法 int i; for(i=0; i<10 ;i=i+1) { yearlySavings *= 1.02; totalSavings
		 * = yearlySavings; System.out.println("此時的本利合為"+totalSavings); }
		 */

		System.out.printf("十年後的本利和為 $%.2f", totalSavings);

	}

}
