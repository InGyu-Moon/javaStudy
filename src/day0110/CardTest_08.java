package day0110;

public class CardTest_08 {
    public static void main(String[] args) {

        Card.width=10;
        Card.height=20;

        System.out.println(Card.width);
        System.out.println(Card.height);

        Card c1 = new Card();
        System.out.println(c1.kind);
        System.out.println(c1.number);

        c1.kind="Heart";
        c1.number=7;

        Card c2 = new Card();




    }
}
