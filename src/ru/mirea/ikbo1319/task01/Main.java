package ru.mirea.ikbo1319.task01;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String s1 = "843jrej43f";
        String s2 = "1438hrje34";

        Comparator<String> cmp = (o1, o2) -> {
            int firstSum = 0;
            int secondSum = 0;

            for (int i = 0; i < o1.length(); i++) {
                if(Character.isDigit(o1.charAt(i))) {
                    firstSum += o1.charAt(i);
                }
            }

            for (int i = 0; i < o2.length(); i++) {
                if(Character.isDigit(o2.charAt(i))) {
                    secondSum += o2.charAt(i);
                }
            }
            return Integer.compare(firstSum, secondSum);
        };
        System.out.println(cmp.compare(s1, s2));
    }
}
