/*
 * Raju is a little boy studying the fifth standard in ABC matric higher secondary school. 
 * Next week is annual at his school. He wants to participate in a contest.
 *  His friend Babu registered himself and Raju in a contest. 
 * The contest was named as Memory Zone. Raju has no idea about the contest.
 *  So he willing to practice in order to prevent humiliation on an annual day.
 *  As a boy studying 5th standard, he not able to practice for the contest. 
 * The contest Memory Zone is about memorizing the words. 
 * Before the contest starts Judge give some words. 
 * Contestants have to memorize them and write them in the same order. 
 * Help Raju to practice this using a computer program. 
 * Note: Using LinkedList and Iterator
 * 
 * using iterator iterate and print the linked list elements
 */
import java.util.*;
public class code16 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        LinkedList<String> ll =new LinkedList<String>();
        for(int i=0;i<n;i++){
            String str= sc.next();
            ll.add(str);
        }
        Iterator<String> it= ll.iterator(); 
        //it is a iterator for a set of string that runs on ll
        while(it.hasNext()){
            System.out.println( it.next()+" ");
        }
    }
    
}
