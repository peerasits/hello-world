import java.util.Scanner;
import java.util.ArrayList;

class SavingAccount {
	public String accountNumber;
	private String accountName;
	private double amount;

	SavingAccount(String numb, String name) {
		accountNumber = numb;
		accountName = name;
	}
	
	public String getAccountNumber(){
		return accountNumber;
	}

	public void changeName(String name) {
		accountName = name;
	}

	public void deposit(double amount) {
		if (amount >= 0)
			this.amount += amount;
	}

	public void withdraw(double amount) {
		if (this.amount - amount >= 0) {
			this.amount -= amount;
		} else {
			System.out.println("AMOUNT IN ACCOUNT $" + String.format("%.1f", this.amount) + ". PLEASE TRY AGAIN.");
		}
	}

	public void display() {

		System.out.println("ACCOUNT NUMBER:" + accountNumber);
		System.out.println("ACCOUNT NAME:" + accountName);
		System.out.println("AMOUNT:$" + String.format("%.2f", amount));
	}
}

public class CreditUnion {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		final int n = sc.nextInt();
		ArrayList <SavingAccount> saveAccs = new ArrayList<>();
		
		String s;
		for(int i = 0;i<n;i++){
			s = sc.next();
			if(s.equals("A"))
				saveAccs.add(new SavingAccount(sc.next(), sc.next()));
			
			
			else if(s.equals("D")){
				String accountNumber = sc.next();
				Double amount = Double.parseDouble(sc.next());
				for(SavingAccount sa : saveAccs){
					if(sa.getAccountNumber().equals(accountNumber)){
						sa.deposit(amount);
					}
				}
				//saveAcc.deposit(Double.parseDouble(sc.next()));
				
			}
			else if(s.equals("C")){
				String accountNumber = sc.next();
				String name = sc.next();
				for(SavingAccount sa : saveAccs){
					if(sa.getAccountNumber().equals(accountNumber)){
						sa.changeName(name);
					}
				}
				
				
			}
			else if(s.equals("W")){
				String accountNumber = sc.next();
				Double amount = Double.parseDouble(sc.next());
				for(SavingAccount sa : saveAccs){
					if(sa.getAccountNumber().equals(accountNumber)){
						sa.withdraw(amount);
					}
				}
				//saveAcc.withdraw(Double.parseDouble(sc.next()));
				
			}
			else if(s.equals("P") ){
				String accountNumber = sc.next();
				boolean found = false;
				for(SavingAccount sa : saveAccs){
					if(sa.getAccountNumber().equals(accountNumber)){
						found = true;
						sa.display();
					}
				}
				//saveAcc.display();
				if(!found)
					//ACCOUNT NUMBER 1-223-7684 IS NOT FOUND.
					System.out.println("ACCOUNT NUMBER "+accountNumber+" IS NOT FOUND.");
			}
			
				
		}
	}
}
