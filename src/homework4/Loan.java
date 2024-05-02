package homework4;

/*
 * 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
表如下：()
 */
import java.util.Scanner;

public class Loan {

	public static void main(String[] args) {
		int[][] cash = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };
		System.out.println("阿文...你今天想要借多少錢?");
		Scanner sc = new Scanner(System.in);
		int loan = sc.nextInt();
		System.out.print("有錢可以借的員工編號:");
		int emp =0;
		for (int i = 0; i < cash.length ; i++) {
			for (int j = 0; j < cash[i].length; j++) {
				if (cash[i][j] >= loan) {
					System.out.print(cash[i][0]+"  ");
					emp ++;
				}
			}
		}
		System.out.print("共"+emp+"人!");
		sc.close();
	}

}
