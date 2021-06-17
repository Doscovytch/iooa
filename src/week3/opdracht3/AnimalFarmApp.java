package week3.opdracht3;

import java.util.ArrayList;

public class AnimalFarmApp {
    public static void main(String[] args) {
        ArrayList<Animal> list = new ArrayList<>();
        list.add(new Cat());
        list.add(new Dog());
        list.add(new Duck());
        list.add(new Lion());
        list.add(new Whale());
        list.add(new Olifant());

        list.get(0).speak();
        list.get(1).speak();
        list.get(2).speak();

        letTheAnimalsSpeak(list);
    }

    private static void letTheAnimalsSpeak(ArrayList<Animal> list) {
        for (Animal animal : list) {
            animal.speak();
        }
    }
}
