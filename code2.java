//Rithvik likes to play with numbers, every day he used to solve one Brain Teaser, today he attempted to solve the GAPFUL NUMBER.
//A gapful number is a number of 3 digits that is divisible by the number formed by the first and last digits of the original number. Help him write a program to check whether the given number is a gapful number or not.

import java.util.*;
public class code2 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int first= n/100; 
        int second= n%10;
        int divisor= first*10+second;
        boolean isgapful= false;
        if(n % divisor ==0){
            isgapful= true;
        }
        if(isgapful){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    
}
