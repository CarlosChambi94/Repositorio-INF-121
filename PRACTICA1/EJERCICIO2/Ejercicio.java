package EJERCICIO2;

public class Ejercicio {
    private double a, b, c;

    public Ejercicio(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getDiscrimante(){
        return b*b - 4*a*c;
    }
    public double getRaiz1(){
        double D = getDiscrimante();
        return (-b + Math.sqrt(D)) / (2*a);
    }
    public double getRaiz2(){
        double D = getDiscrimante();
        return (-b - Math.sqrt(D)) / (2*a);
    }

}
