package PRACTICA2.ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner va = new Scanner(System.in);
    System.out.println("Ingrese los valores del vector A ");
    double ax= va.nextDouble(), ay= va.nextDouble(), az= va.nextDouble();
    Vector3D a = new Vector3D(ax, ay, az);
    System.out.println("Ingrese los valores del vector B");
    double bx= va.nextDouble(), by= va.nextDouble() , bz = va.nextDouble();
    Vector3D b = new Vector3D(bx, by, bz);
    System.out.println("ingrese el escalar xd ");
    double g;
    g = va.nextDouble();
    // el programa xd
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("A + B = " +  a.add(b));
        System.out.println("A º B = " + a.escalar(b));
        System.out.println("A x B = " + a.vectorial(b));
        System.out.println("(A) = " + a.magnitud());
        System.out.println("A NORMALIZADO = " + a.normalize());
        System.out.println(g + " * A = " + a.scalar(g) );
    }

}
