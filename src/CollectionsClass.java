import java.util.*;
import java.util.stream.Stream;

public class CollectionsClass {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        User user5 = new User(5, "Zeynal");
        list.add(new User(8, "Esma"));
        list.add(user5);
        list.add(new User(1, "Xanlar"));
        list.add(user5);
        list.add(new User(5, "Xanlar1"));
        System.out.println(list);
//        Comparator.reverseOrder();
//        Comparator<Object> objectComparator = Collections.reverseOrder();
//        //Collections.sort(list, objectComparator);
//        System.out.println(list);
//        List<User> objects = new ArrayList<>();
//        //Collections.emptyList();
//        objects.addAll(list);
//
//        System.out.println(objects);
//
//        Deque<Integer> deque = new ArrayDeque<>();
//        deque.add(5);
//        deque.add(7);
//        Queue<Integer> lifoQueue = Collections.asLifoQueue(deque);
//        System.out.println(deque);
//        System.out.println(lifoQueue);
//        System.out.println(list);
        Collections.sort(list, Comparator.comparing(User::getId));
        System.out.println(list);
        int i = Collections.binarySearch(list, user5, Comparator.comparing(User::getId));
        System.out.println(i);
        List<User> list2 = new ArrayList();
//        List list1 = Collections.checkedList(list2, Integer.class);
//        list1.add(78);
//        list1.add("78");
        list2.add(new User(77, "XXX"));
        list2.add(new User(77, "XXX"));
        list2.add(new User(77, "XXX"));
        list2.add(new User(77, "XXyyX"));
        list2.add(new User(77, "XXX"));
        list2.add(new User(777, "XXX"));
        list2.add(new User(777, "XXX"));
        list2.add(new User(777, "XXX"));
        System.out.println(list2);
        Collections.copy(list2, list );
        System.out.println(list2);
        System.out.println(list);
        boolean disjoint = Collections.disjoint(list, list2);
        System.out.println(disjoint);
        Enumeration<User> enumeration = Collections.enumeration(list);
        System.out.println(enumeration.nextElement());
       // Collections.fill(list2, new User(1111, "no name"));
        System.out.println(list2);
        System.out.println(Collections.frequency(list, user5));
        System.out.println(Collections.indexOfSubList(list,list2));
        ArrayList<User> list1 = Collections.list(enumeration);
        System.out.println(list1);
        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list, Comparator.comparing(User::getId)));
        List<List<User>> lists = Collections.nCopies(3, list);
        System.out.println(lists);
        Map<Integer, Boolean> map = new HashMap<>();
        Set<Integer> integers = Collections.newSetFromMap(map);

        map.put(1, true);
        map.put(2, false);
        map.put(4, null);
        integers.add(5);
        integers.addAll(map.keySet());
        System.out.println(integers);
        Collections.replaceAll(list, user5, new User(111, "YYY"));
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.rotate(list, -2);
        System.out.println(list);
        Random rnd = new Random();
        Collections.shuffle(list, rnd);
        System.out.println(list);
        List<User> singleton = Collections.singletonList(user5);
        System.out.println(singleton);
        System.out.println(list);
        Collections.swap(list, 2,3);
        System.out.println(list);
        List<User> users = Collections.synchronizedList(list);
        List<User> users1 = Collections.unmodifiableList(list);
        list.add(user5);
        System.out.println(list);
//        users1.add(user5);
        Stream<String> stream = Stream.of("one", "two", "three", "four", "five");
        stream.filter(s -> s.startsWith("t"))
                .forEach(System.out::println);
    }
}
