package day0112;

class School{
    public static final String SCHOOL_NAME = "쌍용고등학교";
    private String schoolAddr;
    private int studentCount;
    private int teacherCount;

    public School() {
        this("강남구 역삼동",120,10);
    }

    public School(String schoolAddr, int studentCount, int teacherCount) {
        this.schoolAddr = schoolAddr;
        this.studentCount = studentCount;
        this.teacherCount = teacherCount;
    }

    public void writeData(){
        System.out.println("schoolAddr = " + schoolAddr);
        System.out.println("studentCount = " + studentCount);
        System.out.println("teacherCount = " + teacherCount);
    }

    public String getSchoolAddr() {
        return schoolAddr;
    }

    public void setSchoolAddr(String schoolAddr) {
        this.schoolAddr = schoolAddr;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public int getTeacherCount() {
        return teacherCount;
    }

    public void setTeacherCount(int teacherCount) {
        this.teacherCount = teacherCount;
    }
}

class Student extends School{
    private String studentName;
    private int grade;

    public Student() {
    }

    public Student(String schoolAddr, int studentCount, int teacherCount, String studentName, int grade) {
        super(schoolAddr, studentCount, teacherCount);
        this.studentName = studentName;
        this.grade = grade;
    }

    @Override
    public void writeData() {
        System.out.println("학교명: "+SCHOOL_NAME);
        super.writeData();
        System.out.println("studentName = " + studentName);
        System.out.println("grade = " + grade);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}


public class Inherit_07 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.writeData();
        System.out.println("===============");
        Student s2 = new Student("영등포구",300,35,"김숙",2);
        s2.writeData();

    }
}
