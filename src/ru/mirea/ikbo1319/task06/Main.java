package ru.mirea.ikbo1319.task06;

import ru.mirea.ikbo1319.task06.abstract_factory.Client;
import ru.mirea.ikbo1319.task06.abstract_factory.IceCreamFactory;
import ru.mirea.ikbo1319.task06.abstract_factory.IceCreamFactoryA;
import ru.mirea.ikbo1319.task06.abstract_factory.IceCreamFactoryB;
import ru.mirea.ikbo1319.task06.factory_method.CircleWaffleMaker;
import ru.mirea.ikbo1319.task06.factory_method.RectangularWaffleMaker;
import ru.mirea.ikbo1319.task06.factory_method.Waffle;
import ru.mirea.ikbo1319.task06.factory_method.WaffleMaker;

public class Main {
    public static void main(String[] args) {
        System.out.println("Factory method example: ");
        WaffleMaker[] waffleMakers = { new CircleWaffleMaker(), new RectangularWaffleMaker() };
        for (WaffleMaker waffleMaker : waffleMakers) {
            Waffle waffle = waffleMaker.factoryMethod();
            waffle.print();
        }
        System.out.println();

        System.out.println("Abstract factory example: ");
        IceCreamFactory[] iceCreamFactories = { new IceCreamFactoryA(), new IceCreamFactoryB() };
        for (IceCreamFactory iceCreamFactory : iceCreamFactories) {
            Client client = new Client(iceCreamFactory);
            client.execute();
        }
        System.out.println();
    }
}
