import java.util.ArrayList;
import java.util.Scanner;

abstract class Animal{
	private String name;
	private int age;
	private double weight;
	
	Animal(String name, String age, String weight){
		this.name = name;
		this.age = Integer.parseInt(age);
		this.weight = Double.parseDouble(weight);
	}

	public void print() {
		System.out.println(name + " " + age + " " + weight);
	}

	public abstract String speak();
	

}

class Dog1 extends Animal {

	Dog1(String name, String age, String weight) {
		super(name, age, weight);
	}

	public String speak() {
		return "Dog";
	}
}

class Cat1 extends Animal {
	Cat1(String name, String age, String weight) {
		super(name, age, weight);
	}
	public String speak() {
		return "Cat";
	}
}

public class SaveDogCat {
	public static void main(String[] args) {
		ArrayList<Dog> dogs = new ArrayList<>();
		ArrayList<Cat> cats = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			String str = sc.nextLine();
			if (str.length() == 1) {
				
				if (str.equals("Q")) {
					break;
				} else if (str.equals("D")) {
					
					for (Dog d : dogs) {
						d.print();
					}
					
				} else if (str.equals("C")) {
					for (Cat c : cats) {
						c.print();
					}
				}
			} else if (str.length() != 1) {
				String[] strs = str.split(" ");

				if (strs[3].equals("D")) {
					dogs.add(new Dog(strs[0], strs[1], strs[2]));
				} else if (strs[3].equals("C")) {
					cats.add(new Cat(strs[0], strs[1], strs[2]));
				}
			}

		}
	}
}
