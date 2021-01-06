package ComparatorInterface.SortCollectionByMoreThanOneField;

import java.util.Comparator;


public class StudentSortingComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {

        // for comparison
        int nameCompare = student1.getName().compareTo(student2.getName());
        int ageCompare = student1.getAge() - student2.getAge();

        // 2-level comparison using if-else block
        if(nameCompare == 0)
            return ((ageCompare == 0) ? nameCompare : ageCompare);
        else
            return nameCompare;
    }
}
