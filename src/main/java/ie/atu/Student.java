package ie.atu;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        System.out.println("Please enter name:  \n");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("you entered : " + name);

        System.out.println("Please enter email:  \n");
        String email = input.nextLine();
        System.out.println("you entered : " + email);

        System.out.println("Please enter course:  \n");
        String course = input.nextLine();
        System.out.println("you entered : " + course);

        System.out.println("Please enter second name:  \n");
        String name2 = input.nextLine();
        System.out.println("you entered : " + name2);

        System.out.println("Please enter second email:  \n");
        String email2 = input.nextLine();
        System.out.println("you entered : " + email2);

        System.out.println("Please enter second course:  \n");
        String course2 = input.nextLine();
        System.out.println("you entered : " + course2);
    }
}
