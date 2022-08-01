package com.DataStructure.HashTable.BTS.Program;

public class BinaryTreeSearcUC4 {
		   static class Node {
		       int data;
		       Node left;
		       Node right;
		 
		       Node(int data) {
		           this.data = data;
		           this.left = null;
		           this.right = null;
		       }
		   }		 
		   static class BinaryTree {
		       static int idx = -1;
		       public static Node buildTree(int nodes[]) {
		           idx++;
		       //    System.out.println(nodes[idx]);
		           if(nodes[idx] == -1) {
		               return null;
		           }
		           Node newNode = new Node(nodes[idx]); 
		           newNode.left = buildTree(nodes);
		           newNode.right = buildTree(nodes);
//		           System.out.print(newNode.data);
//		           System.out.print(newNode.right);
//		           System.out.println(newNode.left);
		           return newNode;
		       }
		   }
		   public static void main(String args[]) {
		       int nodes[] = {56, 70,-1,-1, 30, -1,-1};
		       BinaryTree tree = new BinaryTree();
		      
		       Node root = tree.buildTree(nodes);
		       System.out.println("  "+root.data);
		       System.out.print(root.left.data+"  ");
		       System.out.println(root.right.data);
		      
	
		     
		   }
}


//public static void preorder(Node root) {
//    if(root == null) {
//        System.out.print(-1+" ");
//        return;
//    }
//    System.out.print(root.data+" ");
//    preorder(root.left);
//    preorder(root.right);
//}
//}