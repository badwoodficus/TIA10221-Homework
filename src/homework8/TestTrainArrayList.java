package homework8;

import java.util.*;


public class TestTrainArrayList {
	public static void main(String[] args) {
		ArrayList<Train> tr = new ArrayList<Train>(7);
		tr.add( new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		tr.add( new Train(1254, "區間", "屏東", "基隆", 700));
		tr.add( new Train(118, "自強", "高雄", "台北", 500));
		tr.add( new Train(1288, "區間", "新竹", "基隆", 400));
		tr.add( new Train(122, "自強", "台中", "花蓮", 600));
		tr.add( new Train(1222, "區間", "樹林", "七堵", 300));
		tr.add( new Train(1254, "區間", "屏東", "基隆", 700));

//		使用Arrays.sort(Comparator)
		tr.sort(new TrainComparator());

//		for(int i=0;i<tr.length;i++) {
//			((Train)tr).showTrain();
//		}
//		使用傳統for迴圈要使用 ArrayList.get(Index)取得
		for(int i=0;i<tr.size();i++) {
			(tr.get(i)).showTrain();
		}
//		使用for each迴圈取值
		for (Train trains : tr) {
			trains.showTrain();
		}
//		使用Iterator取值
		for(Iterator it = tr.iterator();it.hasNext();) {
			((Train)it.next()).showTrain();
		}
		
		
		
	}

}
