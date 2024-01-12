package day0112;

class Shop{
    private static int productNum;
    private String productName;
    private int productPrice;
    private String productColor;

    public Shop(String productName, int productPrice, String productColor) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productColor = productColor;
    }

    public static void printTitle(){
        System.out.println("[쌍용매장 입고상품]");
        System.out.println();
        System.out.println("번호\t\t상품명\t\t가격\t\t\t색상");
        System.out.println("========================================");
    }
    public void printProduct(){
        productNum++;
        System.out.printf("%d\t\t%s\t\t%d원\t\t%s\n",productNum,productName,productPrice,productColor);
    }

}




public class ArrReview_02 {
    public static void main(String[] args) {

        Shop [] shops = new Shop[4];
        shops[0] = new Shop("요가매트",25_000," 핑크");
        shops[1] = new Shop("  아령",30_000," 블랙");
        shops[2] = new Shop(" 레깅스",45_000,"베이지");
        shops[3] = new Shop("  나시",22_000,"화이트");

        Shop.printTitle();

        for(Shop shop:shops){
            shop.printProduct();
        }


    }
}
