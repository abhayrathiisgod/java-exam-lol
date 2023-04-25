/*Create your own exception called "IncorrectAgeException". 
It should display the message as “Please Enter Correct Age”.
Your code should get age as input from the user.
If age is greater than 150, throw an IncorrectAgeException.
If age is less than or equal to 150, display "welcome" message. */
/* 
import java.util.*;


class IncorrectAgeException extends Exception {
    public IncorrectAgeException(String message) {
        super(message);
    }
}

public class code4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            if (age > 150) {
                throw new IncorrectAgeException("Please Enter Correct Age");
            } else {
                System.out.println("Welcome");
            }
        } catch (IncorrectAgeException e) {
            System.out.println(e);
        }
    }
}
*/


import java.util.*;
class  IncorrectAgeException extends Exception{
    public IncorrectAgeException(String message){
        super(message);
    }
}

class code4{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        try{
            if(n>150){
                throw new IncorrectAgeException("Please Enter correct age");
            }
            else{
                System.out.println("Welcome");
            }
        }
        catch(IncorrectAgeException e){
            System.out.println(e);
        }
    }
}