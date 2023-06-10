import java.util.Scanner;
public class carteirinnha {
    Scanner scan = new Scanner(System.in);
    private boolean ativa;
    private float saldo;

    public void passar(){
     if(this.getAtiva() == true && this.getSaldo() >= 3.50f){
        this.setSaldo(this.getSaldo()- 3.50f);
        System.out.println("passou a carteirinha");      
     }
    }
    public void recarregar(){
    System.out.println("insira o valor da recarga: ");
    float valor = scan.nextFloat();
    setSaldo(getSaldo() + valor);
    }
    public void status(){
     System.out.println("saldo:" +this.getSaldo());
     System.out.println("ativa: " +this.getAtiva());
    }
    public void pularCatraca(){
      setAtiva(getAtiva() == false);
      
    }
    public carteirinnha(boolean at,float sa){
     this.ativa = at;
     this.saldo = sa;
    } 
    public float getSaldo(){
        return saldo;
    }
    public void setSaldo(float sa){
      this.saldo = sa;
    }
    public boolean getAtiva(){
        return ativa;
    }
    public void setAtiva(boolean at){
        this.ativa = at;
    }

}
