package day0112;

public class Manager_04 extends Employee_04{

    String depart;
    public Manager_04(String empName, int salary, String depart) {
        super(empName, salary);
        this.depart = depart;
    }

    // 하위 클래스에서 상위 클래스의 메서드를 수정해서 사용하는것
    // 리턴타입 동일, 메서드명 동일, 접근지정자는 확대만 가능
    // 당연히 static, final 메서드는 오버라이딩이 불가능하다
    @Override
    public String getEmployee() {
        return super.getEmployee()+","+depart;
    }
}
