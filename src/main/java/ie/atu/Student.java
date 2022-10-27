package ie.atu;

import java.util.Scanner;

public class Student {
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
        student2.setName(name);

        System.out.println("Please enter second email:  \n");
        String email2 = input.nextLine();
        student2.setEmail(email);

        System.out.println("Please enter second course:  \n");
        String course2 = input.nextLine();
        student2.setCourse(course);

        userDetails student3 = new userDetails();
        System.out.println("Please enter second name:  \n");
        String name3 = input.nextLine();
        student3.setName(name);

        System.out.println("Please enter second email:  \n");
        String email3 = input.nextLine();
        student3.setEmail(email);

        System.out.println("Please enter second course:  \n");
        String course3 = input.nextLine();
        student3.setCourse(course);


    }
}
