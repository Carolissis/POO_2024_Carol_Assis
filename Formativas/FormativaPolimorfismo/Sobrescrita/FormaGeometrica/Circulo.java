public class Circulo extends FormaGeometrica{
    private double raio;
    private double pi = 3.14;

    public Circulo(double raio){
        this.raio = raio;
    }
    @Override
    public double calcularArea(){
        return this.pi * (this.raio * this.raio);
    }
}