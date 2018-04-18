import java.util.ArrayList;
import java.util.Scanner;

abstract class Animal {
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
	
	public int getAge(){
		return age;
	}
	
	public double getWeight(){
		return weight;
	}


}

class Dog extends Animal {

	Dog(String name, String age, String weight) {
		super(name, age, weight);
	}

	public String speak() {
		return "Dog";
	}
}

class Cat extends Animal {
	Cat(String name, String age, String weight) {
		super(name, age, weight);
	}
	public String speak() {
		return "Cat";
	}
}

public class ReportDogCat {
	public static void main(String[] args) {
		ArrayList<Dog> dogs = new ArrayList<>();
		ArrayList<Cat> cats = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			String str = sc.nextLine();
			if (str.length() == 1) {
				double total = 0;
				double sumAge = 0;
				double sumWeight = 0;
				
				if (str.equals("Q")) {
					break;
				} else if (str.equals("D")) {
					total = dogs.size();
					for (Dog d : dogs) {
						d.print();
						sumAge += d.getAge();
						sumWeight += d.getWeight();
					}
					System.out.println((int)total+" Dogs, A:"+sumAge/total+", W:"+sumWeight/total);
					System.out.println("----------");
				} else if (str.equals("C")) {
					total = cats.size();
					for (Cat c : cats) {
						c.print();
						sumAge += c.getAge();
						sumWeight += c.getWeight();
					}
					System.out.println((int)total+" Cats, A:"+sumAge/total+", W:"+sumWeight/total);
					System.out.println("----------");
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
