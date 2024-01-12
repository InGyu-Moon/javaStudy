package day0112;

class Emart{
    private String product;
    private int amount;

    public Emart() {
        product="딸기";
        amount=10;
    }

    public Emart(String product, int amount) {
        this.product = product;
        this.amount = amount;
    }

    public void writeMart(){
        System.out.println("product = " + product);
        System.out.println("amount = " + amount);

    }

}
class SeoulEmart extends Emart{
    private int price;

    public SeoulEmart() {
        price=10_000;
    }

    public SeoulEmart(String product, int amount, int price) {
        super(product, amount);
        this.price = price;
    }

    @Override
    public void writeMart() {
        System.out.println("price = " + price);
        super.writeMart();
    }
}


public class Inheri_06 {
    public static void main(String[] args) {

        SeoulEmart seoul1 = new SeoulEmart();
        seoul1.writeMart();

        System.out.println();

        SeoulEmart seoul2 = new SeoulEmart("수박",5,25_000);
        seoul2.writeMart();


    }
}
