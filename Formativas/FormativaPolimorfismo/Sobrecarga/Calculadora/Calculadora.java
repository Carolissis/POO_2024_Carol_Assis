public class Calculadora{
    public int soma(int x, int y){
        return x + y;
    }
    public double soma(double x, double y){
        return x + y;
    }
    public double soma(double x, int y){
        return x + y;
    }
    public double soma(int x, double y){
        return x + y;
    }
    public int soma(int[] numeros){
        int total = 0;
        for(int num : numeros){
            total += num;
        }
        return total;
    }
    public static void main(String[] args){
        Calculadora c = new Calculadora();

        System.out.println("Dois inteiros: " + c.soma(5, 6) );
        System.out.println("Dois floats: "+ c.soma(4.50, 6.70));
        System.out.println("Um inteiro e um double: "+ c.soma(8, 9.2));
        System.out.println("Matriz de inteiros: " + c.soma(new int[]{1,2,3,4,5}));
    }
}
