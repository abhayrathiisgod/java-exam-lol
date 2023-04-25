//Swap the values in the LinkedList <String>
//Get Ten Strings from the user and put them in a LinkedList<String> object,
// and swap the position second string with fifth string.

import java.util.*;
public class code5 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        LinkedList<String> klist= new LinkedList<String>();
        for(int i=0;i<10;i++){
            klist.add(sc.next());
        }
        Collections.swap(klist,1,4);
        for(String str: klist){
            System.out.println(str);
        }
    }
}
