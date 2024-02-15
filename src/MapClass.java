import java.util.*;

public class MapClass {
    public static void main(String[] args) {
        Map<Student, Student> map = new HashMap<>();
        Student studentKey1 = new Student(1, "Key1");
        Student studentKey2 = new Student(2, "Key2");
        Student studentKey3 = new Student(3, "Key3");
        Student studentKey4 = new Student(4, "Key4");
        Student studentValue1 = new Student(1, "Value1");
        Student studentValue2 = new Student(1, "Value2");
        map.put(studentKey1, studentValue1);
        map.put(studentKey2, studentValue2);
        map.put(studentKey3, null);
        map.put(null, null);
        System.out.println("map: " + map.keySet());
        //compute computeIfPresent, computeIfAbsent
//        map.computeIfAbsent(studentKey2, (key) -> {
//            key.setName("Change");
//            return key;
//        });
//
//        System.out.println("compute map if exist studentKey2: " + map.keySet());
//
//
//        map.computeIfAbsent(studentKey3, (key) -> {
//            key.setName("Change");
//            return key;
//        });
//
//        System.out.println("compute map if null studentKey3: " + map.keySet());
//
//
//        map.computeIfAbsent(studentKey4, (key) -> {
//            key.setName("Change");
//            return key;
//        });
//
//        System.out.println("compute map if not exist studentKey4: " + map.keySet());
        Student student555 = new Student(5555, "XXXX");
        System.out.println(map.getOrDefault(studentKey4, new Student(5555, "XXXX")));
        System.out.println(map.getOrDefault(studentKey3, new Student(5555, "XXXX")));
        map.merge(studentKey2, student555, (oldValue, newValue) -> {
            int i = newValue.getId() + oldValue.getId();
            oldValue.setId(i);
            return oldValue;
        });

        System.out.println(map.keySet());
        map.merge(studentKey2, student555, (oldValue, newValue) -> {
            int i = oldValue.getId() + newValue.getId();
            oldValue.setId(i);
            return oldValue;
        });

        System.out.println(map.keySet());


        LinkedHashMap<Integer, String> linkedHashMap  = new LinkedHashMap<>();
        linkedHashMap.put(null, "null1");
        linkedHashMap.put(null, "null2");
        linkedHashMap.put(1, null);
        linkedHashMap.put(2, null);
        System.out.println(linkedHashMap.get(2));
        System.out.println(linkedHashMap);
        TreeMap<Integer, String> treeMap = new TreeMap<>();
    }
}
