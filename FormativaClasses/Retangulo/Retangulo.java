public class Retangulo{
    private float altura;
    private float largura;

    public Retangulo(float altura, float largura){
        this.altura = altura;
        this.largura = altura;
    }
    public float getAltura(){
        return this.altura;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
    public float getLargura(){
        return this.largura;
    }
    public void setLargura(float largura){
        this.largura = largura;
    }
    public float calcularArea(float altura, float largura){
        return altura * largura;
    }
    public float calcularPerimetro(float altura, float largura){
        return (2 * altura) + (2 * largura);
    }
}