import java.util.Scanner;

public class electricbill {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Total electric consume : ");
        int n = sc.nextInt();

        System.out.print("Elsectric bill is : ");

        if(n <= 100){
            System.out.print(n * 5);
        }
        else if(n > 100 && n <= 200){
            System.out.print(100 * 5 + (n - 100) * 7);
        }
        else if(n > 200 && n <= 400){
            System.out.print(100 * 5 + 100 * 7 + (n - 200) * 10);
        }
        else if(n > 400){
            System.out.print(100 * 5 + 100 * 7 + 200 * 10 + (n - 400) * 15);
        }
    }
}