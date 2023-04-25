/*
* Get 10 integers from user,find and print the second largest number.
If all numbers are same i.e no second largest number then print -1.
[ Hint:- you may use any Collection classes like 
ArrayList,TreeSet,Hashset,LinkedList..etc]

Algorithm:
1) create a hashset  have all the uniques elements on it
2) take those elements in arraylist
3) if size>1 find second largest 
4) else return -1 as it doesnt have any largest elements
 */
import java.util.*;
public class code15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 10;
        TreeSet<Integer> set = new TreeSet<Integer>();
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        ArrayList<Integer> list = new ArrayList<Integer>(set);
        if (list.size() > 1) {
            System.out.println(list.get(list.size() - 2));
        } else {
            System.out.println("-1");
        }
    }
        sc.close();
    } 

