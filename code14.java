/*
 * Consider you have two sets and each set contains 5 integers,your task is to print the non common elements in both the sets.
if there is no non common elements in both the stes,then print -1.
HashSet: unique elements, no order following

noncommon= union-intersection
 */
import java.util.*;
public class code14 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        HashSet<Integer>a= new HashSet<>();
        HashSet<Integer>b= new HashSet<>();
        for(int i=0;i<5;i++){
            a.add(sc.nextInt());
        }
        for(int i=0;i<5;i++){
            b.add(sc.nextInt());
        }
        //finding the union
        HashSet<Integer>union= new HashSet<>(a);
        union.addAll(b);
        //finding intersection
        HashSet<Integer>intersection= new HashSet<>(a);
        intersection.retainAll(b); //retain all b in a means intersection

        union.removeAll(intersection); //non common number

        if(union.size()==0){
            System.out.println("-1");
        }
        for(int x:union){
            System.out.print(" "+ x);
        }

    }
    
}
