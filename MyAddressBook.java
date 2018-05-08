import java.util.*;
class Contact{
	public String name;
	private String address;
	private ArrayList<String> phone;
	
	public Contact(){
		phone = new ArrayList<>();
	}
	
	public Contact(String name){
		this();
		this.name = name;
	}
	public Contact(String name, String address){
		this(name);
		this.address = address;
	}
	public boolean phoneValidation(String p) {
		if(p.length()==9){
			if(p.charAt(0)=='0'){
				for(int i = 1;i<p.length();i++){
					if(p.charAt(i)<'0'||p.charAt(i)>'9'){
						return false;
					}
				}
				return true;
			}
			else{
				return false;
			}
			
		}else{
			return false;
		}
		
	}
	public int addPhone(String p){
		if(phoneValidation(p)){
			phone.add(p);
			return phone.size();
		}else{
			System.out.println("error");
			return -1;
		}
	}
	
	public int removePhone(String p) {
		for(String s : phone){
			if(p.equals(s)){
				phone.remove(p);
				return phone.size();
			}
		}
		
		return -1;
	}
	
	public void printPhone(){
		System.out.print("[");
		for(int i = 0;i<phone.size();i++){
			if(i==phone.size()-1){
				System.out.print(phone.get(i));
			}
			else{
				System.out.print(phone.get(i)+", ");
			}
		}
		System.out.println("]");
	}
	public void setAddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return address;
	}
	public String getName() {
		return name;
	}
}
class  AddressBook{
	ArrayList<Contact> list;
	private int index;
	
	public AddressBook() {
		list = new ArrayList<>();
		index = list.size();
	}
	
	public int add(Contact c){
		list.add(c);
		index = list.size();
		return list.size();
	}
	
	public int remove(int n){
		list.remove(n);
		index = list.size();
		return list.size();
	}
	
	public Contact search(String n){
		for(Contact c : list){
			if(c.getName() == n){
				return c;
			}
		}
		return null;
	}
}
public class MyAddressBook {
	public static void main(String[] arggs){
		AddressBook a = new AddressBook();
		Contact x = new Contact("Amanda Kar","234 Maung Tak");
		System.out.println(a.add(x));
		x.addPhone("089764783");
		x.addPhone("055098763");
		Contact y = new Contact("Preera Chaiyo");
		y.setAddress("63 SaparnMai Road Soi 5 Tabsakae Ayuthaya");
		a.add(y);
		System.out.println(a.list.get(0).name+" : "+a.list.get(0).getAddress());
		a.list.get(0).printPhone();
		System.out.println(a.list.get(1).name+" : "+a.list.get(1).getAddress());
		a.list.get(1).printPhone();
		 
		 }
}
