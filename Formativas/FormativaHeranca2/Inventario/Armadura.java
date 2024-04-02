public class Armadura extends Item{
    private String defesa;

    public Armadura(String nome, int quantidade, String defesa){
        super(nome, quantidade);
        this.defesa = defesa;
    }
    public String getDefesa(){
        return this.defesa;
    }
    public void setDefesa(String defesa){
        this.defesa = defesa;
    }
}