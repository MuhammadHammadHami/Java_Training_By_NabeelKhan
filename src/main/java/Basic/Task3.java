/*
Create a variable and do the type conversion from string to int and int to string. For example:
create a variable "num" with integer data type and try to convert it to string and print the number
Similarly create a variable with String data type and try to convert it into int and print the converted number
*/

package Basic;

import org.example.Main;

public class Task3 extends Main {

    public void task3(){
        int num = 10;
        String name = "10";

        String intoInt = Integer.toString(num);
        int intoString = Integer.parseInt(name);

        System.out.println("In Line: "+ String.valueOf(num));

        System.out.println("Type Casting Integer to String: "+intoInt);
        System.out.println("Type Casting String to Integer: "+intoString);
    }
}
