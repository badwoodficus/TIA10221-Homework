package homework6;

import java.util.InputMismatchException;

public class Calculator {
	private int x;
	private int y;

	public Calculator() {

	}

	public Calculator(int x, int y) throws CalException {
		setX(x);
		setY(y);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

//	依題目要求應該要分開設定setter method
//	public void setXY(int x , int y) throws CalException {
//		if(x>0&&y>0) {
//		this.x = x;
//		this.y = y;
//		}else if(x==0 && y == 0) {
//			throw new CalException("0的0次方沒有意義！");
//		}else if(x>0 && y <0) {
//			throw new CalException("次方為負值回傳不是整數！");
//		}
//	}
	
//	應該要在set方法內處理輸入的不是int
	
	public void setX(int x) throws CalException {
		if (x >= 0) {
			this.x = x;
		} else if (x < 0) {
			throw new CalException("請輸入正整數!");
		} else {
			throw new CalException("輸入格式不正確");
		}
	}

	public void setY(int y) throws CalException {
		if (y > 0) {
			this.y = y;
		} else if (x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義！");
		} else if (y == 0) {
			this.y = y;
		} else if (y < 0) {
			throw new CalException("次方為負值回傳不是整數!");
		} else {
			throw new CalException("輸入格式不正確");
		}
	}

//	MATH.pow使用的是doub需要做typecastingng
	public int powerXY(int x, int y) {
		return (int) (Math.pow(x, y));
	}
}
