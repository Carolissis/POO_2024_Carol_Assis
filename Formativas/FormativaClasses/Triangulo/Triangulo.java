public class Triangulo{
    private double a;
    private double b;
    private double c;

    public Triangulo(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public boolean validarTriangulo(){
        if(this.a + this.b > this.c && this.a + this.c > this.b && this.b + this.c > this.a){
            return true;
        }
        else{
            return false;
        }
    }
    public double calcularArea(){
        if(validarTriangulo()){
            double s = (this.a + this.b + this.c) / 2;
            double area = Math.sqrt(s * (s - this.a) * (s - this.b) * (s - this.c));
            return area;
        }
        else{
            System.out.println("Os lados fornecidos não formam um triângulo válido.");
            return 0;
        }
    }
}