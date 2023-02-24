
import java.util.*;
import java.lang.Math;

public class Gravitacija {

    public static double Izracun (double v) {
        
        double c = 6.674 * Math.pow(10, -11);
        double m = 5.972 * Math.pow(10, 24);
        double r = 6.371 * Math.pow(10, 6);

        double rezultat = (c * m) / ((r + v) * (r + v));

        return rezultat;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v = sc.nextDouble();

        //testis
        double gravPospesek = Izracun(v);
        izpis(v,gravPospesek);

    }



    public static void izpis(double visina, double gravPospesek){
        System.out.printf("Na visini %.2f, je gravitacijski pospesek %.2f %n", visina, gravPospesek);
    }
}

