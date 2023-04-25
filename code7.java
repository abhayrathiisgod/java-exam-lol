//Write a java program to create a own exception called 
//DivisiblebyFiveException it should display an message called 
//"Number should not be divided by five". Get an input from the user.
//If number divisble by 5 it should raise an exception called 
//DivisiblebyFiveException.Otherwise Print Valid Number.
import java.util.*;
class DivisiblebyFiveException extends Exception{
    DivisiblebyFiveException(String message){
        super(message);
    }
}
public class code7 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        try{
            if(n%5==0){
                throw new DivisiblebyFiveException("Number should not be divided by five");
            }
            else{
                System.out.println(n);
            }
        }
        catch(DivisiblebyFiveException e){
            System.out.println(e);
        }
    }
}
