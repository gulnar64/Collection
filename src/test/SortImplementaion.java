package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortImplementaion {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int numb;
        System.out.println("Liste ededleri daxil edin: ");
        while ((numb = sc.nextInt()) != -1) {
            list.add(numb);
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            int minValue = list.get(i);
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (minValue > list.get(j)) {
                    minValue = list.get(j);
                    minIndex = j;
                }
            }
            int temp = list.get(i);
            list.set(i, minValue);
            list.set(minIndex, temp);
        }
        System.out.println(list);
    }
}
