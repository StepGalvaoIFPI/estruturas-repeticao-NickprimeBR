import java.util.Scanner;

public class q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("digite seu  salario:");
        double salario = Double.valueOf(sc.nextLine());
        double inss;
        double ir;

        System.out.println("");

        if(salario<1000){
            ir = 0*salario;
            inss = 0*salario; 
        }else if(1000<=salario && salario<2000){ 
            ir = 0.1*salario;
            inss = 0.11*salario;
        }else if(2000<=salario && salario<3000){
            ir = 0.2*salario;
            inss = 0.15*salario;
        }else{
            ir = 0.27*salario;
            inss = 0.2*salario;
        }

        
        System.out.println("salario:"+salario);
        System.out.println("imposto de renda:"+ir);
        System.out.println("INSS:"+inss);
    }
    
}
