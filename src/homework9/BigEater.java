package homework9;

public class BigEater implements Runnable {
	String name;

	public BigEater(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i < 12; i++) {
			if (i == 11) {
				System.out.println(name + "吃完了！");
				continue;
			} else {
				System.out.println(name + "吃第" + i + "碗飯");
				try {
					Thread.sleep((int) (Math.random() * 3000) + 500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}

	public static void main(String[] args) {
		BigEater b1 = new BigEater("詹姆士");
		BigEater b2 = new BigEater("饅頭人");
		Thread t1 = new Thread(b1);
		Thread t2 = new Thread(b2);
		System.out.println("-----大胃王快食比賽開始！-----");
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("-----大胃王快食比賽結束！-----");

	}
}
