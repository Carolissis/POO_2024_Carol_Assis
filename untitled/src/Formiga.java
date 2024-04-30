import java.io.Serializable;

public class Formiga implements Serializable {
    private String nome;
    private Boolean rainha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getRainha() {
        return rainha;
    }

    public void setRainha(Boolean rainha) {
        this.rainha = rainha;
    }
}