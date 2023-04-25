/*
 * Program to remove duplicate elements in an array (sorted and unsorted
 *  array cases) is discussed here.
 *  Given an array, all the duplicate elements of the array are removed.
 */
import java.util.*;
public class code17 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                continue;
            }
            else{
                System.out.println(arr[i]);
            }
        }
    }
    
}
