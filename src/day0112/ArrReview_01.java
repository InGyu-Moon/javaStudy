package day0112;

class Food{
    private String foodName;
    private int foodPrice;
    static int no;

    public Food(String foodName, int foodPrice) {
        this.foodName = foodName;
        this.foodPrice = foodPrice;
    }

    public void printInfo(){
        no++;
        System.out.println("[메뉴_"+no+"]");
        System.out.println("음식명: "+foodName);
        System.out.println("가격: "+foodPrice+"원");
        System.out.println("----------------------------");
    }

}



public class ArrReview_01 {
    public static void main(String[] args) {

        Food [] foods = new Food[3];

        foods[0]=new Food("마르게이타 피자",12_000);
        foods[1]=new Food("까르보나라 스파게티",15_000);
        foods[2]=new Food("리코타 셀러드",9_000);

        for(Food food:foods){
            food.printInfo();
        }



    }
}
