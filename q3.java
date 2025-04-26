import java.util.Scanner;


public class q3 {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);

        System.out.print("digite seu  salario:");
        double salario = Double.valueOf(ent.nextLine());
        double inss;
        double ir;

        if(2000<=salario){
            ir = 0.15*salario;
            inss = 0.10*salario; 
        }else{
            ir = 0*salario;
            inss = 0*salario;
        }
        
        System.out.println("salario"+salario);
        System.out.println("imposto de renda:"+ir);
        System.out.println("INSS:"+inss);
    }
    
}
