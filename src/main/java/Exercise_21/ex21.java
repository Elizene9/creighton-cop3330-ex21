/*
* UCF COP 3330 Summer 2021 Assignment 1 Solutions
* Copyright 2021 Charlene Creighton
 */

/*
Write a program that converts a number from 1 to 12 to the corresponding month.
Prompt for a number and display the corresponding calendar month,
with 1 being January and 12 being December. For any value outside that range,
display an appropriate error message.

Example Output
Please enter the number of the month: 3
The name of the month is March.

Constraints
Use a switch or case statement for this program.
Use a single output statement for this program.
 */
package Exercise_21;

import javax.sql.rowset.serial.SerialException;
import java.util.Scanner;
public class ex21 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\nPlease enter the number of the month\n");
        int num = input.nextInt();
        
        String[] months = {
                "January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December"
        };
        int choice;
        if (num > 12 || num < 1)
            choice = 2;
        else
            choice = 1;

        switch (choice) {
            case 1:
                System.out.printf("\nThe name of the month is %s.", months[num - 1]);
                break;
            case 2:
                System.out.println("\nSorry that is not a valid month number");
                break;

            default:
                System.out.println("Nothing has been entered\n");
        }
    }
}

    


