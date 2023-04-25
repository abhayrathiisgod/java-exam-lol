//palindrome
import java.util.*;

class myclass{
    Queue<Character>queue;
    Stack<Character>stack;

    myclass(){
        this.queue= new LinkedList<Character>();
        this.stack= new Stack<Character>();
    }

    void pushCharacter(char ch){
        this.stack.push(ch);
    }

    void enqueueCharacter(char ch){
        this.queue.add(ch);
    }

    char popCharacter(){
        return this.stack.pop();
    }

    char dequeueCharacter(){
        return this.queue.remove();
    }
}

public class code18 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        String input= sc.nextLine();

        //convert string to chararray
        char [] s= input.toCharArray();
        myclass p = new myclass();

        //pushing of characters
        for(char ch:s){
            p.pushCharacter(ch);
            p.enqueueCharacter(ch);

        }
        //popping of characters
        boolean isPalindrome=true;
        for(int i=0;i<s.length/2;i++){
            if(p.popCharacter()!=p.dequeueCharacter()){
                isPalindrome= false;
                break;
            }
        }
        

        //finally print whether s is palindrome or not
        if(isPalindrome){
            System.out.println("The word, "+ input+", is a palindrome");
        }
        else{
            System.out.println("The word, "+ input+", is not a palindrome");
        }

    }
}
