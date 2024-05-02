package homework4;

import java.util.Arrays;

/*有個一維陣列如下：
{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
(提示：陣列，length屬性)
 * 
 */
public class ArrayQuest {
	public static void main(String[] args) {
		int[] array = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		Arrays.sort(array);

		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		int avg = sum / array.length;
		System.out.println("該陣列的平均值為；" + avg);

		System.out.println("該陣列平均值以上的數為：");
		int count = 0;
		while (count < array.length) {
			if (array[count] > avg) {
				System.out.print(array[count] + " ");
			}
			count++;
		}

	}
}
