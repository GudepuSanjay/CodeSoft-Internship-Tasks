import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class QuizApplicationWithTimer {
    public static class QuizStructure {
        private String[] questions = {
                "What is the capital of India?",
                "Which programming language is used for Android development?",
                "Who painted the Mona Lisa?"
        };
        private String[][] options = {
                {"Delhi", "Mumbai", "Kolkata", "Chennai"},
                {"Java", "Python", "C++", "JavaScript"},
                {"Leonardo da Vinci", "Michelangelo", "Raphael", "Rembrandt"}
        };
        private int[] correctAnswers = {0, 0, 0};
        private int score = 0;
        public void beginQuiz() {
            Scanner reads = new Scanner(System.in);
            for (int i = 0; i < questions.length; i++) {
                System.out.println("Question " + (i + 1) + ": " + questions[i]);
                for (int j = 0; j < options[i].length; j++) {
                    System.out.println((j + 1) + ". " + options[i][j]);
                }
                Timer timer = new Timer();
                TimerTask task = new TimerTask() {
                    @Override
                    public void run() {
                        System.out.println("Time's up! Moving to the next question.");
                        timer.cancel();
                    }
                };
                timer.schedule(task, 5000); 
                System.out.print("Enter your answer (1-4): ");
                if (reads.hasNextInt()) {
                    int response = reads.nextInt();
                    timer.cancel();
                    if (response == correctAnswers[i] + 1) {
                        System.out.println("Correct!");
                        score++;
                    } else {
                        System.out.println("Incorrect. The correct answer is " + (correctAnswers[i] + 1) + ".");
                    }
                } else {
                    System.out.println("Invalid input. Moving to the next question.");
                    reads.next(); 
                }
            }
            System.out.println("Your score: " + score + "/" + questions.length);
            System.out.println("Correct answers: " + score);
            System.out.println("Incorrect answers: " + (questions.length - score));
        }
    }
    public static void main(String[] args) {
        QuizStructure quiz = new QuizStructure();
        quiz.beginQuiz();
    }
}
