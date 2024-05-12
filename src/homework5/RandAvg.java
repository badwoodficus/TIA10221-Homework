package homework5;
//請設計一個方法為randAvg()，從10個 0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
import java.util.Arrays;
import java.util.random.*;
public class RandAvg {
	private int [] ra = new int[10];
	private int sum = 0;
	
	public RandAvg () {
		
	}
	
	public void randAvg() {
		for(int i = 0 ; i< ra.length;i++) {
			ra[i]=(int)(Math.random()*100+1);
			System.out.print(ra[i]+" ");
			sum += ra[i];
		}System.out.print("十數的平均為: "+ (sum/10d));
	}
	
	public static void main(String[] args) {
		RandAvg avg = new RandAvg();
		avg.randAvg();
	}
}
