import Service.StudentServices;

import java.util.Scanner;

public class ProgramCore {
    Scanner scanner = new Scanner(System.in);

    public void menu() {
        System.out.println("Welcome in my school");
        System.out.println("[0] exit program");
        System.out.println("[1] enter student options");
        System.out.println("[2] enter teacher options");
        System.out.println("[3] manage the school");
        System.out.println("enter the number of the appropriate action ");


        switch (scanner.nextInt()) {
            case 0:
                break;
            case 1:
                System.out.println("b");
                break;
            case 2:
                System.out.println("c");
                break;
            case 3:
                System.out.println("d");
                break;
            default:
                System.out.println("enter the number allowed");
                menu();
        }
    }

    public void studentMenu() {
        System.out.println("[0] back");
        System.out.println("[1] My profile");
        System.out.println("[2] How much i have to pay");
        switch (scanner.nextInt()) {
            case 0:
                menu();
                break;
            case 1:
                StudentServices studentServices = new StudentServices();

        }
    }
}
