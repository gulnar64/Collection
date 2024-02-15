import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortClass {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        list.add(new User(3, "Esma"));
        list.add(new User(1, "Xanlar"));
        list.add(new User(5, "Xanlar2"));
        list.add(new User(5, "Xanlar1"));
        System.out.println(list);
        Comparator comparator = Comparator.comparing(User::getId, Comparator.nullsLast(Comparator.naturalOrder()));
        Comparator<User> comparator1 = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                User user1 = (User) o1;
                User user2 = (User) o2;
                if (user1.getId() > user2.getId())
                    return 1;
                else if (user1.getId() < user2.getId())
                    return -1;
                else {
                    return user1.getName().compareTo(user2.getName());
                }
            }
        };
        User user1 = new User(3, "Xanlar");
        User user2 = new User(1, "Xanlar");
        System.out.println(comparator1.compare(user1, user2));
        Comparator<User> userComparator = comparator1.thenComparing(User::getName);
        new User(7,"sdfgh");
       comparator1.reversed();
        // Comparator comparator =  Comparator.comparing(User::getId, Comparator.reverseOrder());

        Collections.sort(list, comparator1);
        System.out.println(list);
    }
}
