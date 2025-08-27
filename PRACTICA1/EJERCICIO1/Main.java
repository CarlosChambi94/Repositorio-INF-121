package EJERCICIO1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c, d, e, f;
        Scanner va = new Scanner(System.in);
        System.out.println("Ingrese a ");
        a = va.nextInt();
        System.out.println("Ingrese b ");
        b = va.nextInt();
        System.out.println("Ingrese c ");
        c = va.nextInt();
        System.out.println("Ingrese d ");
        d = va.nextInt();
        System.out.println("Ingrese e ");
        e = va.nextInt();
        System.out.println("Ingrese f ");
        f = va.nextInt();

        Ejercicio ejer1 = new Ejercicio(a, b, c, d, e, f);
        if (ejer1.tieneSolucion()){
            System.out.println("x = " + ejer1.getX());
            System.out.println("y = " + ejer1.getY());
        }
        else{
            System.out.println("La ecuacion no tiene solucion");
        }


    }
}
