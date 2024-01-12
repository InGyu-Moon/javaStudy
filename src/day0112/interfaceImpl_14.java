package day0112;

interface InterA{
    void sing();
    void draw();
}
interface InterB{
    void playGame();
    void write();
}
class Impl implements InterA,InterB{
    @Override
    public void sing() {
        System.out.println("sing");
    }

    @Override
    public void draw() {
        System.out.println("draw");
    }

    @Override
    public void playGame() {
        System.out.println("playGame");
    }

    @Override
    public void write() {
        System.out.println("write");
    }
}



public class interfaceImpl_14 {
    public static void main(String[] args) {
        Impl i = new Impl();
        i.draw();
        i.sing();
        i.playGame();
        i.write();

    }
}
