import java.util.Scanner;

public class q8 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("digite um numero entre 1 e 3:");
        int n = Integer.valueOf(sc.nextLine());

        while(n!=1 && n!=2 && n!=3){
            System.out.print("digite um numero entre 1 e 3:");
            n = Integer.valueOf(sc.nextLine());
        }
        System.out.print("fim do programa");
    }
}
