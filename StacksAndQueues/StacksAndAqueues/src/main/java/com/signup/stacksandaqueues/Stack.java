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
public class Stack {
    Node top;
    
    public boolean isEmpty(){
        return top == null;
    }
    
    public int peek(){
        if (top == null) return -1;
        else 
            return top.data;
    }
    
    public void push(int data){
        
        Node node = new Node(data);
        if(top == null) {
            top = node;
            return;
        }
        node.next=top;
        top = node;
    }
    
    public int pop(){
        int data = top.data;
        if(top == null) return -1;
        top = top.next;
        return data;
    }
    
    
    
    public static void main(String[] args){
        
    } 
}
