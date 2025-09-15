package PRACTICA2.ejercicio1;
public class AlgebraVectorial {
    private double x,y,z;

    public AlgebraVectorial(){
        this.x=0;
        this.y=0;
        this.z=0;
    }

    public AlgebraVectorial(double x, double y, double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public double magnitud(){
        return Math.sqrt(x*x+y*y+z*z);
    }
    // la suma  xd
    public AlgebraVectorial suma(AlgebraVectorial v){
        return new AlgebraVectorial(this.x + v.x, this.y + v.y, + this.z + v.z);
    }
    //la resta xd
    public AlgebraVectorial resta(AlgebraVectorial v){
        return new AlgebraVectorial(this.x - v.x,this.y - v.y,this.z - v.z);
    }
    //c producto escalar
    public double dot(AlgebraVectorial v){
        return this.x*v.x + this.y*v.y + this.z*v.z;
    }
    //c producto vectorial
    public AlgebraVectorial cruz(AlgebraVectorial v){
        return new AlgebraVectorial(this.y*v.z - this.z*v.y,this.z*v.x - this.x*v.z,this.x*v.y - this.y*v.x);
    }
    // el de a * b = 0
    public boolean esPerpendicular(AlgebraVectorial v){
        return Math.abs(this.dot(v)) == 0;
    }
    public boolean esParalelo(AlgebraVectorial v) {
        AlgebraVectorial crus = this.cruz(v);
        return Math.abs(crus.x) ==0  && Math.abs(crus.y) == 0 && Math.abs(crus.z) == 0;
    }
    public AlgebraVectorial proyeccionSobre(AlgebraVectorial b) {
        double escalar = this.dot(b) / (b.magnitud() * b.magnitud());
        return new AlgebraVectorial(b.x * escalar, b.y * escalar, b.z * escalar);
    }

    // Componente de a en la dirección de b: (a·b) / |b|
    public double componenteEn(AlgebraVectorial b) {
        return this.dot(b) / b.magnitud();
    }
    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

}
