package week1.opdracht4_WordCount;

import java.util.Comparator;

public class Woord {
    String word;
    int teller = 1;

    public Woord(String word) {
        this.word = word;
    }

    public void verhoogTeller() {
        teller ++;
    }
}
