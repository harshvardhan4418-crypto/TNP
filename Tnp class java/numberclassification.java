import java.util.Scanner;

public class numberclassification {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number is : ");
        int n = sc.nextInt();

        if(n % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

        if(n > 0){
            System.out.println("Positive");
        }
        else if (n == 0){
            System.out.println("Zero");
        }

        if(n % 5 == 0){
            System.out.println("Divisible by 5");
        }
        else {
            System.out.println("Not divisible by 5");
        }
    }
}