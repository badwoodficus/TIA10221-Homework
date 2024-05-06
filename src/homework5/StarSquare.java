package homework5;

import java.util.Scanner;

public class StarSquare {
	private static int width = 0;
	private static int height = 0;
	public void starSquare(int width,int height) {
		for(int i = 0;i<=height-1;i++) {
			for(int j =0;j<=width-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入想要的寬度: ");
		width = sc.nextInt();
		System.out.println("請輸入想要的高度: ");
		height = sc.nextInt();
		System.out.println("☆星陣如下★");
		StarSquare sq = new StarSquare();
		sq.starSquare(width, height);
		sc.close();
	}
}
