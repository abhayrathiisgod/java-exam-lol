//Create three threads namely Thread1,Thread2,Thread3 in java.,
//The Thread1 should print 2,4,6,....20.
//The Thread2 should print 5,10,15,...100.
//The Thread3 should print 11,22,33,...110.
//(Its Multithreaded program so,the output order is depends upon the system 
//and time and it's cosidered)

import java.util.*;

class A extends Thread{
    public void run(){
    for(int i=0;i<10;i++){
        System.out.print(" "+ i*2);
    }
    }
}
class B extends Thread{public void run(){for(int i=0;i<10;i++){System.out.print(" "+i*5);}}}
class C extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
        System.out.print(" "+i *11);
        }
    }
}
public class code8 {
    public static void main(String [] args){
        A t1= new A();
        B t2= new B();
        C t3= new C();

        t1.start();
        t2.start();
        t3.start();
    }
}
