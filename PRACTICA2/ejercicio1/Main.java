package PRACTICA2.ejercicio1;

public class Main {
    public static void main(String[] args) {
        AlgebraVectorial a = new AlgebraVectorial(2, 1, 0);
        AlgebraVectorial b = new AlgebraVectorial(1, -2, 0);

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("¿a ⟂ b? " + a.esPerpendicular(b));
        System.out.println("¿a ∥ b? " + a.esParalelo(b));

        System.out.println("Proy_a sobre b = " + a.proyeccionSobre(b));
        System.out.println("Componente de a en b = " + a.componenteEn(b));
    }
}
