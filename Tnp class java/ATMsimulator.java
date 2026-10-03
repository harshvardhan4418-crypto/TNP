import java.util.Scanner;

public class ATMsimulator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Pin : ");
        int pin = sc.nextInt();

        if(pin == 4418){
            System.out.println("Login successfully");
        }
        else{
            System.out.print("Incorect pin");
            return;
        }

        int balance = 100000;

        while(true){
        System.out.println("\n========= ATM MENU =========");
        System.out.println("1. Check Balance ");
        System.out.println("2. Deposite ");
        System.out.println("3. Withdrawl ");
        System.out.println("4. Exit ");

        System.out.print("Choose an option : ");
        int choose = sc.nextInt();

        if(choose == 1){
            System.out.println("Balance :" + balance);
        }

        else if(choose == 2){
            System.out.print("Enter deposite amount : ");
            int deposite = sc.nextInt();

            balance = balance + deposite;

            System.out.println("Deposite succefully");
            System.out.print("Balance : " + balance);
        }
        else if(choose == 3){
            System.out.print("Enter withdrawl amount : ");
            int withdrawl = sc.nextInt();

            if(withdrawl <= balance){
                System.out.println("Withdrawl succefully");
                balance = balance - withdrawl;
                System.out.print("Balance : " + balance);
            }
            else {
                System.out.print("Insufficient balance");
            }
        }
        else if(choose == 4){
            System.out.print("Thank you for using ATM!");
            break;
        }
        else{
            System.out.print("Invalid");
        }
        }
    }
}