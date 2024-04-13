public class Usuario implements IAutenticacao{
    private boolean autenticado;

    public void autenticar(){
        this.autenticado = true;
    }
}