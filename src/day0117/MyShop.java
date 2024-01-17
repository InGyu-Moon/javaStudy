package day0117;

public class MyShop {

    private String product;
    private int amount;
    private int price;
    private int total;

    public MyShop(String product, int amount, int price, int total) {
        this.product = product;
        this.amount = amount;
        this.price = price;
        this.total = total;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
