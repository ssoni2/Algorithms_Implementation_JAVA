package com.intern;

class Node{
	int data;
	Node next = null;
	public Node(int data){
		this.data=data;
	}
}

class LinkedList{
	Node head;
	public void addNode(int d){
		Node n = new Node(d);
		if (this.head==null) head = n;
		else {
			Node move = head;
			while(!(move.next==null)){
				move = move.next;
			}
			move.next=n;
		}
	}
	public void deleteNode(int d){
		if (head==null) return;
		if(head.data==d){
			head = head.next;
		}else{
			Node move = head;
			while(!(move.next==null)){
				if(move.next.data==d){
					move.next=move.next.next;
					return;
				}
				move = move.next;
			}
		}
	}
	public void display(){
		Node move = head;
		while(move!=null){
			System.out.print(move.data+" ");
			move=move.next;
		}
		System.out.println();
	}
}

public class LinkedListRun{
	public static void main(String[] args){
		LinkedList ll = new LinkedList();
		ll.addNode(1);ll.addNode(2);ll.addNode(3);ll.addNode(4);
		ll.display();
		ll.deleteNode(2);
		ll.display();
		
	}
}
