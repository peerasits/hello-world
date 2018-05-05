
import java.util.Scanner;

class ProductInfo1 {
    
    public String name;
    public int minPrice;
    public int maxPrice;

    ProductInfo1(String name,int[] prices) {
        this.name = name;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(Integer i : prices){
            if(i>max)
                max = i;
            if(i<min)
                min = i;
        }
        minPrice = min;
        maxPrice = max;
    }
    
    void printInfo (){
        System.out.println(name+" "+minPrice+" "+maxPrice);
    }
    
}

public class PriceRange {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int N = scan.nextInt();
        int[] prices = new int[N];
        for (int i = 0; i < N; ++i) {
            prices[i] = scan.nextInt();
        }
        ProductInfo pInfo = new ProductInfo(name, prices);
        pInfo.printInfo();
    }
}
