package FizBuz;

public class FizzBuzz {

    private int number = 0;

    public String next() {
        number ++;
        String result = "";

        if (number%3 == 0) result += "Fizz";
        if (number%5 == 0) result += "Buzz";
        if (result.equals("")) result += number;
        return result;
    }

    public static void main(String[] args) {
        FizzBuzz fizbuz = new FizzBuzz();
        for (int i=0; i < 100; i++) {
            System.out.println(fizbuz.next());
        }
    }
}
