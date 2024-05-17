package homework8;

import java.util.*;
//請寫一隻程式，能印出不重複的Train物件

public class TestTrainHashSet {
	public static void main(String[] args) {
		Set<Train> set = new HashSet<Train>();

		Train[] tr = new Train[7];
		tr[0] = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		tr[1] = new Train(1254, "區間", "屏東", "基隆", 700);
		tr[2] = new Train(118, "自強", "高雄", "台北", 500);
		tr[3] = new Train(1288, "區間", "新竹", "基隆", 400);
		tr[4] = new Train(122, "自強", "台中", "花蓮", 600);
		tr[5] = new Train(1222, "區間", "樹林", "七堵", 300);
		tr[6] = new Train(1254, "區間", "屏東", "基隆", 700);
		for (int i = 0; i < tr.length; i++) {
			set.add(tr[i]);
		}
		
//		Set沒有索引值不能直接使用傳統for迴圈印出
		
		//注意使用Iterator呼叫出來的next()要轉型成Train才能呼叫Train方法
		for(Iterator it = set.iterator();it.hasNext();) {
			((Train)it.next()).showTrain();
		}
//		使用for each取值
		for (Train trains : set) {
			trains.showTrain();
		}
	}
}
