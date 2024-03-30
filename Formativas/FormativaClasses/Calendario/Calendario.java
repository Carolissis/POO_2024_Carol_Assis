public class Calendario{
    private int dia;
    private int mes;
    private int ano;

    public Calendario(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public void data(){
        System.out.printf( this.dia + "/" + this.mes + "/" + this.ano);
    }
    public boolean eBissexto(){
        if((this.ano % 4 == 0 && this.ano % 100 != 0) || (this.ano % 400 == 0)){
        
            return true;
            
        } else {
                return false;
            }
    }
}