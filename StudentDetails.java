import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int id;
        String name;
        String sem;
        double cgpa;

        System.out.print("Enter Student ID: ");
        id = sc.nextInt();
        sc.nextLine();  

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Semester(even or odd): ");
        sem = sc.nextLine();

        System.out.print("Enter SGPA: ");
        cgpa = sc.nextDouble();

        System.out.println("\n--- Student Details ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Semester: " + sem);
        System.out.println("CGPA: " + cgpa);
    }
}
