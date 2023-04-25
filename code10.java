/*
 * A string containing only parentheses is balanced if the following is true: 
 * 1. if it is an empty string 
 * 2. if A and B are correct, AB is correct, 
 * 3. if A is correct, (A) and {A} and [A] are also correct.
Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"
Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.
Given a string, determine if it is balanced or not.

 */
import java.util.*;
public class code10 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        Stack<Character> st= new Stack<>();
        while(sc.hasNextLine()){
            String line =   sc.nextLine();
            for(char c: line.toCharArray()){
                if(c=='(' || c=='{' || c== '['){
                    st.push(c);
                    continue;
                }
                if(c=='}' && !st.isEmpty() && st.peek()=='{'){
                    st.pop();
                    continue;
                }
                if(c==')' && !st.isEmpty() && st.peek()=='('){
                    st.pop();
                                    }
                if(c==']' && !st.isEmpty() && st.peek()== '['){
                    st.pop();
                }
                if(c=='}' || c==')' || c==']'){
                    st.push(c);
                    break;
                }
            }
        }
        System.out.println(st.isEmpty());
    }
    
}
