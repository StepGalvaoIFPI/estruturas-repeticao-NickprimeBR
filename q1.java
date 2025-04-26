import java.util.Scanner;

public class q1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("digite a velocidade:");
        int velocidade = Integer.valueOf(sc.nextLine());

        if (velocidade<=80) {
            System.out.println("verde");
        }else{
            System.out.println("vermelho");
        }
    }
}