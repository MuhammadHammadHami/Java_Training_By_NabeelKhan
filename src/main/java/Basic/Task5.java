//3.
//        Write a Java method to display the middle character of a string.
//        Note: a) If the length of the string is odd there will be two middle characters.
//        b) If the length of the string is even there will be one middle character.

//        Test Data:
//        Input a string: 350
//        Expected Output:

package Basic;

import org.example.Main;

public class Task5 extends Main {
    public void task5(){
        String name = "Hamad";
        int stringLenth = name.length();
        int mid = stringLenth / 2;
        if (stringLenth % 2 == 0){
            System.out.println("Middle char of even string: "+ name.charAt(mid-1)+" "+name.charAt(mid));
        }
        else
            System.out.println("Middle char of odd string: "+ name.charAt(mid));
    }


}
