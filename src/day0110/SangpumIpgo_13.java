package day0110;


class Ipgo{
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


public class SangpumIpgo_13 {
    public static void main(String[] args) {
        Ipgo apple = new Ipgo();
        Ipgo orange = new Ipgo();

        apple.setName("사과");
        apple.setPrice(2500);

        orange.setName("오렌지");
        orange.setPrice(4400);

        System.out.println(apple.getName()+", " +apple.getPrice());
        System.out.println(orange.getName()+", " +orange.getPrice());
    }
}
