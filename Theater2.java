import java.util.Scanner;

class Theater {
	boolean threeD;
	boolean luxury;
	int totalSeat;
	boolean[] seats;

	String title;
	int basePrice;

	Theater(boolean threeD, boolean luxury, int seat) {
		this.threeD = threeD;
		this.luxury = luxury;
		totalSeat = seat;
		seats = new boolean[seat + 1];
	}

	void setTitle(String name) {
		if (name == null || name.length() == 0)
			System.out.println("invalid title");

		else {
			this.title = name;
		}
	}

	void setBasePrice(int basePrice) {
		if (basePrice <= 0)
			System.out.println("invalid price");
		else
			this.basePrice = basePrice;
	}

	void printInfo() {
		if (threeD)
			System.out.println("3D");
		else
			System.out.println("No 3D");
		if (luxury)
			System.out.println("Luxury");
		else
			System.out.println("Standard");
		System.out.println(seats.length - 1);
		if (title == null || title.length() == 0)
			System.out.println("title is not set");
		else
			System.out.println(title);
		if (basePrice > 0)
			System.out.println(basePrice);
		else
			System.out.println("price is not set");
	}
	
	int reserveOne(int seatNumber) {
		
		if(seatNumber>0 && seatNumber<=seats.length-1&&seats[seatNumber]==false) {
			seats[seatNumber] = true;
			return basePrice;
		}else {
			System.out.println("sorry");
			return -1;
		}
		
		
	}
	
	int reserveMultiple(int numSeats, int seatNumber) {
		
		numSeats--;
		if(seatNumber<=0 || seatNumber+numSeats>seats.length-1) {
			System.out.println("sorry");
			return -1;
		}
		for(int i = seatNumber;i<=seatNumber+numSeats;i++) {
			if(seats[i]==true) {
				System.out.println("sorry");
				return -1;
			}
		}
		
		for(int i = seatNumber;i<=seatNumber+numSeats;i++) {
			seats[i]=true;
		}
		return basePrice*(numSeats+1);
	}
}

	// Do not modify the code below. You must leave it as is.
public class Theater2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int threeD1 = scan.nextInt();
		int luxury1 = scan.nextInt();
		int numSeats = scan.nextInt();
		boolean threeD = false;
		boolean luxury = false;
		if (threeD1 == 1)
			threeD = true;
		if (luxury1 == 1)
			luxury = true;
		Theater t = new Theater(threeD, luxury, numSeats);

		String dummy = scan.nextLine(); // throw away new line character
		String title = scan.nextLine();
		t.setTitle(title);

		int basePrice = scan.nextInt();
		t.setBasePrice(basePrice);

		int N = scan.nextInt();
		for (int i = 0; i < N; ++i) {
			int numberOfSeats = scan.nextInt();
			int seatNumber = scan.nextInt();
			int totalPrice;
			if (numberOfSeats == 1)
				totalPrice = t.reserveOne(seatNumber);
			else
				totalPrice = t.reserveMultiple(numberOfSeats, seatNumber);
			if (totalPrice > 0)
				System.out.println(totalPrice);
		}

		t.printInfo();
	}
}