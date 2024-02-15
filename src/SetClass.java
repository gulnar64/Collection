import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class SetClass {
    public static void main(String[] args) {
        LinkedHashSet<Student> hashSet = new LinkedHashSet<>();
        Student student1 = new Student(1, "Esma");
        Student student2 = new Student(1, "Esma");
        Student student3 = new Student(1, "Esma");
        Student student6= new Student(6, "Esma1");
        Student student4= new Student(4, "Esma2");
        Student student8= new Student(8, "Esma11");

        TreeSet<Student> treeSet = new TreeSet<>();
        treeSet.add(student1);
        treeSet.add(student2);
        treeSet.add(student3);
        treeSet.add(student6);
        treeSet.add(student4);
        treeSet.add(student8);
        System.out.println(treeSet);
        System.out.println(treeSet.headSet(student6));
        System.out.println(treeSet.headSet(student6, false));
        System.out.println(treeSet.headSet(student6, true));

        System.out.println("  ");
        System.out.println(treeSet.tailSet(student6));
        System.out.println(treeSet.tailSet(student6, false));
        System.out.println(treeSet.tailSet(student6, true));

        System.out.println("    ");
        System.out.println(treeSet.ceiling(student1)); //>=
        System.out.println(treeSet.floor(student1)); //<=
        System.out.println(treeSet.higher(student1)); //>
        System.out.println(treeSet.lower(student1)); //<


        System.out.println("    ");
        System.out.println(treeSet.subSet(student6, student8));
        System.out.println(treeSet.subSet(student6, true, student8, true));
        System.out.println(treeSet.subSet(student6, false, student8, true));

        System.out.println("    ");

    }
}
