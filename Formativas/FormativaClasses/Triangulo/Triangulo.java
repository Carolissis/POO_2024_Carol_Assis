import java.util.Scanner;

public class Triangulo{
    private float a;
    private float b;
    private float c;

    public Triangulo(float a, float b, float c){
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
    public float calcularArea(){
        if(validarTriangulo()){
            float s = (this.a + this.b + this.c) / 2;
            float area = Math.sqrt(s * (s - this.a) * (s - this.b) * (s - this.c));
            return area;
        }
        else{
            System.out.println("Os lados fornecidos não formam um triângulo válido.");
            return 0;
        }
    }
}