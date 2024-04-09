public class Area{
    public double calcularArea(double x, double y){
        return x * y;
    }
    public double calcularArea(double x){
        return (x * x) * 3.14;
    }
    public double calcularArea(double x, double y, double z){
        double s = (x + y + z)/2;
        return Math.sqrt(s*(s-x)*(s-y)*(s-z));
    }

    public static void main(String[] args){
        Area a = new Area();

        System.out.println("Quadrado: " + a.calcularArea(3,3));
        System.out.println("Retangulo: "+ a.calcularArea(5.7, 8.9));
        System.out.println("Circulo: " + a.calcularArea(5));
        System.out.println("Triangulo: " + a.calcularArea(3,4,5));
    }
}