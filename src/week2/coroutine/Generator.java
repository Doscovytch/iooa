package week2.coroutine;

public class Generator {
    int i = 0;

    public int next() {
        return i++;
    }
}
