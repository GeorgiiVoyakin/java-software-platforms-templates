package ru.mirea.ikbo1319;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.mirea.ikbo1319.interfaces.Musician;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);

        try {
            Musician musician = context.getBean(args[0], Musician.class);
            musician.doMusic();
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.err.println("Expected 1 command line argument, found 0!");
        }

    }

}
