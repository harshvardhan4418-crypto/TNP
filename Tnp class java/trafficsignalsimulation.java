import java.util.Scanner;

public class trafficsignalsimulation {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of signal cycles : ");
        int n = sc.nextInt();

        int totalpassed = 0;
        int queue =0;

        int remaining = 0;

        StringBuilder output = new StringBuilder();

        for(int i = 0; i < n; i++){
            System.out.print("Signal and number of vehicle waiting : ");
            String s = sc.next();
            int v = sc.nextInt();

        if(s.equals("red")){
            remaining = remaining + v;
            output.append("Cycle " + (i + 1) + " : Passed = 0, Remaining = " + remaining + "\n");
        }
        else if(s.equals("yellow")){
            int passed = Math.min(2, v + remaining);
            remaining = v + remaining - passed;
            totalpassed += passed;

            output.append("Cycle " + (i + 1) + " : Passed = " + passed + ", Remaining = " + remaining + "\n");
        }
        else if(s.equals("green")){
            int passed = Math.min(10, v + remaining);
            remaining = v + remaining - passed;
            totalpassed += passed;

            output.append("Cycle " + (i + 1) + " : Passed = " + passed + ", Remaining = " + remaining + "\n");
        }
        else{
            output.append("Cycle " + (i + 1) + " : Invalid signal");
        }
    }
    System.out.println("\n============= OUTPUT ============");
    System.out.print(output);

    System.out.println("Total passed : " + totalpassed);
    System.out.print("Final Queue : " + remaining);
}
}