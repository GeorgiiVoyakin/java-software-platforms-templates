package ru.mirea.ikbo1319.task08.observer;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class GameRelease implements Observable {
    private final String game;
    private Date releaseDate;
    private final List<Observer> observers;

    public GameRelease(String game) {
        this.game = game;
        observers = new LinkedList<>();
    }

    public void changeReleaseDate(Date date) {
        releaseDate = date;
        notifyObservers();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(game, releaseDate);
        }
    }
}
