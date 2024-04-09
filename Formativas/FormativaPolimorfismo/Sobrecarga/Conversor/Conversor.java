public class Conversor{

    //metro para centimetro
    public double conversor(int x){
        return x * 100.0;
    }
    //kg para g
    public double conversor(double x){
        return x * 1000;
    }
    //horas para minutos
    public int conversor(String x){
        int hora = Integer.parseInt(x);
        return hora * 60;
    }

    public static void main(String[] args){

        Conversor c = new Conversor();

        System.out.println("10 metros = " + c.conversor(10) + " centimetros");
        System.out.println("8kg = " + c.conversor(8) + " gramas");
        System.out.println("2 horas = " + c.conversor("2") + " minutos");
    }
}