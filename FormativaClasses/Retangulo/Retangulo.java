public class Retangulo{
    private float altura;
    private float largura;

    public Retangulo(float altura, float largura){
        this.altura = altura;
        this.largura = largura;
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
    public float calcularArea(){
        return this.altura * this.largura;
    }
    public float calcularPerimetro(){
        return 2 *( this.altura + this.largura);
    }
}