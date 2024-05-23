package homework9;

/*熊大在念大學,生活費倚靠媽媽。媽媽怕熊大一天到晚領
錢亂花,不好好唸書,所以只要看到熊大帳戶的餘額超過
3000元,就會停止匯款給熊大;但要是帳戶餘額在2000元
以下,熊大就會要求媽媽匯款給他。如果帳戶餘額低於熊
大要提款的金額,熊大就會暫停提款,直到媽媽告知他錢
已經入帳戶。假設媽媽一次匯款 2000 元,熊大一次提款
1000元,寫一個Java程式模擬匯款10次與提款10次的情
形。
*/
/*進入DeadLock的條件是因為熊大領完錢但媽媽匯款沒有人領
 * 讓main Thread做事情等媽媽匯完錢?
 */
class Account {
	private int account = 0; // 帳戶內的錢

	synchronized public void deposit(int depot) {
		while(account > 3000) {
			try {
				System.out.println("\t帳戶餘額已超過3000,停止匯款");
				System.out.println("\t電話告知熊大帳戶有錢!");
				wait(); // 帳戶超過三千停止匯款，重點是先確認何時停止
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		account += depot;
		System.out.println("媽媽存入金額: " + depot + " 元");
		notify();
		
	}

	synchronized public void withdraw(int withd) {
		while(account < 1000) {
			System.out.println("\t\t\t\t餘額用罄，待匯款");
			try {	
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		account -= withd;
		System.out.println("\t\t\t\t熊大提款: " + withd + " 元");
		System.out.println("\t\t\t\t\t目前帳戶餘額: " + account);
		if (account <= 2000) {
			System.out.println("\t\t\t\t\t電話請求媽媽匯款");
			notify();
		}
		
	}

}

class Mom extends Thread {
	Account account;

	public Mom(Account account) {
		this.account = account;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			account.deposit(2000);
		}
	}
}

class Son extends Thread {
	Account account;

	public Son(Account account) {
		this.account = account;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			account.withdraw(1000);
		}
	}
}

public class AvoidDeadLock {
//	private static int account;
	public static void main(String[] args) {
		Account account = new Account();
		Mom mom = new Mom(account);
		Son son = new Son(account);
		mom.start();
		son.start();
		try {
			mom.join();
			son.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
