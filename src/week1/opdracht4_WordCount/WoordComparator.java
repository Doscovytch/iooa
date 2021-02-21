package week1.opdracht4_WordCount;

import java.util.Comparator;

public class WoordComparator implements Comparator<Woord> {
    public int compare(Woord w1, Woord w2) {
        if (w1.teller == w2.teller) {
            return 0;
        } else if (w1.teller < w2.teller) {
            return 1;
        } else {
            return -1;
        }
    }
}
