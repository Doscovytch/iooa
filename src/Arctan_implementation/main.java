package Arctan_implementation;

public class main {
    public static void main(String[] args) {

        // triangle
        double[] coord1 = {0, 0};
        double[] coord2 = {6, 0};
        double[] coord3 = {6, 3};

        double overstaande = coord3[1] - coord2[1];
        double aanliggende = coord2[0] - coord1[0];
        double schuine = Math.pow(Math.pow(overstaande, 2) + Math.pow(aanliggende, 2), 0.5);

        // var alpha
        double a;

        a = Math.atan(overstaande/aanliggende);
        System.out.println("Math.atan(o/a), Alpha is: " + Math.toDegrees(a));

        a = my_atan(overstaande/aanliggende);
        System.out.println("my_atan(o/a), Alpha is: " + Math.toDegrees(a));
    }

    public static double my_atan(double v) {
        return 0;
    }
}
