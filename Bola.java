public class Bola {
    private double radius;

    public bola(double radius){
        this.radius = radius;
    }
    public double hitungvolumebola(){
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public static void main(String[] args){
        double radius = 5.0;
        Bola bola = new Bola(radius);
        double voulume = bola.hitungvolumebola();
        System.out.println("volume bola dengan radius" + radius + "adalah: " + voulume);
    }
}
