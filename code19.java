//Task:Collection Interface - 
//Sort an ArrayList<Integer> in descending chronological order.
import java.util.*;
public class code19 {
    public static void main(String [] args){
        Scanner sc= new Scanner (System.in);
        int n= sc.nextInt();
        ArrayList<Integer> list= new ArrayList<Integer>(n);
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        } 
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
