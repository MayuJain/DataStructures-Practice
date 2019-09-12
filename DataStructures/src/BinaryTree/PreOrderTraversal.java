package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import BinaryTree.TreeNode;

public class PreOrderTraversal {
	
	List<Integer> result = new ArrayList<Integer>();

		private List<Integer> preorderTraversalMethod(TreeNode root) { 
		       
			 System.out.println(root.val);
			 	result.add(root.val);
		       if(root.left!=null){ 
		    	   preorderTraversalMethod(root.left);
		       }
		       if(root.right!=null) {
		    	   preorderTraversalMethod(root.right);
		       }
		       return result;
		}
	    
		
		 
	    public static void main(String args[]) {
	    	
	    	PreOrderTraversal ps = new PreOrderTraversal();
	    	TreeNode x=new TreeNode(1);
	    	x.right = new TreeNode(2);
	    	x.right.left = new TreeNode(3);
	    	
	    	List<Integer> preorderTraversalMethod = ps.preorderTraversalMethod(x);
	    	
	    	System.out.println(preorderTraversalMethod);
	    }
	 
}


 
