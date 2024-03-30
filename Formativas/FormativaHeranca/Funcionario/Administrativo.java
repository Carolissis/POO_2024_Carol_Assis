public class Administrativo extends Assistente{
    private String turno;
    private double addNoturno = 300.00;

    public Administrativo(String nome, double salario, int matricula, String turno){
        super(nome, salario, matricula);
        this.turno = turno;
    }
    public double ganhoAnual(){
        if(this.turno.equals("Noite")){
            return super.ganhoAnual() + (addNoturno * 12);
        }
        else{
            return super.ganhoAnual();
        }
    }
}