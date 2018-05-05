
import java.util.Scanner;
import java.util.ArrayList;

class House {

    int landSize, quality, floors, houseArea;
    public int price;

    int computePrice() {
        int price = 0;
        price += landSize * 10000;
        if (floors > 1) {
            for (int i = floors; i > 1; i--) {
                price += 200000;
            }
        }
        if (quality == 1) {
            price += houseArea * 10000;
        } else if (quality == 2) {
            price += houseArea * 8000;
        } else if (quality == 3) {
            price += houseArea * 5000;
        }
        return price;
    }

    House(int landsize, int quality, int floors, int houseArea) {
        this.landSize = landsize;
        this.quality = quality;
        this.floors = floors;
        this.houseArea = houseArea;
        price = computePrice();
    }

}

public class HousePrice2 {
    // Do not change the code below this line.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<House> houses = new ArrayList<>();
        final int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int landSize = scan.nextInt();
            int quality = scan.nextInt();
            int floors = scan.nextInt();
            int houseArea = scan.nextInt();
            houses.add(new House(landSize, quality, floors, houseArea));
        }
        int maximunPrice = scan.nextInt(), minimunLandSize = scan.nextInt();
        boolean found = false;
        for (House house : houses) {
            if (house.price <= maximunPrice && house.houseArea >= minimunLandSize) {
                System.out.print(house.landSize + " "
                        + house.quality + " " + house.floors + " "
                        + house.houseArea);
                System.out.println(" " + house.price);
                found = true;
            }
        }
        
        if(!found){
            System.out.println("none");
        }

    }
}
