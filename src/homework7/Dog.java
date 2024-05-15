package homework7;

import java.io.Serializable;

public class Dog extends Animal implements Serializable {
	private String name;

	public Dog(String name) {
		this.name = name;
	}

	// 為了觀察輸出Object 而增加的方法
	public String getName() {
		return name;
	}

	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}
