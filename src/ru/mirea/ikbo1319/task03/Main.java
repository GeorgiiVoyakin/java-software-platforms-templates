package ru.mirea.ikbo1319.task03;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        SynchronizedList<Integer> list = new SynchronizedList<>();
        SemaphoreSet<Integer> set = new SemaphoreSet<>();
        ArrayList<Integer> unsafeList = new ArrayList<>(1000);
        HashSet<Integer> unsafeSet = new HashSet<>(1000);

        new Thread(() -> {
            for (int i = 0; i < 499; i++) {
                list.add(i);
                set.add(i);
                unsafeList.add(i);
                unsafeSet.add(i);
            }
        }).start();

        new Thread(() -> {
            for (int i = 499; i < 1000; i++) {
                list.add(i);
                set.add(i);
                unsafeList.add(i);
                unsafeSet.add(i);
            }
        }).start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("SynchronizedList size = " + list.size());
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();

        System.out.println("SemaphoreSet size = " + set.size());
        for (Integer integer : set) {
            System.out.print(integer + " ");
        }
        System.out.println();

        System.out.println("ArrayList size = " + unsafeList.size());
        System.out.println("HashSet size = " + unsafeSet.size());
    }
}
