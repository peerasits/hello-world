
import java.util.Scanner;

class House2 {
    int landSize, quality, floors, houseArea ;
    public int price;
    int computePrice() {
        int price = 0;
        price += landSize*10000;
        if(floors>1){
            for(int i = floors;i>1;i--){
                price+=200000;
            }
        }
        if(quality == 1){
            price += houseArea*10000;
        }else if(quality == 2){
            price += houseArea*8000;
        }else if(quality == 3){
            price += houseArea*5000;
        }
    return price;
}
    House2(int landsize,int quality, int floors,int houseArea ){
        this.landSize = landsize;
        this.quality = quality;
        this.floors = floors;
        this.houseArea = houseArea;
        price = computePrice();
    }
    
}

public class HousePrice1 {
    // Do not change the code below this line.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int landSize = scan.nextInt();
        int quality = scan.nextInt();
        int floors = scan.nextInt();
        int houseArea = scan.nextInt();

        House house
                = new House(landSize, quality, floors, houseArea);
        System.out.println(house.landSize + " "
                + house.quality + " " + house.floors + " "
                + house.houseArea);
        System.out.println(house.price);
    }
}
