package ComparatorInterface.SortCollectionByOneField;

import java.util.Comparator;

public class Sortbyroll implements Comparator<Student> {

    // Used for sorting in ascending order of roll number
    @Override
    public int compare(Student a, Student b) {
        return a.rollno - b.rollno;
    }
}
