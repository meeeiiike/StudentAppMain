package ie.atu;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        System.out.println("Please enter name:  \n");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        userDetails student = new userDetails();
        student.setName(name);

        System.out.println("Please enter email:  \n");
        String email = input.nextLine();
        student.setEmail(email);

        System.out.println("Please enter course:  \n");
        String course = input.nextLine();
        student.setCourse(course);

        userDetails student2 = new userDetails();
        System.out.println("Please enter second name:  \n");
        String name2 = input.nextLine();
        student2.setName(name2);

        System.out.println("Please enter second email:  \n");
        String email2 = input.nextLine();
        student2.setEmail(email2);

        System.out.println("Please enter second course:  \n");
        String course2 = input.nextLine();
        student2.setCourse(course2);

        userDetails student3 = new userDetails();
        System.out.println("Please enter second name:  \n");
        String name3 = input.nextLine();
        student3.setName(name3);

        System.out.println("Please enter second email:  \n");
        String email3 = input.nextLine();
        student3.setEmail(email3);

        System.out.println("Please enter second course:  \n");
        String course3 = input.nextLine();
        student3.setCourse(course3);

        System.out.println("Student No.1: " + student.getName());
        System.out.println("Email: " + student.getEmail());
        System.out.println("Course: " + student.getCourse());

        System.out.println("Student No.2: " + student2.getName());
        System.out.println("Email: " + student2.getEmail());
        System.out.println("Course: " + student2.getCourse());

        System.out.println("Student No.3: " + student3.getName());
        System.out.println("Email: " + student3.getEmail());
        System.out.println("Course: " + student3.getCourse());
    }
}
