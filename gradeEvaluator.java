import java.util.Scanner;

public class gradeEvaluator {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the student's score
        System.out.print("Enter the student's score: ");
        int score = scanner.nextInt();

        // Evaluate the grade based on the score
        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Print the grade
        System.out.println("Grade: " + grade);
    }
}
