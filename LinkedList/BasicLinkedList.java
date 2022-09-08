//Node class
public class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
    }
    
}

//LinkedList Class
public class LinkedList {
    Node head;
    public void append(int data){
        if(head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
    }
    
    public void preappend(int data){
        Node current = new Node (data);
        current.next = head;
        head = current;
    }
    
    public void deleteWithValue(int data){
        if(head == null) return;
        if(head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while(current.next != null){
            if(current.next.data == data){
                current.next = current.next.next;
                return;
            }
            
            current = current.next;
        }
        
    }
    
}
