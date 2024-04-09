public class ManipularString{
    public String concatenar(String palavra){
        return palavra;
    }
    public String concatenar(String palavra1, String palavra2){
        return palavra1 + palavra2;
    }
    public String concatenar(String palavra1, String palavra2, String palavra3){
        return palavra1 + palavra2 + palavra3;
    }
    public String concatenar(String palavra1, String palavra2, String palavra3, String palavra4){
        return palavra1 + palavra2 + palavra3 + palavra4;
    }

    public static void main(String[] args){
        ManipularString concat = new ManipularString();

        System.out.println("Aranha:" + concat.concatenar("Aranha"));
        System.out.println("Aranha e Teia: " + concat.concatenar("Aranha", "Teia"));
        System.out.println("Aranha, Teia e Mato: " + concat.concatenar("Aranha", "Teia", "Mato"));
        System.out.println("A, B, C e D: " + concat.concatenar("A", "B", "C", "D"));
    }
}