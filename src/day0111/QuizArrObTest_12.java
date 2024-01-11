package day0111;

class MyInfo{
    private String name;
    private String mbti;
    private int age;
    public MyInfo(String name, String mbti, int age) {
        this.name = name;
        this.mbti = mbti;
        this.age = age;
    }

    @Override
    public String toString() {
        return "MyInfo{" +
                "name='" + name + '\'' +
                ", mbti='" + mbti + '\'' +
                ", age=" + age +
                '}';
    }

    public static void showTitle(){
        System.out.println("이름\t\tMBTI\t나이");
        System.out.println("======================");
    }
    public void showMyInfo(){
        System.out.println(name+"\t"+mbti+"\t"+age+"세");
    }
}

public class QuizArrObTest_12 {
    public static void main(String[] args) {

        MyInfo [] myInfos = new MyInfo[3];

        myInfos[0]=new MyInfo("이효리","ENTP",26);
        myInfos[1]=new MyInfo("이상순","ISFJ",33);
        myInfos[2]=new MyInfo("이영자","ENFJ",28);

        MyInfo.showTitle();

        for(MyInfo myInfo:myInfos){
            myInfo.showMyInfo();
        }


    }
}
