package ru.mirea.ikbo1319.task01;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String s1 = "843jrej43f";
        String s2 = "1438hrje34";

        Comparator<String> comparator = Comparator.comparingInt(o ->
                o.chars().filter(Character::isDigit).map(Character::getNumericValue).sum());

        System.out.println(comparator.compare(s1, s2));
    }
}
