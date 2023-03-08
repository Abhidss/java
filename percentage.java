import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks for 5 subjects:");
        int totalMarks = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        double percentage = (totalMarks * 100.0) / (5 * 100);
        System.out.println("Percentage: " + percentage + "%");
    }
}
