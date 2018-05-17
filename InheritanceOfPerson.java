

class Person{
	protected String name;
	protected String  idNumber;
	protected String address;
	
	public void Person(){
		name = "";
		idNumber = "";
		address = "";
	}
	
	public void Person(String name){
		 this.name = name;
		 idNumber = "";
		 address = "";
	 }
	public void  setName(String name){
		 this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public String  getAddress(){
		return address;
	}
}
class  Employee extends Person	{
	private String position;
	private double salary;
	
	public Employee(){
		super();
		position = "Worker";
		salary = 9000;
	}
	
	public Employee(String position,double money){
		super();
		this.position = position;
		salary = money;
		
				
	}
	
	public void promote(String position, double money){
		this.position = position;
		salary = money;
	}
	
	public void printDetail() {
		System.out.println(name);
		System.out.println(address);
		System.out.println(position);
		System.out.println(salary);
	}
}

class HourlyEmployee extends Person{
	private int hours;
	private double wage;
	HourlyEmployee() {
		super();
	}
	public HourlyEmployee(double wage){
		super();
		this.wage = wage;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public void setWage(double wage){
		this.wage = wage;
	}
	
	public double  totalWage() {
		return hours*wage;
	}
}

public class InheritanceOfPerson {
	public static void main(String[] args){
		Person x = new Person();
		x.name = "Swan Patipan";
		x.idNumber = "2676354187365";
		x.address = "56 Jaktujak Bangkok";
		System.out.println(x.getName()+":"+x.getAddress());
		x = new Employee();
		x.name = "Iti Para";
		x.idNumber = "2176872865276";
		x.address = "43 Taweewattana Bangkok";
		System.out.println(x.getName()+":"+x.getAddress());
	}
}
