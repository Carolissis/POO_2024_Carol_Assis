public class Retangulo extends FiguraGeometrica{
    private double altura;
    private double largura;

    public double calcularArea(){
        return this.altura * this.largura;
    }
    public double calcularPerimetro(){
        return 2 * this.largura + 2 * this.altura;
    }

}