package EJERCICIO2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner va = new Scanner(System.in);
        System.out.println("Ingrese a ");
        a = va.nextInt();
        System.out.println("Ingrese b ");
        b = va.nextInt();
        System.out.println("Ingrese c ");
        c = va.nextInt();
        Ejercicio ejer1 = new Ejercicio(a, b, c);
        if (ejer1.getDiscrimante() > 0 ){
            System.out.println("la ecuacion tiene dos raaices  " + ejer1.getRaiz1() + " y "+ ejer1.getRaiz2());
        }
        else {
            if (ejer1.getDiscrimante() == 0){
                System.out.println("La ecuacion tiene una solucion y es " + ejer1.getRaiz1());
            }
            else{
                System.out.println("La ecuacion no tiene soluciuones reales ");
            }
        }
    }
}
