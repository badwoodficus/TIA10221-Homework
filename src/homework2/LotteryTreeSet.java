package homework2;

import java.util.*;

//阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
//輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
public class LotteryTreeSet {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		
		while(set.size()!=6) {
			int r1 = (int)(Math.random()*49)+1;
			if(r1<40&& (r1/10)!=4) {
				set.add(r1);
			}
		}
		
//		Iterator<Integer> it =  set.iterator();  //注意set.iterator不需要用new新創物件!
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
		System.out.println("六個不重複的隨機數字為:");
        for (int num : set) {
            System.out.print(num+", ");
        }
	}
}
