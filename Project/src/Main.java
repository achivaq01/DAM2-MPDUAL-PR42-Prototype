import jdk.jfr.Percentage;

import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Forn[] forns = new Forn[]{
            new Forn("forn1", "marca1", Color.BLACK, 100, 200, 200, true),
            new Forn("forn2", "marca2", Color.BLACK, 150, 300, 2000, true)
        };

        Forn[] fornsCopia = new Forn[]{
            forns[0].clone(),
            forns[1].clone()
        };

        Nevera[] neveras = new Nevera[]{
                new Nevera("nevera1", "marca1", Color.RED, 200, 50, 2, 1000),
                new Nevera("nevera2", "marca2", Color.BLUE, 222, 1, 2, 1000),
        };

        Nevera[] neverasCopia = new Nevera[]{
                neveras[0].clone(),
                neveras[1].clone()
        };

        Rentadora[] rentadoras = new Rentadora[]{
                new Rentadora("rentadora1", "marca1", Color.PINK, 500, 90, 300, 10),
                new Rentadora("rentadora2", "marca2", Color.YELLOW, 10500, 20000, 900, 200)
        };

        Rentadora[] rentadorasCopia = new Rentadora[]{
                rentadoras[0].clone(),
                rentadoras[1].clone()
        };

        System.out.println("==========Comparació de Forns==========\n");

        System.out.println("Comparació llistes iguals");
        for(int i=0;i<2;i++){
            compare(i, forns[i], forns[i]);
        }
        System.out.println("\n");
        System.out.println("Comparació llistes diferents");
        for(int i=0;i<2;i++){
            compare(i, forns[i], fornsCopia[i]);
        }
        System.out.println("=======================================\n");

        System.out.println("==========Comparació de Rentadores==========\n");

        System.out.println("Comparació llistes iguals");
        for(int i=0;i<2;i++){
            compare(i, rentadoras[i], rentadorasCopia[i]);
        }
        System.out.println("\n");
        System.out.println("Comparació llistes diferents");
        for(int i=0;i<2;i++){
            compare(i, rentadoras[i], rentadorasCopia[i]);
        }
        System.out.println("=======================================\n");

        System.out.println("==========Comparació de Neveres==========\n");
        System.out.println("Comparació llistes iguals");
        for(int i=0;i<2;i++){
            compare(i, neveras[i], neveras[i]);
        }
        System.out.println("\n");
        System.out.println("Comparació llistes diferents");
        for(int i=0;i<2;i++){
            compare(i, neveras[i], neverasCopia[i]);
        }
        System.out.println("=======================================\n");

    }

    static void compare(int i, Electrodomestic a, Electrodomestic b) {
        if (a == b) {
            System.out.println(i + ": Els Electrodomestics són el mateix objecte");
        } else {
            System.out.print(i + ": Els Electrodomestics són objectes diferents - ");
            if (a.equals(b)) {
                System.out.println(i + ": Els Electrodomestics són idèntics");
            } else {
                System.out.println(i + ": Els Electrodomestics NO són identics");
            }
        }
    }
}
