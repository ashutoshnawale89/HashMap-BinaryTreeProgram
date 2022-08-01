package com.DataStructure.HashTable.BTS.Program;

public class BinaryTreeSearchUC6 {

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
			if(nodes[idx] == -1) {
				return null;
			}
			Node newNode = new Node(nodes[idx]); 
			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);
			return newNode;
		}  
		public static void preorder(Node root) {
			if(root == null) {
				System.out.print(-1+" ");
				return;
			}
			System.out.print(root.data+" ");
			preorder(root.left);
			preorder(root.right);
		}
		// Function to search 
		public static void search(Node root, int key, Node parent)
		{
			                                  // if the key is not present in the key
			if (root == null)   {
				System.out.print("Key not found");
				return;
			}
			                                  // if the key is found
			if (root.data == key)  {
				if (parent == null) {
					System.out.println("The node with key " + key + " is root node");
				}
				 if (key < parent.data)  {
					System.out.println("The given key is the left node of the node " +
							"with key " + parent.data);
				}
				else {
					System.out.println("The given key is the right node of the node " +
							"with key " + parent.data);
				}

				return;
			}
			// if the given key is less than the root node, recur for the left subtree;
			// otherwise, recur for the right subtree

			if (key < root.data) {
				search(root.left, key, root);
			}
			else {
				search(root.right, key, root);
			}
		}
	}
	public static void main(String args[]) {
		int nodes[] = {56, 30,22,11,3,-1,-1,16,-1,-1,-1,40,-1,
				-1,70,60,-1,65,62,-1,-1,67,-1,-1,95,-1,-1};
		BinaryTree tree = new BinaryTree();  
		Node root = tree.buildTree(nodes);
		tree.preorder(root);
		tree.search(root, 56, null);
	}
}
