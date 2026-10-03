import java.util.Scanner;

public class cricketscoreanalyzer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("The number of matches : ");
        int n = sc.nextInt();

        int wins = 0;
        int losses = 0;
        int ties = 0;
        int points = 0;
        int totalruns = 0;
        int maxruns = 0;
        int minruns = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            System.out.print("Team Runs : ");
            int t = sc.nextInt();

            totalruns += t;

            if(t > maxruns){
                maxruns = t;
            }
            if(t < minruns){
                minruns = t;
            }

            System.out.print("Opponent Runs : ");
            int o = sc.nextInt();
        
            if(t > o){
                wins++;
            }
            else if(t < o){
                losses++;
            }
            else{
                ties++;
            }
        }
        points = wins * 2 + ties * 1;
        
        System.out.println("\n======== MATCH SUMMARY ========");
        System.out.println("Wins : " + wins);
        System.out.println("Losses : " + losses);
        System.out.println("Ties : " + ties);
        System.out.println("Points : " + points);
        System.out.println("Total Runs : " + totalruns);
        System.out.println("Highest Score : " + maxruns);
        System.out.println("Lowest Score : " + minruns);
    }
}