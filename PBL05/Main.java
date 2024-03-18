import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);
        List<Usuario> usuarios = new ArrayList<>();
        
        while(true){
            System.out.printf("\n1- Cadastrar usuário\n2- Listar pessoas\n3- Usuários por tipo\n4- Encerrar programa\nOpção: ");
            int opcao = ler.nextInt();
            
            if(opcao == 4){
                break;
            } else{
                ler.nextLine();
                switch(opcao){
                    case 1:
                        System.out.printf("Nome do usuário: ");
                        String nomeUsuario = ler.nextLine();
                        System.out.printf("Cargo:\n 1-Cliente\n 2-Funcionário\n 3-Gerente\n Opção: ");
                        int numCargoUsuario = ler.nextInt();
                        numCargoUsuario -= 1;
                        
                        String cargoUsuario = Cargos.getCargos(numCargoUsuario);
                        Usuario novoUsuario = new Usuario(nomeUsuario, cargoUsuario);
                        usuarios.add(novoUsuario);
                        break;
                    case 2:
                        int i = 1;
                        for(Usuario usuario : usuarios){
                                System.out.println(i +"- " + usuario.getNome());
                                i++;
                            }
                        break;
                    case 3:
                        System.out.print("Qual cargo? \n 1-Cliente\n 2-Funcionário\n 3- Gerente\n Opção: ");
                        int numListarCargo = ler.nextInt();
                        numListarCargo -= 1;
                        String cargoAListar = Cargos.getCargos(numListarCargo);

                        for(Usuario usuario : usuarios){
                            if(usuario.getCargo() == cargoAListar){
                                System.out.println(usuario.getNome());
                            }
                        }
                        break;
                    default:
                        System.out.printf("Opção inválida");
                        break;
                }
            }
        }
    }
}