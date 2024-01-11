package day0111;

class Member{
    private String name;
    private String gender;
    private String addr;
    static String ban;
    static int cnt = 0;

    public void setMemberData(String name, String gender, String addr){
        this.name=name;
        this.gender=gender;
        this.addr=addr;
    }

    public void writeMemberData(){
        System.out.println("**학생 "+cnt+" 정보**");
        System.out.println("소속학급 = " + Member.ban);
        System.out.println("name = " + name);
        System.out.println("gender = " + gender);
        System.out.println("addr = " + addr);
        System.out.println("----------------------");
    }


}

public class StaticObTest_05 {
}
