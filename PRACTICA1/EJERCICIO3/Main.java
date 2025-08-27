package EJERCICIO3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner va = new Scanner(System.in);
        double[] obj = new double[10];
        System.out.println("Ingrese los 10 numeros ");
        for (int i = 0 ; i < 10 ; i++){
            obj[i] = va.nextDouble();
        }
        Ejercicio ola = new Ejercicio(obj);
        System.out.println("El promedio es " + ola.getPromedio());
        System.out.println("La desviacion es " + ola.getDesviacion());
    }
}
