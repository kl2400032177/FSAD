import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int id;
        String name;
        int sem;
        double sgpa;

        System.out.print("Enter Student ID: ");
        id = sc.nextInt();
        sc.nextLine();  // Clear buffer

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        // Accept only 1st year even semester (Semester 2)
        while (true) {
            System.out.print("Enter Semester (Only 2nd Sem allowed): ");
            sem = sc.nextInt();

            if (sem == 2) {
                break; // Valid semester
            } else {
                System.out.println("❌ Invalid! 1st year even sem = Semester 2 only. Try again.");
            }
        }

        System.out.print("Enter SGPA: ");
        sgpa = sc.nextDouble();

        System.out.println("\n--- Student Details ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Semester: " + sem + " (1st Year Even Sem)");
        System.out.println("SGPA: " + sgpa);
    }
}
