import java.util.Scanner;
import java.util.ArrayList;

abstract class Shape {
	private String name;
	private double area;

	Shape(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	abstract public void calArea();

	public void setArea(double area) {
		this.area = area;
	}

	public double getArea() {
		return area;
	}
}

class Square extends Shape {
	private double width;

	Square(String s, double width) {
		super(s);
		this.width = width;
		calArea();
	}

	public void calArea() {
		double area = Math.pow(width, 2.0);
		//System.out.println(area);
		setArea(area);
	}
}

class Rectangle extends Shape {
	private double width, height;

	Rectangle(String s, double w, double h) {
		super(s);
		width = w;
		height = h;
		calArea();
	}

	public void calArea() {
		double area = width * height;
		//System.out.println(area);
		setArea(area);
	}
}

class Circle extends Shape {
	private double radius;

	Circle(String s, double r) {
		super(s);
		radius = r;
		calArea();
	}

	public void calArea() {
		double area = Math.PI * (Math.pow(radius, 2.0));
		//System.out.println(area);
		setArea(area);
	}
}

public class ShapeSelection {
	public static void main(String[] args) {
		ArrayList<Shape> s = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		double[][] data = new double[3][2];
		while (true) {
			String type = sc.next();
			if (type.equals("Q"))
				break;

			else if (type.equals("R")) {
				s.add(new Rectangle(type, sc.nextDouble(), sc.nextDouble()));

			} else if (type.equals("S")) {

				double width = sc.nextDouble();

				s.add(new Square(type, width));
			} else if (type.equals("C")) {
				s.add(new Circle(type, sc.nextDouble()));
			} else {
				int index = Integer.parseInt(type);
				Shape result = s.get(index);
				if (result != null) {
					//System.out.println(result.getArea());
					if (result.getName().equals("R")) {
						data[0][0]++;
						data[0][1] += result.getArea();
					} else if (result.getName().equals("S")) {
						data[1][0]++;
						data[1][1] += result.getArea();
					} else if (result.getName().equals("C")) {
						data[2][0]++;
						data[2][1] += result.getArea();
					}
				}

			}
		}

		System.out.println((int) data[0][0] + " Rectangle(s), Area = " + String.format("%.1f", data[0][1]));
		System.out.println((int) data[1][0] + " Square(s), Area = " + String.format("%.1f", data[1][1]));
		System.out.println((int) data[2][0] + " Circle(s), Area = " + String.format("%.1f", data[2][1]));
	}
}
