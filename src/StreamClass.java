import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamClass {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        User user1 = new User(1, "Eyvaz");
        User user2 = new User(2, "Esma");
        User user3 = new User(3, "Eyvaz");
        User user4 = new User(2, "Esma2");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        System.out.println(users);
        List<User> usersEsma = new ArrayList<>();
        for (User user : users) {
            if (user.getName().equals("Esma")) {
                User userEsma = new User(user.getId(), user.getName());
                usersEsma.add(userEsma);
            }
        }
        System.out.println(usersEsma);
        List<User> usersEsmaStream = users.stream().filter(user -> user.getName().equals("Esma")).collect(Collectors.toList());
        System.out.println(usersEsmaStream);
        List<User> list = users.stream().toList();
        System.out.println(list);
        Iterator<User> iterator = users.stream().iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        boolean b = users.stream().allMatch(user -> user.getId() <= 1);
        System.out.println(b);
        boolean b1 = users.stream().anyMatch(user -> user.getId() <= 1);
        System.out.println(b1);
        List<User> userList = new ArrayList<>();
        boolean b2 = userList.stream().allMatch(user -> user.getId() <= 1);
        System.out.println("null: =" + b2);
        boolean b3 = userList.stream().anyMatch(user -> user.getId() <= 1);
        System.out.println(b3);
        System.out.println(users.stream().count());
        System.out.println(users.stream().distinct().toList());
        System.out.println(users.stream().dropWhile(user -> user.getId() >= 10).toList());
        System.out.println(users.stream().dropWhile(user -> user.getId() <= 2).toList());
        Optional<User> any = users.stream().findAny();
        Optional<User> first = users.stream().findFirst();
        Optional<User> anyNull = userList.stream().findAny();
        System.out.println(any.get().getName());
        System.out.println(first.get().getName());
        if (anyNull.isPresent())
            System.out.println(anyNull);
        if (anyNull.isEmpty())
            System.out.println(anyNull);
        List<String> list1 = users.stream().flatMap(user -> Stream.of(user.getName().toUpperCase())).toList();
        System.out.println(list1);
        IntStream intStream = users.stream().flatMapToInt(user -> IntStream.of(user.getId()));
        intStream.forEachOrdered(u -> System.out.println(u));
        //collect --3 parametr
        System.out.println(users.stream().toList());
        users.stream().mapToInt(user -> user.getId() * 10).forEachOrdered(u -> System.out.println(u));
        List<User> objectStream = users.stream().<User>mapMulti((user, consumer) -> {
            if (user.getId() <= 2)
                consumer.accept(user);
        }).toList();
        System.out.println(objectStream);
        IntStream intStream1 = users.stream().mapMultiToInt((user, consumer) -> {
            consumer.accept(user.getId());
        });
        intStream1.forEachOrdered(u -> System.out.println(u));
//        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
//        double percentage = .01;
//        List<Object> collect = integers.stream()
//                .mapMulti((integer, consumer) -> {
//                    if (integer % 2 == 0) {
//                        consumer.accept(integer * (1 + percentage));
//                    }
//                })
//                .collect(Collectors.toList());
        System.out.println(users.stream().max((user_1, user_2) -> user_1.getId() > user_2.getId() ? 1 : -1).get());
        System.out.println(users.stream().min((user_1, user_2) -> user_1.getId() > user_2.getId() ? 1 : -1).get());
        System.out.println(users.stream().noneMatch(user -> user.getId() == 4));
        System.out.println(userList.stream().noneMatch(user -> user.getId() == 4));
        System.out.println("    ");
        users.stream().peek(u -> System.out.println(u)).forEach(user -> System.out.println(user.getName().toUpperCase()));

        List<Integer> list2 = List.of(1, 2, 3, 4);
        /*System.out.println(list2.stream().reduce(1, (result, element) -> result * element));
        System.out.println(users.stream().reduce(new User(1, ""), (result, user) -> {
            user.setId(user.getId() * result.getId());
            user.setName(result.getName() + user.getName());
            return user;
        }));*/
        System.out.println(users.stream().skip(users.size() - 2).toList());
        System.out.println(users.stream().sorted().toList());
        System.out.println(users.stream().sorted((user_1, user_2) -> user_1.getName().compareTo(user_2.getName())).toList());
        System.out.println(users);
        System.out.println(users.stream().takeWhile(user -> user.getName().length() == 5).toList());
        Object[] array = users.stream().toArray();
        System.out.println(Arrays.toString(array));
        User[] array1 = users.stream().toArray(User[]::new);
        System.out.println(Arrays.toString(array1));
        Stream<User> stream = users.stream();
        stream.onClose(() -> System.out.println("Close olundu"));
        System.out.println("evvel");
        System.out.println(stream.isParallel());
        stream.parallel().sequential();
        System.out.println(stream.isParallel());
        Spliterator<User> spliterator = users.stream().spliterator();
        spliterator.forEachRemaining(s -> System.out.println(s));
        stream.close();
        System.out.println("sonra");
        System.out.println(users.stream().unordered().toList());

    }
}