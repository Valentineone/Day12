package www.bit.java;

class Person {
    private String name;
    private Integer age;
    private String school;
    //alt + shift + insert

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person(String name, Integer age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;

    }
}
public class Test {
    public static void main(String[] args) {
        System.out.println();
    }
}
