public class Quadrado extends FormaGeometrica{
    private double altura;
    private double largura;

    public Quadrado(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double calcularArea(){
        return this.altura * this.largura;
    }
}