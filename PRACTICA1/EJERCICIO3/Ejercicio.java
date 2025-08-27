package EJERCICIO3;

public class Ejercicio {
    private double[] numero;
    public Ejercicio(double[] numero){
        this.numero=numero;
    }
    public double getPromedio(){
        double sm = 0;
        for (int i = 0; i < numero.length ; i++){
            sm += numero[i];
        }
        return sm / numero.length;
    }
    public double getDesviacion(){
        double prom = getPromedio();
        double sm = 0;
        for (int i = 0; i < numero.length ; i++){
               sm += Math.pow(numero[i] - prom, 2 );
            }
        return Math.sqrt(sm / (numero.length-1));
        }
    }

