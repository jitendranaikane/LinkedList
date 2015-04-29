package com.glitterlabs.datastructures.linkedlist;

public class LinkedList 
{
    private HeaderNode headernode;  // Head is first node in linked list

    public boolean isEmpty()
    {
        return length() == 0;
    }
 
    public void append(String data)
    {
        if(headernode == null)
        {
        	headernode = new HeaderNode(data);
            return;
        }
        tail().next = new HeaderNode(data);
    }
 
    private HeaderNode tail() 
    {
    	HeaderNode tail = headernode;
     
        // Find last element of linked list known as tail
        while(tail.next != null)
        {
          tail = tail.next;
          
        }      
        return tail;
     
    }
 
    public int length() {
       int length = 0;
       HeaderNode current = headernode;  // Starts counting from head - first node
       while(current != null)
       {
           length ++;
           current = current.next;
       }
       return length;
    }

 
    // Node is nested class because it only exists along with linked list
    // Node is private because it's implementation detail
    private static class HeaderNode
    {
        private HeaderNode next;
        private String data;

        public HeaderNode(String data) 
        {
            this.data = data;
        }

       
        public String toString() 
        {
            return this.data;
        }
    }
}



