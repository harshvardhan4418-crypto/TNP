import java.util.Scanner;

public class parkingfeecalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of vehicle : ");
        int n = sc.nextInt();

        System.out.print("Parking hours of cars : C ");
        int c = sc.nextInt();

        System.out.print("Parking hours OF bike : B ");
        int b = sc.nextInt();

        System.out.print("Parking hours of truck : T ");
        int t = sc.nextInt();

        int carfee = 0;
        int bikefee = 0;
        int truckfee = 0;

        if(c <= 2){
            carfee = (c * 30);
        }
        else{
            carfee = (2 * 30 + (c - 2) * 20);
        }

        if(b <= 2){
            bikefee = (b * 15);
        }
        else{
            bikefee = (2 * 15 + (b - 2) * 10);
        }

        if(t <= 2){
            truckfee = (t * 50);
        }
        else{
            truckfee = (2 * 50 + (t - 2) * 40);
        }
        int total = carfee + bikefee + truckfee;

        System.out.print("Total Collection : " + total);
    }
}
