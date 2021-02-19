package ru.mirea.ikbo1319.task03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class Main {
    private static void add(Integer i, Set<Integer> set) {
        Semaphore semaphore = new Semaphore(1);
        try {
            semaphore.acquire();
            set.add(i);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private synchronized static void add(Integer i, List<Integer> list){
        list.add(i);
    }
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();


        Thread threadOne = new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            add(1, set);
            add(1, list);
        });

        Thread threadTwo = new Thread(() -> {
            add(2, set);
            add(2, list);
        });

        threadOne.start();
        threadTwo.start();

        set.forEach(System.out::println);
        System.out.println();
        list.forEach(System.out::println);
    }
}
