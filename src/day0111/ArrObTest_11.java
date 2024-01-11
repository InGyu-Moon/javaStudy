package day0111;

class Shop{
    private String product;
    private int price;
    private String color;

    public Shop(String product, int price, String color) {
        this.product = product;
        this.price = price;
        this.color = color;
    }

    public static void showTitle(){
        System.out.println("상품명\t가격\t\t색상");
        System.out.println("======================");
    }
    public void showShop(){
        System.out.println(product+"\t\t"+price+"\t"+color);
    }

}

public class ArrObTest_11 {
    public static void main(String[] args) {
        Shop [] shops = {
                new Shop("AAA",1200,"red"),
                new Shop("BBB",1900,"blue"),
                new Shop("CCC",3400,"green"),
                new Shop("DDD",2700,"yellow")
        };

        Shop.showTitle();

        for(Shop shop:shops){
            shop.showShop();
        }

    }



}
