// 1. Crie uma classe abstrata chamada FormaGeometrica com métodos
// abstratos para calcular área e perímetro.
// 2. Implemente subclasses para diferentes formas geométricas
// tridimensionais, como Cubo, Esfera e Cilindro, que herdem da classe
// FormaGeometrica.
// 3. Garanta que todas as subclasses implementem os métodos abstratos da
// classe pai.
// 4. Instancie diferentes formas geométricas tridimensionais e chame seus
// métodos para calcular área e perímetro

public class Main{
    public static void main(String[] args){

        Esfera esf = new Esfera(5);
        System.out.println("Area: " + esf.area());
        System.out.println("Perimetro: " + esf.perimetro());

        Cubo cub = new Cubo(3);
        System.out.println("Area: " + cub.area());
        System.out.println("Perimetro: " + cub.perimetro());

        Cilindro cil = new Cilindro(2, 6);
        System.out.println("Area: " + cil.area());
        System.out.println("Perimetro: " + cil.perimetro());
    }
}

abstract class FormaGeometrica{
    private double x;

    public FormaGeometrica(double x){
        this.x = x;
    }
    public double getX(){
        return this.x;
    }
    public abstract double area();
    public abstract double perimetro();
}

class Esfera extends FormaGeometrica{
    //x = raio
    public Esfera(double raio){
        super(raio);
    }
    public double area(){
        return 4 * (3.14 * (getX() * getX()));
    }
    public double perimetro(){
        return 2 * (3.14 * getX());
    }
}
class Cubo extends FormaGeometrica{
    //x = aresta
    public Cubo(double aresta){
        super(aresta);
    }
    public double area(){
        return 6 * (getX() * getX());
    }
    public double perimetro(){
        return 4 * getX();
    }
}
class Cilindro extends FormaGeometrica{
    //x = raio
    private double altura; 

    public Cilindro(double raio, double h){
        super(raio);
        this.altura = h;
    }
    public double area(){
        return 2 * 3.14 * getX() * (getX() + this.altura);
    }
    public double perimetro(){
        return (2 * 3.14 * getX()) + (2 * 3.14 * getX() * this.altura) ;
    }
}