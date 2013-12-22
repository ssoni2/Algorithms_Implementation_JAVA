package com.intern;
import java.util.HashMap;

public class LLRemoveDupli{
	public static void main(String[] args){
		LinkedList ll = new LinkedList();
		ll.addNode(1);ll.addNode(1);ll.addNode(2);ll.addNode(2);ll.addNode(3);
		ll.display();
		removeDup(ll);
		ll.display();
		
	}
	public static void removeDup(LinkedList ll){
		HashMap<Integer,Boolean> hash = new HashMap<Integer,Boolean>();
		Node move = ll.head;
		Node previous = null;
		while(move!=null){
			if(hash.containsKey(move.data)){
				previous.next = move.next;
			}
			hash.put(move.data,true);
			previous = move;
			move = move.next;
		}
		
	} 
}