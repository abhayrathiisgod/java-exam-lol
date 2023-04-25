/* 
Find the middle of a given linked list
Given a singly linked list, find the middle of the linked list.
For example, if the given linked list is 1->2->3->4->5 then the output should be 3.
If there are even nodes, then there would be two middle nodes, we need to print the second middle element.
For example, if given linked list is 1->2->3->4->5->6 then the output should be 4.
Input Format
*/
import java.util.*;

//normal implementation of linked with node, data and next
class LinkedList {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node head;

    //push operation 

    void push(int newdata) {
        Node newnode = new Node(newdata);
        newnode.next = head;
        head = newnode;
    }

    //print linkedlist

    void print() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + "->");
            tnode = tnode.next;
        }
        System.out.print("null");
        System.out.println();

    }

    //finding middle of the linkedlist
    void printmiddle() {
        Node s = head;
        Node f = head;
        if (head != null) {
            while (f != null && f.next != null) {
                s = s.next;
                f = f.next.next;
            }
        }
        System.out.println("The middle element is [" + s.data + "]\n");
    }
}


public class code9 {
    public static void main(String [] args){
        LinkedList llist= new LinkedList();
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            llist.push(sc.nextInt());
        }
        llist.print();
        llist.printmiddle();

    }
}
