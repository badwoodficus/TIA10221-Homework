package homework8;

import java.math.BigInteger;
import java.util.*;

public class TestCollection {
	public static void main(String[] args) {
		Object obj = new Object();
		BigInteger f = new BigInteger("1000");
		List list = new ArrayList();
		list.add((Integer) 100);
		list.add((double) 3.14);
		list.add((long) 21);
		list.add((short) 100);
		list.add("Kitty");
		list.add((Integer) 100);
		list.add((Object) obj);
		list.add("Snoopy");
		list.add((BigInteger) f);

		// 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)

		System.out.println("使用傳統for迴圈列印元素");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println("←←←←");

		System.out.println("使用Iterator列印元素");
		for (Iterator it = list.iterator(); it.hasNext();) {
			System.out.print(it.next() + " ");
		}
		System.out.println("←←←←");

		System.out.println("使用增強型for迴圈列印元素");
		for (Object str : list) {
			System.out.print(str + " ");
		}
		System.out.println("←←←←");

		// 移除不是java.lang.Number相關的物件

		list.removeIf(item -> !(item instanceof Number));

		// 再次印出集合物件的所有元素，觀察是否已將非Number相關的物件移除成功
		System.out.println("經過篩選後的Iterator列印出");
		for (Object str : list) {
			System.out.print(str + " ");
		}
	}
}
