package ie.atu;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        System.out.println("Please enter name:  ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("you entered : " + name);
    }
}
