package EJERCICIO1;

public class Ejercicio {
     private int a, b, c, d, e, f;

     public Ejercicio(int a, int b, int c, int d, int e, int f){
         this.a=a;
         this.b=b;
         this.c=c;
         this.d=d;
         this.e=e;
         this.f=f;
     }
    public boolean tieneSolucion(){
         return a*d-b*c != 0;
    }
    public int getX(){
         return (e*d-b*f)/(a*d-b*c);
    }
    public int getY(){
         return (a*f-e*c)/(a*d-b*c);
    }
}






