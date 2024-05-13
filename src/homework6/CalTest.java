package homework6;

import java.util.*;
//  到底怎麼處理Mismatch 還要讓程式回到輸入x?
public class CalTest {
//	static Scanner scanner = new Scanner(System.in);
//	檢查輸入的文字是否為int
//	是否有方法覆寫這個來判斷輸入的是不是int?
//	static int nextInt() {
//        String input = scanner.next();
//        while(!input.matches("\\d*")) {
//            System.out.println("請輸入數字");
//            input = scanner.next();
//        }
//        return Integer.parseInt(input);
//    }
	public static void main(String[] args) {
		
		
		Calculator cal = new Calculator();
		while (true) {  //讓程式在完成計算前可以一直輸入直到符合格式為止
			try {
				Scanner sc = new Scanner(System.in); //把Scanner放在try裡面就解決了
				System.out.println("請輸入x的值:");
				cal.setX(sc.nextInt());
				System.out.println("請輸入y的值:");
				cal.setY(sc.nextInt());
				System.out.println(cal.getX() + "的" + cal.getY() + "次方等於" + cal.powerXY(cal.getX(), cal.getY()));
				sc.close();
				break; //如果程式走到這裡表示達成目的所以跳離迴圈
			}
			catch(InputMismatchException e){
				System.out.println("請輸入正確格式!");
//				應該是有方法停止無限迴圈並且不要讓下面那一行出現但我還沒想到先放著
//				System.out.println("請隨意輸入重啟程式:"+sc.next());
			}
			catch (CalException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
//				應該是有方法停止無限迴圈並且不要讓下面那一行出現但我還沒想到先放著
//				System.out.println("請隨意輸入重啟程式:"+sc.next());
			}
		}
		
	}
}
