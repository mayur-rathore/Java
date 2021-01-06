package ComparatorInterface.SortCollectionByOneField;

import java.util.*;

public class Main {

    // Problem statement - Suppose we have an arraylist of our own class type, containing fields like rollno,
    // name, address, DOB etc and we need to sort the array based on Roll no or name?
    public static void main(String[] args){

        List<Student> arrList = new ArrayList<>();          // arraylist of our own class type
        arrList.add(new Student(111, "bbb", "London"));
        arrList.add(new Student(222,"aaa", "nyc"));
        arrList.add(new Student(333, "ccc", "Jaipur"));

        System.out.println("Unsorted list : ");
        for (Student student : arrList)
            System.out.println(student);

        // Sort the arrayList based on roll no
        Collections.sort(arrList, new Sortbyroll());

        System.out.println("Sorted by rollNo : ");
        for(Student student : arrList)
            System.out.println(student);

        // Sort the arrayList based on name
        Collections.sort(arrList, new Sortbyname());

        System.out.println("Sorted by name : ");
        for (int i=0; i<arrList.size(); i++)
            System.out.println(arrList.get(i));
    }
}
