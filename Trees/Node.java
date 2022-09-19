/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.signup.trees;

/**
 *
 * @author hp
 */
public class Node {
    Node left, right;
    int data;
    public Node (int data){
        this.data = data;
    }
    
    public void insert(int value){
        if (value<=data){
            if(left!=null){
                left.insert(value);
            }
            else{
                left = new Node(value);
            }
        }
        else{
            if(right!= null){
                right.insert(value);
            }
            else{
                right = new Node(value);
            }
        }
    }
    
    public boolean contains (int value){
        if(data == value) return true;
        
        else if(value<data){
            if(left == null){
                return false;
            }
            else{
                return left.contains(value);
            }
        }
        
        else{
            if(right == null){
                return false;
            }
            else{
                return right.contains(value);
            }
            
        }
    }
    
    public void printInOrder (){
        if(left != null) left.printInOrder();
        System.out.println(data);
        if(right != null) right.printInOrder();
    }
}
