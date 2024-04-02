public class Pocao extends Item{
    private String cura;

    public Pocao(String nome, int quantidade, String cura){
        super(nome, quantidade);
        this.cura = cura;
    }
    public String getCura(){
        return this.cura;
    }
    public void setCura(String cura){
        this.cura = cura;
    }
}