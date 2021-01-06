package ComparatorInterface.SortCollectionByMoreThanOneField;

public class Student {

    String name;
    int age;

    // Parameterized constructor
    public Student( String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // overriding toString() method
    public String toString(){
        return this.name + ": " + this.age;
    }
}
