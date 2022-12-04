package com.company;

import creatures.Animal;
import creatures.Human;
import devices.Car;

public class Main {

    public static void main(String[] args)
    {
        Human me = new Human("Rafał");
        Animal cat = new Animal("felis");
        me.pet = cat;
        me.firstName = "Ala";
        System.out.println(me.firstName + " ma zwierzę " + me.pet.species);

        //sporo innego kodu

        Animal dog = new Animal("canis");
        me.pet = dog;
        System.out.println(me.firstName + " ma zwierze " + me.pet.species);

        // jezeli chce nakarminc kota jak moge to zrobic w tej linni

        me.pet.feed(1.0);
        cat.feed(1.0);

        me.feed(2.0);
        me.takeForAWalk(1.0);
        System.out.println(me.species);
        System.out.println(Human.DEFAULT_ANIMAL_WEIGHT);

        Car fiat = new Car(17, "vw", "passat", "diesel");
        fiat.millage = 32123.3;

        System.out.println(fiat.producer);
        System.out.println(me.species);

    }
}
