import java.io.*;
import java.util.*;

public class StudentManager {
    static String filename = "students.txt";

    public static void addStudent(Student s) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(filename, true));
        bw.write(s.toString());
        bw.newLine();
        bw.close();
    }

    public static void viewStudents() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Student\n2. View Students\n3. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();
                    addStudent(new Student(id, name, course));
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
