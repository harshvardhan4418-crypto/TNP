import java.util.Scanner;

public class bankloaneligibility {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Monthly salary : ");
        int s = sc.nextInt();

        System.out.print("Existing EMI : ");
        int e = sc.nextInt();

        System.out.print("Credit score : ");
        int c = sc.nextInt();

        System.out.print("Loan Amount : ");
        int a = sc.nextInt();

        System.out.print("Annual Interest : ");
        int i = sc.nextInt();

        System.out.print("Months : ");
        int m = sc.nextInt();

        if(s >= 25000 && c >= 700 && e <= s * 40 / 100){
            System.out.println("Loan Status : Eligible");

            int maximumEMI = s * 50 / 100 - e;

            double r = i / 12.0 / 100;
            int t = m;

            double monthlyEMI = (a * r * Math.pow(1 + r, t)) / (Math.pow(1 + r, t)- 1); 

            if(monthlyEMI <= maximumEMI){
                System.out.println("Maximum EMI : " + maximumEMI);
                System.out.println("Monthly EMI : " + monthlyEMI);
                System.out.println("Loan amount can be approved");
            }
            else{
                System.out.println("Maximum EMI : " + maximumEMI);
                System.out.println("Monthly EMI : " + monthlyEMI);
                System.out.println("Loan amount cannot be approved under the EMI condition");
            }
        }
        else{
            System.out.print("Loan Status : Not Eligible");
        }
    }
}