package ComparatorInterface.SortCollectionByMoreThanOneField;

import java.util.*;

public class Main {

    public static void main(String[] args){

        // Create ArrayList to store Student
        ArrayList<Student> arrayList = new ArrayList();

        Student student1 = new Student("Ajay", 27);
        Student student2 = new Student("Sneha", 23);
        Student student3 = new Student("Simran", 37);
        Student student4 = new Student("Ajay", 22);
        Student student5 = new Student("Ajay", 29);
        Student student6 = new Student("Sneha", 22);

        // Add customer objects to ArrayList
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        arrayList.add(student5);
        arrayList.add(student6);

        Iterator<Student> iterator = arrayList.iterator();

        System.out.println("Before Sorting : ");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // Sorting using Collections.sort(al, comparator);
        Collections.sort(arrayList, new StudentSortingComparator());

        System.out.println("After Sorting : ");
        for (Student student : arrayList)
            System.out.println(student);
    }
}
