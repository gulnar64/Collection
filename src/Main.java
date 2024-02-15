import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
//        List list = new ArrayList();
//        List<String> strList = new ArrayList<>();
//        String[] str = new String[10];
//        int[] intArr;
//        strList.add("element 1");
//        strList.add("element 2");
//        System.out.println(strList);
//        //1
//        for(String str1:strList )
//            System.out.println(str1);
//        for(int i=0;i<strList.size();i++)
//            System.out.println(strList.get(0));
//        Iterator<String> iterator = strList.iterator();
//        System.out.println("Iterator 1 ");
//        while(iterator.hasNext()) {
//            iterator.remove();
//            System.out.println(iterator.next());
//        }
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        Iterator<Integer> iterator = list.iterator();
//        iterator.forEachRemaining(element -> {
//            System.out.println(element);
//        });
        System.out.println("next");
        ListIterator<Integer> listIterator = list.listIterator();

        listIterator.add(4);
        listIterator.add(6);  //0
        System.out.println("next index: " + listIterator.nextIndex());
        while (listIterator.hasNext()) {//1
            Integer next = listIterator.next();
            System.out.println(next);
        }

        listIterator.set(11);
        System.out.println("previous");
        while (listIterator.hasPrevious())
            System.out.println(listIterator.previous());

        listIterator.set(22);   while (listIterator.hasNext()) {//1
            Integer next = listIterator.next();
            System.out.println(next);

        }
    }
}