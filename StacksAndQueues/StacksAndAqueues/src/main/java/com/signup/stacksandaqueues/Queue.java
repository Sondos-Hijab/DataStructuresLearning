/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.signup.stacksandaqueues;

/**
 *
 * @author hp
 */
public class Queue {
    Node head;  //remove from head
    Node tail;  //add to tail
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public int peek(){
        if (head == null) return -1;
        else 
            return head.data;
    }
    
    public void add(int data){
        Node node = new Node(data);
        
        if (head == null) 
        {
            head=node;
            tail=node;
            return;
        }
        
        tail.next = node;
        tail = node;  
    }
    
    public int remove(){
        int data = head.data;
        head = head.next;
        if (head == null){
            tail =null;
        }
        return data;
    }
    
    public void print(){
        if(head == null) return;
        Node curr = this.head;
        while(curr != null){
            System.out.print("  "+curr.data+"  " );
            curr = curr.next;
        }
        System.out.println();
    }
    
    
    public static void main(String[] args){
        Queue q = new Queue();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        
        q.head = n1;
        q.tail = n4;
        
        System.out.println("Head:  "+q.head.data + "   Tail:  "+q.tail.data);
        q.print();
        
        q.add(5);
        System.out.println("Head:  "+q.head.data + "   Tail:  "+q.tail.data);
        q.print();
        
        
        q.add(6);
        System.out.println("Head:  "+q.head.data + "   Tail:  "+q.tail.data);
        q.print();
        
        System.out.println("Removed: "+q.remove());
        System.out.println("Head:  "+q.head.data + "   Tail:  "+q.tail.data);
        q.print();
        
        System.out.println("Removed: "+q.remove());
        System.out.println("Head:  "+q.head.data + "   Tail:  "+q.tail.data);
        q.print();
    }
    
}
