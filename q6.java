import java.util.Scanner;

public class q6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("digite um numero inteiro maior que 1:");
        int n = Integer.valueOf(sc.nextLine());
        int i=1;

        while(i!=n+1){
            System.out.println(i);
            i++;
        }
    }    
}
