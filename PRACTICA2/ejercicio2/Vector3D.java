package PRACTICA2.ejercicio2;

public class Vector3D {
    private double x, y, z;
    // c el constructor x d
    public Vector3D(double x, double y, double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    // la suma trucha
    public Vector3D add(Vector3D v){
        return new Vector3D(this.x + v.x , this.y + v.y , this.z + v.z);
    }
    //la multiplicacion del escalar
    public Vector3D scalar(double r){
        return new Vector3D(r*this.x , r*this.y , r*this.z);
    }
    // la longitud
    public double magnitud(){
        return Math.sqrt(x*x+y*y+z*z);
    }
    //vector normalizado
    public Vector3D normalize(){
        double eg = magnitud();
        return new Vector3D(x/eg , y/eg , z/eg);
    }
    public double escalar(Vector3D v){
        return this.x * v.x + this.y + v.y + this.z + v.x;
    }
    public Vector3D vectorial(Vector3D v){
        return new Vector3D(this.y * v.z - this.z * v.y,this.z * v.x - this.x * v.z,this.x * v.y - this.y * v.x);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
