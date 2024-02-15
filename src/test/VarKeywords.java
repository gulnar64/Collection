package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import innerpackage.Lambda;

public class VarKeywords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = sc;
        var i = sc1;
        System.out.println(i);
        List<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(10);
        for (var element : list) {
            System.out.println(element);
        }
        Lambda lambda = (a, b) -> a + b;
        System.out.println(lambda.addd(3, 5));
    }
}
