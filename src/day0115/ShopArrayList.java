package day0115;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopArrayList {

    List<Shop> shopList = new ArrayList<>();
    public void addProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.print("상품명: ");
        String productName = sc.nextLine();
        System.out.print("가격: ");
        int price = Integer.parseInt(sc.nextLine());
        System.out.print("수량: ");
        int amount = Integer.parseInt(sc.nextLine());

        shopList.add(new Shop(productName,amount,price));

        System.out.println("입고완료");
    }
    public void getProductData(){
        System.out.println("No.\t상품명\t가격\t수량\t총액");

        for (int i=0;i<shopList.size();i++){
            Shop shop = shopList.get(i);
            System.out.printf("%d\t%s\t%d\t%d\t%d\n",i+1,shop.getProductName(),shop.getPrice(),shop.getAmount(),shop.getPrice()*shop.getAmount());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShopArrayList sl = new ShopArrayList();
        while (true){
            System.out.println("1.상품입고  2.상품출고  9.종료");
            int num = sc.nextInt();

            if(num==1){
                sl.addProduct();
            } else if (num == 2) {
                sl.getProductData();
            } else if (num == 9) {
                System.out.println("종료합니다.");
                break;
            }
        }



    }
}
