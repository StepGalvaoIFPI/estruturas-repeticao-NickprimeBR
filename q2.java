import java.util.Scanner;

public class q2{
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);

        System.out.print("digite seu salario:");
        double salario = Double.valueOf(ent.nextLine());
        double aumento;
        double novo_salario;

        if (salario<=1250.00) {
            aumento= 0.15;    
        }else{
            aumento = 0.10;
        }
        aumento = salario*aumento;
        novo_salario = salario + aumento;
        System.out.println("aumento:"+aumento);
        System.out.println("novo salario:"+novo_salario);        
    }
}
