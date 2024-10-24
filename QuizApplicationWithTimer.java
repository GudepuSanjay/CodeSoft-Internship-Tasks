import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class QuizApplicationWithTimer 
{ 
    public static class Quizstructure{
        private int score=0;
        private String[] questions={"What is the capital of India?",
            "Which programming language is used for Android development?",
            "Who painted the Mona Lisa?"};
            private String[][] options={{"Delhi", "Mumbai", "Kolkata", "Chennai"},{"Java", "Python", "C++", "JavaScript"},{"Leonardo da Vinci", "Michelangelo", "Raphael", "Rembrandt"}};
            private int[] correctoptions={0,0,0};

            public void quizbegins()
            {  
                Scanner reads = new Scanner(System.in);
                
                for(int i=0;i<questions.length;i++)
                {   System.out.println("");
                    System.out.println("Question: "+(i+1)+" :"+questions[i]);
                    System.out.println("Options :");
                    for(int j=0;j<options[i].length;j++)
                    {
                        System.out.println(("options: "+(j+1)+"."+options[i][j]));
                    }
                    Timer timer = new Timer();
                    TimerTask task=new TimerTask(){
                        @Override
                        public void run() {
                            System.out.println("Time's up!");
                        }
                    };
                    timer.schedule(task, 10000);
                    System.out.println("Enter your options (1-4):");
                    int response=reads.nextInt();
                    if(response==correctoptions[i]+1)
                    {
                        System.out.println("Correct...!!!");
                        score++;
                    }
                    else {
                        System.out.println("Wrong Answer...!!!");
                        System.out.println("Correct Answer is:"+(correctoptions[i] + 1));
                       }
                       timer.cancel();
                }
                System.out.println("Your Score:"+score+"/"+questions.length);
                System.out.println("Number of Correct Answers:"+score);
                System.out.println("Wrong Answers:"+(questions.length-score));
            
            }
        }
        public static void main(String[] args) {
        Quizstructure quiz =new Quizstructure();
        quiz.quizbegins();
        }
}
