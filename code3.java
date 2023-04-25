//user input array of size 5
//input x and y index
//arr[x]/arr[y]
//perform operation 
import java.util.*;
public class code3 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int ARR[]= new int [5];
        int X,Y;
        for(int i=0;i<5;i++){
            ARR[i]= sc.nextInt();
        }
        X= sc.nextInt();
        Y=sc.nextInt();

        try{
            System.out.println(ARR[X]/ARR[Y]);
        }
        catch(ArithmeticException e){
            System.out.println("denominator should not be zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("index must be 0 to 4");
        }
        catch(Exception e){
            System.out.println("unknown exception");
        }

    }
    
}
