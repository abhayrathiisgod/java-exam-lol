/*
 * Store all the occurence of letters and show it in accending order
 * //we have to use here treemap (accending key value)
 * treeSet(accending value)
 */
import java.util.*;
public class code12 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        TreeMap<Character,Integer>map= new TreeMap<>();
        String str= sc.next();

        int n= str.length();
        for(int i=0;i<n;i++){
            char c= str.charAt(i);
            Integer val= map.get(c); //store the count of c in map
            //to handle null, we used here wrapper class Integer
            if(val!=null){
                //means c is already is in map
                //so have to increase its frequecy by 1
                map.put(c,(val+1));
            }
            else{
                //c is not in map, so takes its count as 1 and store in map
                map.put(c,1);
            }
        }
        System.out.println("Character frequency in given text: ");
        //using for each loop to present all the elements in the maps

        for(Map.Entry<Character,Integer>entry: map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue()+" ");
        }
    }
    
}
