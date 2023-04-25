import java.util.*;
public class code1 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        try{
            int x= sc.nextInt();
            int y= sc.nextInt();
            System.out.println(x/y);
        }
        catch(InputMismatchException e){
            System.out.println(e.getClass().toString().replaceFirst("class",""));
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
