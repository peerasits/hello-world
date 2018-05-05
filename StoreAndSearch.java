import java.util.Scanner;
import java.util.ArrayList;

class ProductInfo {
	public String name;
	public int minPrice;
	public int maxPrice;

	ProductInfo(String name, int[] prices) {
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

class Store {
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
	
	ArrayList<ProductInfo> search(String name){
		ArrayList <ProductInfo> products = new ArrayList<ProductInfo>();
		for(ProductInfo p : this.products) {
			if(p.name.indexOf(name) != -1) {
				//System.out.println(p);
				products.add(p);
			}
		}
		
		return products;
	}
}

public class StoreAndSearch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Store store = new Store();
		int K = scan.nextInt();
		for (int i = 0; i < K; ++i) {
			store.enterProductInfo(scan);
		}
		String productName = scan.next();
		ArrayList<ProductInfo> products = store.search(productName);
		System.out.println(products.size());
		if(products.size()==0)
			System.out.println("product not found");
		else {
			for(ProductInfo p : products) {
				p.printInfo();
			}
		}

	}
}