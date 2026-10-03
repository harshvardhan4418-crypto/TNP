import java.util.Scanner;

public class ATMtrasactionsimulator {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Initial amount : ");
        int N = sc.nextInt();

        System.out.print("Deposite amount : ");
        int D = sc.nextInt();

        int B = N + D;

        System.out.print("Withdrawl amount : ");
        int W = sc.nextInt();

        System.out.println(D + " Deposite succefully");

        if(W <= B){
            B = B - W;
            System.out.print(W + " Withdrawl  succefully");
        }
        else{
            System.out.println("Insufficient balance");
        }

        System.out.println("Balance : " + B);
    }
}