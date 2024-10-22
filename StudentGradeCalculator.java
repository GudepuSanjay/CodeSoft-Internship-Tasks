import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner reads =new Scanner(System.in);
        int total_marks=0;
        int marks=0;
        System.out.println("WELCOME TO STUDENTS GRADE CALCULATOR...!!!!! ");
        System.out.println("ENTER NUMBER OF SUBJECTS:");
        int noofsubjects=reads.nextInt();
        System.out.println("ENTER MARKS FOR SUBJECTS(OUT OF 100):");
        for(int i=1;i<=noofsubjects;i++)
        {
            System.out.println("ENTER SUBJECT "+i+" MARKS:");
            marks=reads.nextInt();
            total_marks=total_marks+marks;
        }
        System.out.println("YOUR TOTAL MARKS OF "+noofsubjects+" SUBJECTS IS:"+total_marks);
        int avg_percentage= total_marks/noofsubjects;
        System.out.println("YOUR PERCENTAGE IS:"+avg_percentage+"%");
        if(avg_percentage>90 && avg_percentage<100)
        {
            System.out.println("CONGRTULATIONS YOU GOT (A) GRADE (EXCELLENT PERFORMANCE...)");
            System.out.println("DO YOU WANT SUGGESTIONS..:");
            System.out.println("1.YES");
            System.out.println("2.NO");
            int response=reads.nextInt();
            switch (response) {
                case 1:  System.out.println("Maintain consistency:\n You are already doing great! Keep your current study habits, but donot get complacent. Regularly review your notes to stay sharp.");
                    break;
                    case 2:System.out.println("THANK YOU...!!!");
                    break;
                default:
                    System.out.println("INVALID NUMBER YOU ENTERED....");
                    break;
            }
            
        }
        else if(avg_percentage>80 && avg_percentage<90)
        {
            System.out.println("CONGRTULATIONS YOU GOT (B) GRADE (GOOD PERFORMANCE...)");
            System.out.println("DO YOU WANT SUGGESTIONS..:");
            System.out.println("1.YES");
            System.out.println("2.NO");
            int response=reads.nextInt();
            switch (response) {
                case 1:  System.out.println("Identify areas for improvement: \nReview your past assignments or tests to identify specific topics where you lost marks.");
                    break;
                    case 2:System.out.println("THANK YOU...!!!");
                    break;
                default:
                    System.out.println("INVALID NUMBER YOU ENTERED....");
                    break;
            }
        }
        else if(avg_percentage>70 && avg_percentage<80)
        {
            System.out.println("CONGRTULATIONS YOU GOT (C) GRADE (AVERAGE PERFORMANCE...)");
            System.out.println("DO YOU WANT SUGGESTIONS..:");
            System.out.println("1.YES");
            System.out.println("2.NO");
            int response=reads.nextInt();
            switch (response) {
                case 1:  System.out.println("Rethink your study strategies:\n Reflect on whats working and what isnot. Experiment with new learning techniques like study groups, visual aids, or summarizing concepts.");
                    break;
                    case 2:System.out.println("THANK YOU...!!!");
                    break;
                default:
                    System.out.println("INVALID NUMBER YOU ENTERED....");
                    break;
            }
        }
        else if(avg_percentage>60 && avg_percentage<70)
        {
            System.out.println("CONGRTULATIONS YOU GOT (D) GRADE (BELOW AVERAGE PERFORMANCE...)");
            System.out.println("DO YOU WANT SUGGESTIONS..:");
            System.out.println("1.YES");
            System.out.println("2.NO");
            int response=reads.nextInt();
            switch (response) {
                case 1:  System.out.println("Urgent revision:\n Go back to basics. Revise fundamental concepts you may have missed earlier, as a weak foundation can affect understanding of advanced topics.");
                    break;
                    case 2:System.out.println("THANK YOU...!!!");
                    break;
                default:
                    System.out.println("INVALID NUMBER YOU ENTERED....");
                    break;
            }
        }
        else{
            System.out.println("SORRY YOU ARE (F) FAIL....  ");
            System.out.println("DO YOU WANT SUGGESTIONS..:");
            System.out.println("1.YES");
            System.out.println("2.NO");
            int response=reads.nextInt();
            switch (response) {
                case 1:  System.out.println("""
                                            Donot get discouraged:
                                             Failing is a setback, but it\u2019s also an opportunity to learn and improve. Understand that failure is part of the learning process.
                                            Diagnose the problem: 
                                            Figure out why you failed. Was it a lack of understanding, poor time management, or not enough effort? Identifying the cause is crucial""" //
            );
                    break;
                    case 2:System.out.println("THANK YOU...!!!");
                    break;
                default:
                    System.out.println("INVALID NUMBER YOU ENTERED....");
                    break;
            }
        }
    }
}
