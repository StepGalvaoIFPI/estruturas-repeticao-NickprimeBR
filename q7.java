import java.util.Scanner;

public class q7 {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);

        System.out.print("digite o numero 1:");
        int n1 = Integer.valueOf(entrada.nextLine());

        while(n1!=1){
            System.out.print("digite o numero 1:");
            n1 = Integer.valueOf(entrada.nextLine());
        }
        System.out.print("fim do programa!");
    }    
}
