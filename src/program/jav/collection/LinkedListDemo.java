package program.jav.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class LinkedListDemo {
    public static void main(String a[]){
    	
        LinkedList ll = new LinkedList();
        
        ll.add("January");
        ll.add("March");
        ll.addLast("Sep");
        ll.add("May");
        ll.add("July");
        ll.add("March");
        ll.addFirst("Hello");
        ll.add(5, "August");
        ll.remove(3);
       
        
               
        Iterator itr=ll.iterator();
        while(itr.hasNext()) {
        System.out.println("list is"+ itr.next());
        }

        
        System.out.println(ll);
        System.out.println("Size of the linked list: "+ll.size());
        System.out.println("Is LinkedList empty? "+ll.isEmpty());
        System.out.println("Does LinkedList contains 'September'? "+ll.contains("September"));
        
        
        Vector v = new Vector();
        v.add("Jaipur");
        v.add("Delhi");
        v.add("Mumbai");
        
        Iterator itr1=v.iterator();
        while(itr1.hasNext()) {
        System.out.println("Vector is"+ itr1.next());
        }
        
    }
}