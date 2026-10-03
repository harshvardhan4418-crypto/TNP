import java.util.Scanner;

public class digitalsumandproduct {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number is : ");
        int n = sc.nextInt();

        int sum = 0;
        int pro = 1;
        int temp = n;

        while(temp > 0){
            int digit = temp % 10;
            sum += digit;
            temp = temp / 10;
        }

        temp = n;

        while(temp > 0){
            int digit = temp % 10;
            pro *= digit;
            temp = temp / 10;
        }

        System.out.println("the sum of digit : " + sum);
        System.out.println("the pro of digit : " + pro);

        if(sum % 3 == 0){
            System.out.println("Divisible by 3");
        } 
        else{
            System.out.println("Not divisible by 3");
        }
    }
}