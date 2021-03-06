/*
Author: ssoni2@buffalo.edu	
Date: 6-Jan-2014
Des: Code to find next node in Binary Search Tree
*/

package com.intern;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	TreeNode parent;
	public TreeNode(int data){
		this.data  = data;
	}
	public void addLeft(TreeNode left){
		if(left==null) return;
		this.left=left;
		left.parent=this;
	}
	public void addRight(TreeNode right){
		if(right == null) return;
		this.right = right;
		right.parent=this;
	}
	public static TreeNode createBST(int[] dataArray){
		return createBST(dataArray, 0, dataArray.length-1);
	}
	public static TreeNode createBST(int[] dataArray, int start, int end){
		if(end<start) return null;
		int mid = (start+end)/2;
		TreeNode root = new TreeNode(dataArray[mid]);
		root.addLeft(createBST(dataArray, start, mid-1));
		root.addRight(createBST(dataArray, mid+1, end));
		return root;
	}
	public static void print(TreeNode root){
		if(root==null) return;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while(!q.isEmpty()){
			TreeNode temp = q.poll();
			System.out.println(temp.data);
			if(temp.left!=null) q.add(temp.left);
			if(temp.right!=null) q.add(temp.right);
		}
		
	}
	public static TreeNode nextNode(TreeNode current){
		
		if (current == null) return null;
                
                // Found right children -> return left most node of right subtree
                if (current.parent == null || current.right != null) { 
                        TreeNode temp = current.right;
			while(temp.left!=null){
				temp=temp.left;
			}
			return temp;		
                } else { 
                        TreeNode curr = current;
                        TreeNode parent = current.parent;
                        // Go up until we’re on left instead of right
                        while (parent != null && parent.left != curr) {
                                curr = parent;
                                parent = curr.parent;
                        }
                        return parent;
                }  
				
	}
	public static TreeNode firstNode(TreeNode root){
		if (root==null) return null;		
		TreeNode temp = root.left;
		TreeNode first = null;
		while(temp!=null){
			first=temp;
			temp=temp.left;
		}
		return first;
		
	}
}

public class NextNodeBST{
	public static void main(String[] args){
		int[] dataArray = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
		TreeNode root = TreeNode.createBST(dataArray);
		TreeNode.print(root);
		
		TreeNode temp = TreeNode.firstNode(root);
		//System.out.print(temp.data+" ");
		while(temp!=null){
		System.out.print(temp.data+" ");
		temp = TreeNode.nextNode(temp);
		}
		
	}
}
