package _etc;

class Person123 {
    private String name;
    private int age;

    public Person123(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // toString 메서드 오버라이드
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}

public class Example {
    public static void main(String[] args) {
        Person123 person = new Person123("John", 25);

        System.out.println();

        // String.valueOf() 사용
        String valueOfString = String.valueOf(person);
        System.out.println("String.valueOf(): " + valueOfString);

        // toString() 사용
        String toStringResult = person.toString();
        System.out.println("toString(): " + toStringResult);
    }
}