import java.util.Scanner;

public class studentresultanalyzer {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of subject : ");
        int n = sc.nextInt();

        int total = 0;
        int failedsubject = 0;

        System.out.print("Marks : ");
        for(int i = 1; i <= n; i++){
            System.out.print("Subject" + i + " : ");
            int marks = sc.nextInt();
            total += marks;

            if(marks < 40)
            failedsubject++;
        }
        double average = (double) total / n;

        System.out.println("Total marks : " + total);
        System.out.println("Average : " + average);
        System.out.println("Failed subject : " + failedsubject);

        System.out.print("Result is : ");

        if(failedsubject == 0 && average >= 50){
            System.out.print("Pass");
        }
        else{
            System.out.print("Fail");
        }
    }
}