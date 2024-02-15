package test;

import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int numb;
        System.out.println("Liste ededleri daxil edin: ");
        while ((numb = sc.nextInt()) != -1) {
            list.add(numb);
        }
        System.out.println(list);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            Integer cnt = map.getOrDefault(list.get(i), 0);
            map.put(list.get(i), ++cnt);
        }
        System.out.println(map);
        Optional<Map.Entry<Integer, Integer>> optional = map.entrySet().stream().max(Map.Entry.comparingByValue());
        if (optional.isPresent()) {
            Map.Entry<Integer, Integer> max = optional.get();
            System.out.println("tekrarlanan element: " + max.getKey() + ", tekrarlanma sayi: " + max.getValue());
        }
    }
}
