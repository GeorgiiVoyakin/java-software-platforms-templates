package ru.mirea.ikbo1319.components;

import org.springframework.stereotype.Component;
import ru.mirea.ikbo1319.interfaces.Musician;

@Component
public class Guitarist implements Musician {
    @Override
    public void doMusic() {
        System.out.println("Guitar sounds");
    }
}
