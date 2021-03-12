package ru.mirea.ikbo1319.task03;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class SemaphoreSet<E> implements Set<E> {
    private final Set<E> set = new HashSet<>();
    private final Semaphore semaphore = new Semaphore(1, true);

    @Override
    public int size() {
        int size = 0;
        try {
            semaphore.acquire();
            size = set.size();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        boolean isEmpty = true;
        try {
            semaphore.acquire();
            isEmpty = set.isEmpty();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return isEmpty;
    }

    @Override
    public boolean contains(Object o) {
        boolean contains = false;
        try {
            semaphore.acquire();
            contains = set.contains(o);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return contains;
    }

    @Override
    public Iterator<E> iterator() {
        Iterator<E> iterator = null;
        try {
            semaphore.acquire();
            iterator = set.iterator();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assert iterator != null;
        return iterator;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[0];
        try {
            semaphore.acquire();
            array = set.toArray();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return array;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T> T[] toArray(T[] a) {
        Object[] array = new Object[0];
        try {
            semaphore.acquire();
            array = set.toArray((Object[]) a);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return (T[]) array;
    }

    @Override
    public boolean add(E e) {
        boolean add = false;
        try {
            semaphore.acquire();
            add = set.add(e);
            semaphore.release();
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        return add;
    }

    @Override
    public boolean remove(Object o) {
        boolean remove = false;
        try {
            semaphore.acquire();
            remove = set.remove(o);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return remove;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        boolean containsAll = false;
        try {
            semaphore.acquire();
            containsAll = set.containsAll(c);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return containsAll;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean addAll = false;
        try {
            semaphore.acquire();
            addAll = set.addAll(c);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return addAll;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        boolean retainAll = false;
        try {
            semaphore.acquire();
            retainAll = set.retainAll(c);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return retainAll;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean removeAll = false;
        try {
            semaphore.acquire();
            removeAll = set.removeAll(c);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return removeAll;
    }

    @Override
    public void clear() {
        try {
            semaphore.acquire();
            set.clear();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
