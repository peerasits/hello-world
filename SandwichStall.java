enum BreadMenu {
	WHEAT, ITALIAN, SESAME
};

enum MeatMenu {
	HAM, CHICKEN, BACON, TUNA, SALAMI, PEPERONI, MEATBALL, BEEF, TURKEY
};

enum SauceMenu {
	BBQ, KETCHUP, MUSTARD, THOUSANDISLAND, SWEETONION
}

enum CheeseMenu {
	AMERICAN, PROVOLONE, PEPPERJACK, SWISS, CHEDDAR
}

class Sandwich {
	private int id;
	private BreadMenu bread;
	private boolean size;
	private MeatMenu meat;
	private SauceMenu sauce;
	private CheeseMenu cheese;
	private boolean lettuce, tomato, cucumber, pepper, olive;
	private double cost;

	public Sandwich(int id, BreadMenu br, boolean size, MeatMenu me, SauceMenu sa, CheeseMenu ch) {
		this.id = id;
		bread = br;
		this.size = size;
		meat = me;
		sauce = sa;
		cheese = ch;
	}

	public void setVegies(boolean le, boolean to, boolean cu, boolean pe, boolean ol) {
		lettuce = le;
		tomato = to;
		cucumber = cu;
		pepper = pe;
		olive = ol;
	}

	public void setBread(int i) {
		if (i == 1)
			bread = BreadMenu.WHEAT;
		else if (i == 2)
			bread = BreadMenu.ITALIAN;
		else if (i == 3)
			bread = BreadMenu.SESAME;
	}

	public void setSize() {
		size = !size;
	}

	public void setMeat(int i) {
		if (i == 1) {
			meat = MeatMenu.HAM;
		} else if (i == 2) {
			meat = MeatMenu.CHICKEN;
		} else if (i == 3) {
			meat = MeatMenu.BACON;
		} else if (i == 4) {
			meat = MeatMenu.TUNA;
		} else if (i == 5) {
			meat = MeatMenu.SALAMI;
		} else if (i == 6) {
			meat = MeatMenu.PEPERONI;
		} else if (i == 7) {
			meat = MeatMenu.MEATBALL;
		} else if (i == 8) {
			meat = MeatMenu.BEEF;
		} else if (i == 9) {
			meat = MeatMenu.TURKEY;
		}
	}

	public void setSauce(int i) {
		if (i == 1) {
			sauce = SauceMenu.BBQ;
		} else if (i == 2) {
			sauce = SauceMenu.KETCHUP;
		} else if (i == 3) {
			sauce = SauceMenu.MUSTARD;
		} else if (i == 4) {
			sauce = SauceMenu.THOUSANDISLAND;
		} else if (i == 5) {
			sauce = SauceMenu.SWEETONION;
		}
	}

	public void setCheese(int i) {
		if (i == 1) {
			cheese = CheeseMenu.AMERICAN;
		} else if (i == 2) {
			cheese = CheeseMenu.PROVOLONE;
		} else if (i == 3) {
			cheese = CheeseMenu.PEPPERJACK;
		} else if (i == 4) {
			cheese = CheeseMenu.SWISS;
		} else if (i == 5) {
			cheese = CheeseMenu.CHEDDAR;
		}
	}

	public double calculateCost() {
		double price = 0;
		if (!size) {
			price += 49;
		} else {
			price += 89;
		}
		if(meat.toString().equals(MeatMenu.BEEF.toString()) | meat.toString().equals(MeatMenu.TURKEY.toString()))
			price+=(price*0.1);
		return price;
	}
	public void display(int i){
		if(i==id){
			String sizeStr = "";
			if(size)
				sizeStr = "F";
			else
				sizeStr = "H";
			System.out.println(bread+" "+sizeStr+" "+meat+" "+cheese+" "+sauce+" "+String.format("%.2f", cost));
		//	, TOMATOES, CUCUMBER, PEPPERS, OLIVES
			if(lettuce)
				
				System.out.print("LETTUCE");
			if(tomato)
				System.out.print("TOMATOES");
			if(cucumber)
				System.out.print("CUCUMBER");
			if(pepper)
				System.out.print("PEPPERS");
			if(olive)
				System.out.print("OLIVES");
			System.out.println();
		}
	}

}

public class SandwichStall {

}
