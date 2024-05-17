package homework8;

import java.util.*;

class TrainComparator implements Comparator<Train> {
	@Override
	public int compare(Train t1, Train t2) {
		if (t1.getNumber() < t2.getNumber()) {
			return 1;
		} else if (t1.getNumber() == t2.getNumber()) {
			return 0;
		} else {
			return -1;
		}
	}
}

public class TestTrainPriorityQueue {
	public static void main(String[] args) {
		Set<Train> set = new TreeSet<Train>();

		Train[] tr = new Train[7];
		tr[0] = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		tr[1] = new Train(1254, "區間", "屏東", "基隆", 700);
		tr[2] = new Train(118, "自強", "高雄", "台北", 500);
		tr[3] = new Train(1288, "區間", "新竹", "基隆", 400);
		tr[4] = new Train(122, "自強", "台中", "花蓮", 600);
		tr[5] = new Train(1222, "區間", "樹林", "七堵", 300);
		tr[6] = new Train(1254, "區間", "屏東", "基隆", 700);

		TrainComparator ct = new TrainComparator();
		PriorityQueue<Train> trains = new PriorityQueue<Train>(7, ct);
		for (int i = 0; i < tr.length; i++) {
			trains.offer(tr[i]);
		}

		Train t;

		while ((t = trains.poll()) != null) {
			t.showTrain();
		}

	}

}
