package day0110;

public class StudentMain_10 {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.studentName="이효리";
        s1.studentAge=22;

        s2.studentName="이상순";
        s2.studentAge=30;

        Student.schoolName="쌍용고등학교";

        System.out.println("**클래스 맴버값 출력**");
        System.out.println("Student.schoolName = " + Student.schoolName);
        System.out.println("**학생1정보**");
        System.out.println("s1.studentName = " + s1.studentName);
        System.out.println("s1.studentAge = " + s1.studentAge);
        System.out.println("**학생2정보**");
        System.out.println("s2.studentName = " + s2.studentName);
        System.out.println("s2.studentAge = " + s2.studentAge);



    }
}
