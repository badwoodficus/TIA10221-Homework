package homework7;

import java.io.Serializable;

public class Cat extends Animal implements Serializable {
	private String name;

	public Cat(String name) {
		this.name = name;
	}

	// 為了觀察輸出Object 而增加的方法
	public String getName() {
		return name;
	}

	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}

}
