package homework4;

//請算出每位同學考最高分的次數

import java.util.Arrays;

public class HighestScore {

	public static void main(String[] args) {
		int[][] score = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };
		int[] highest = new int[6];
		int seatNum = 0;
		int tmp = 0;
		int no1 = 0;
		int no2 = 0;
		int no3 = 0;
		int no4 = 0;
		int no5 = 0;
		int no6 = 0;
		int no7 = 0;
		int no8 = 0;
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				if (tmp <= score[i][j]) {
					tmp = score[i][j];
					seatNum = j + 1;
					highest[i] = j + 1;
				}
			}
//			計數器要掛在這裡
			if (seatNum == 1)
				no1++;
			if (seatNum == 2)
				no2++;
			if (seatNum == 3)
				no3++;
			if (seatNum == 4)
				no4++;
			if (seatNum == 5)
				no5++;
			if (seatNum == 6)
				no6++;
			if (seatNum == 7)
				no7++;
			if (seatNum == 8)
				no8++;
		}
		System.out.println("1號同學考最高分共" + no1 + "次");
		System.out.println("2號同學考最高分共" + no2 + "次");
		System.out.println("3號同學考最高分共" + no3 + "次");
		System.out.println("4號同學考最高分共" + no4 + "次");
		System.out.println("5號同學考最高分共" + no5 + "次");
		System.out.println("6號同學考最高分共" + no6 + "次");
		System.out.println("7號同學考最高分共" + no7 + "次");
		System.out.println("8號同學考最高分共" + no8 + "次");
	}
}
