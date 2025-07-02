import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {
            System.out.println("\n1. Add Student\n2. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Roll No: ");
                String roll = sc.nextLine();
                System.out.print("Course: ");
                String course = sc.nextLine();
                System.out.print("Contact: ");
                String contact = sc.nextLine();

                Student s = new Student(name, roll, course, contact);
                s.setName(name);
                s.setRollNumber(roll);
                s.setCourse(course);
                s.setContact(contact);

                try {
                    dao.addStudent(s);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                break;
            }
        }
        sc.close();
    }
}
