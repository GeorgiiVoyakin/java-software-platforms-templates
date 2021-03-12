package ru.mirea.ikbo1319.task03;

import java.util.*;

public class SynchronizedList<E> implements List<E> {
    private final List<E> list = new ArrayList<>();

    @Override
    public synchronized int size() {
        return list.size();
    }

    @Override
    public synchronized boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public synchronized boolean contains(Object o) {
        return list.contains(o);
    }

    @Override
    public synchronized Iterator<E> iterator() {
        return list.iterator();
    }

    @Override
    public synchronized Object[] toArray() {
        return list.toArray();
    }

    @SuppressWarnings("unchecked")
    @Override
    public synchronized <T> T[] toArray(T[] a) {
        return (T[]) list.toArray((Object[] ) a);
    }

    @Override
    public synchronized boolean add(E e) {
        return list.add(e);
    }

    @Override
    public synchronized boolean remove(Object o) {
        return list.remove(o);
    }

    @Override
    public synchronized boolean containsAll(Collection<?> c) {
        return list.containsAll(c);
    }

    @Override
    public synchronized boolean addAll(Collection<? extends E> c) {
        return list.addAll(c);
    }

    @Override
    public synchronized boolean addAll(int index, Collection<? extends E> c) {
        return list.addAll(index, c);
    }

    @Override
    public synchronized boolean removeAll(Collection<?> c) {
        return list.removeAll(c);
    }

    @Override
    public synchronized boolean retainAll(Collection<?> c) {
        return list.retainAll(c);
    }

    @Override
    public synchronized void clear() {
        list.clear();
    }

    @Override
    public synchronized E get(int index) {
        return list.get(index);
    }

    @Override
    public synchronized E set(int index, E element) {
        return list.set(index, element);
    }

    @Override
    public synchronized void add(int index, E element) {
        list.add(index, element);
    }

    @Override
    public synchronized E remove(int index) {
        return list.remove(index);
    }

    @Override
    public synchronized int indexOf(Object o) {
        return list.indexOf(o);
    }

    @Override
    public synchronized int lastIndexOf(Object o) {
        return list.lastIndexOf(o);
    }

    @Override
    public synchronized ListIterator<E> listIterator() {
        return list.listIterator();
    }

    @Override
    public synchronized ListIterator<E> listIterator(int index) {
        return list.listIterator(index);
    }

    @Override
    public synchronized List<E> subList(int fromIndex, int toIndex) {
        return list.subList(fromIndex, toIndex);
    }
}
