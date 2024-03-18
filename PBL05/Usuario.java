public class Usuario{
    private String nome;
    private String cargo;

    public Usuario(String nome, String cargo){
        this.nome = nome;
        this.cargo = cargo;
    }

    public String getNome(){
        return this.nome;
    }
    public String getCargo(){
        return this.cargo;
    }

}