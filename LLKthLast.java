package com.intern;
import java.util.HashMap;

public class LLKthLast{
	public static void main(String[] args){
		int k = Integer.parseInt(args[0]);
		if(k<1){
			System.out.println("Invalid no. Must be > 0");
			return;
		}
		LinkedList ll = new LinkedList();
		ll.addNode(1);ll.addNode(2);ll.addNode(3);ll.addNode(4);ll.addNode(5);
		ll.display();
		kthLast(ll,k);
		
		
	}
	public static void kthLast(LinkedList ll, int k){
		Node move = ll.head;
		int count = 0;
		Node result = ll.head;
		while(move!=null){
			count++;
			if(count-k>0){
				result = result.next;
			}
			move = move.next;
		}
		if(count<k){
			System.out.println(k+" excede size of list "+count);
		}else{
			System.out.println("Data at "+k+" from last: "+result.data);
		}
		return;
		
	} 
}