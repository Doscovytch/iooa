package week2.coroutine;

public class Main {
    public static void main(String[] args) {
        Generator func = new Generator();

        for(int i = 0; i < 10; i++) {
            System.out.println(func.next());
        }
    }
}
