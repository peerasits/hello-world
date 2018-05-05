import java.util.*;
class ProductInfo2 {

	public String name;
	public int minPrice;
	public int maxPrice;

	ProductInfo2(String name, int[] prices) {
		this.name = name;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (Integer i : prices) {
			if (i > max)
				max = i;
			if (i < min)
				min = i;
		}
		minPrice = min;
		maxPrice = max;
	}

	void printInfo() {
		System.out.println(name + " " + minPrice + " " + maxPrice);
	}

}

class Store1 {
	private ArrayList<ProductInfo> products = new ArrayList<>();

	void enterProductInfo(Scanner scan){
		String name = scan.next();
        int N = scan.nextInt();
        int[] prices = new int[N];
        for (int i = 0; i < N; ++i) {
            prices[i] = scan.nextInt();
        }
        products.add(new ProductInfo(name, prices));
	}
	void printAllProductInfo() {
		for(ProductInfo p : products) {
			p.printInfo();
		}
	}
	
}

public class StoreAndInsert {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Store store = new Store();
		int K = scan.nextInt();
		for (int i = 0; i < K; ++i) {
			store.enterProductInfo(scan);
		}
		store.printAllProductInfo();
	}

}
