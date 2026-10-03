import java.util.Scanner;

public class smartgrocerycheckout {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of product : ");
        int n = sc.nextInt();

        double total = 0;

        for(int i = 0; i < n; i++){
            System.out.print("Enter price and quantity: ");
            double price = sc.nextDouble();
            double quantity = sc.nextDouble();
            total += price * quantity;
        }

        int discountpercent = 0;

        if(total < 1000){
            discountpercent = 0;
        }
        else if(total >= 1000 && total < 5000){
            discountpercent = 5;
        }
        else if(total >= 5000 && total < 10000){
            discountpercent = 10;
        }
        else{
            discountpercent = 15;
        }
        double discountamount = total * (discountpercent / 100.00);
        double taxamount = total * (5 / 100.00);
        double finalamount = total - discountamount + taxamount;

        System.out.println("Discount : " + discountamount);
        System.out.println("Tax : " + taxamount);
        System.out.print("Final Amount : " + finalamount);
    }
}
