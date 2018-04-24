import java.util.Scanner;
class SavingAccount {
	public String accountNumber;
	private String accountName;
	private double amount;

	SavingAccount(String numb, String name) {
		accountNumber = numb;
		accountName = name;
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

public class RunSavingAccount {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		final int n = sc.nextInt();
		SavingAccount saveAcc = new SavingAccount("0-000-000", "");
		String s;
		for(int i = 0;i<n;i++){
			s = sc.next();
			if(s.equals("A"))
				saveAcc = new SavingAccount(sc.next(), sc.next());
			
			
			else if(s.equals("D")){
				saveAcc.deposit(Double.parseDouble(sc.next()));
				
			}
			else if(s.equals("C")){
				saveAcc.changeName(sc.next());
				
			}
			else if(s.equals("W")){
				saveAcc.withdraw(Double.parseDouble(sc.next()));
				
			}
			else if(s.equals("P") ){
				saveAcc.display();
			}
			
				
		}
	}
}
