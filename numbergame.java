import java.util.Random;
import java.util.Scanner;
public class numbergame{
    public static void main(String[] args) {
        Scanner reads=new Scanner(System.in);
        Random custom =new Random();
        int guessingnumber;
        int randomnumber=custom.nextInt(100)+1;
        int total_attempts=3;
        int attempt=0;
        boolean play=true;
        System.out.println("WELCOME TO NUMBERS GAME......!!!");
        System.out.println("YOU HAVE "+total_attempts +" ATTEMPTS TO PLAY THE GAME.....!!!");
        while(play)
        {
            int score=0;
            int totalscore=0;
            boolean guessing=false;
        while(attempt<total_attempts && !guessing)
    {
        System.out.println("ENTER A GUESS FOR GENERATED NUMBER:");
        guessingnumber=reads.nextInt();
        attempt++;
        if(guessingnumber==randomnumber)
        {
            System.out.println("CONGRATULATIONS !! YOU HAVE GUESSED CORRECT NUMBER....");
            guessing=true;
            score=total_attempts-attempt+ 1;
            totalscore=totalscore+score;
            System.out.println("BRAVO!!! YOU GOT "+score+" POINTS IN THE "+attempt+" (ATTEMPT/ROUND)");
            System.out.println("YOU HAVE REMAINING "+(total_attempts-attempt)+" ATTEMPTS LEFT");
        }
        else if(guessingnumber<randomnumber)
        {
            System.out.println("TOO LOW....! TRY AGAIN....!");
           System.out.println("YOU HAVE "+(total_attempts-attempt)+" ATTEMPTS LEFT");
        }
        else{
            System.out.println("TOO HIGH...! TRY AGAIN....!");
            System.out.println("YOU HAVE "+(total_attempts-attempt)+" ATTEMPTS LEFT");
        }
        }
        if(!guessing)
        {
            System.out.println("YOUR ATTEMPTS ARE COMPLETED...");
            System.out.println("THE GENERATED NUMBER IS:"+randomnumber);
        }
        System.out.println("YOUR TOTAL SCORE IS:"+totalscore);
        play=false;
    }
    System.out.println("THANKS FOR PLAYING...!!");
    }

}