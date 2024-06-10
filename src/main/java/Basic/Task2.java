/*
Write a Java program that converts the inches into meters.

Note: One inch is 0.0254 meter.

Test Data
Input a value for inch: 1000

Expected Output: 1000.0 inch is 25.4 meters
 */

package Basic;

import org.example.Main;

import java.util.Scanner;

public class Task2 extends Main {
    public void task2(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter value in inches: ");
        int valueInInches = myObj.nextInt();
        double valueInMeters = valueInInches*0.0254;

        System.out.println(valueInInches+" inches is "+valueInMeters+ " Meters");

    }
}
