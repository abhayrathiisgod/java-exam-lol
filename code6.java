//Get 10 integers from user,find and print the second largest number.
//If all numbers are same i.e no second largest number then print -1.
import java.util.*;
public class code6{
    public static void main(String [] args){
        Scanner sc= new Scanner (System.in);
        //TreeSet to store sort non- duplicate elements
        TreeSet<Integer>ts= new TreeSet<Integer>();
        for(int i=0;i<10;i++){
            ts.add(sc.nextInt());
        }
        //creating an arraylist and initialising it with TreeSet
        ArrayList<Integer> list= new ArrayList<Integer>(ts);
        if(list.size()>1){
            System.out.println(list.get(list.size()-2));
        }
        else{
            System.out.println("-1");
        }
    }
}