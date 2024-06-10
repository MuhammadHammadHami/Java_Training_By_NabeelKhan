//1.
//        Write a Java method to find the smallest number among three numbers.
//        Test Data:
//        Input the first number: 25
//        Input the Second number: 37
//        Input the third number: 29
//        Expected Output: The smallest value is 25.0

package Basic;

import org.example.Main;

import java.util.Scanner;

public class Task4 extends Main {
    public void smallestNumber(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double firstNumber = myObj.nextInt();
        System.out.println("Enter second number: ");
        double secondNumber = myObj.nextInt();
        System.out.println("Enter third number: ");
        double thirdNumber = myObj.nextInt();
        if (firstNumber >= secondNumber && secondNumber >= thirdNumber){
            System.out.println("Smallest Numbber is: "+thirdNumber);
        } else if (firstNumber >= secondNumber && secondNumber <= thirdNumber) {
            System.out.println("Smallest Numbber is: "+secondNumber);
        }
        else {
            System.out.println("Smallest Numbber is: "+firstNumber);
        }

    }

}
