// 1. Crie uma interface chamada Autenticavel com métodos para autenticar
// usuário.
// 2. Implemente a interface em diferentes classes, como Usuario,
// Administrador e Cliente.
// 3. Garanta que cada classe tenha sua própria implementação do método
// de autenticação.
// 4. Crie um sistema de login que aceite qualquer objeto que implemente a
// interface Autenticavel.
// 5. Teste o sistema realizando login com diferentes tipos de usuários.

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("usuario123");
        Administrador administrador = new Administrador("admin123");
        Cliente cliente = new Cliente("cliente123");

        SistemaLogin sistema = new SistemaLogin();

        System.out.println("Testando login de usuário:");
        sistema.login(usuario, "usuario123");  
        System.out.println("Testando login de administrador:");
        sistema.login(administrador, "senhaErrada");  
        System.out.println("Testando login de cliente:");
        sistema.login(cliente, "cliente123");  
    }
}
interface Autenticavel {
    boolean autenticar(String senha);
}
class Usuario implements Autenticavel {
    private String senha;

    public Usuario(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
}

class Administrador implements Autenticavel {
    private String senha;

    public Administrador(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
}

class Cliente implements Autenticavel {
    private String senha;

    public Cliente(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
}
class SistemaLogin {
    public void login(Autenticavel usuario, String senha) {
        boolean autenticado = usuario.autenticar(senha);
        if (autenticado) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Falha no login!");
        }
    }
}
