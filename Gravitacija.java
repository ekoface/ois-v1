import java.util.*;
import java.lang.Math;

public class Gravitacija {

    public static double Izracun () {
        Scanner sc = new Scanner(System.in);
        double v = sc.nextDouble();
        double c = 6.674 * Math.pow(10, -11);
        double m = 5.972 * Math.pow(10, 24);
        double r = 6.371 * Math.pow(10, 6);

        double rezultat = (c * m) / ((r + v) * (r + v));

        return rezultat;

    }


    public static void main(String[] args) {

        //testis
        double gravPospesek = Izracun();
    }
}