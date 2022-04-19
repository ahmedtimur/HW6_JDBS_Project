package peaksoft;

import peaksoft.dao.UserDaoJdbcImpl;
import peaksoft.service.UserService;
import peaksoft.service.UserServiceImpl;
import peaksoft.util.Util;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Util.connection();
        UserService userService = new UserServiceImpl();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! Choose one of these options...");
        int i = 1;
        while (i != 0) {
            System.out.println("***************************** MENU *********************************");
            System.out.println();
            System.out.println("Press 1 to create table Users\n" +
                    "Press 2 to add users to database\n" +
                    "Press 3 to print all users in database\n" +
                    "Press 4 to clean up the table\n" +
                    "Press 5 to delete the table\n" +
                    "Press 0 to quit");
            System.out.println();
            System.out.println("****************************************************************");
            int input = scanner.nextInt();

                if(input == 1)
                    userService.createUsersTable();

                else if(input == 2) {
                    scanner.nextLine();
                    System.out.println("Enter user's name: ");
                    String inputName = scanner.nextLine();
                    System.out.println("Enter user's last name: ");
                    String inputLastName = scanner.nextLine();
                    System.out.println("Enter user's age: ");
                    byte inputAge = scanner.nextByte();
                    userService.saveUser(inputName, inputLastName, inputAge);
                }

                else if(input == 3)
                    System.out.println(userService.getAllUsers());

                else if(input == 4)
                    userService.cleanUsersTable();

                else if(input == 5)
                    userService.dropUsersTable();

                else if(input == 0) {
                    System.out.println("The program finished. See you!");
                    break;
                }
        }
    }
}
