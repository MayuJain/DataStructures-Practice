package BinaryTree;
import java.util.*;

public class LevelOrderTraversal {

	List<List<Integer>> result = new ArrayList<List<Integer>>();

	public List<List<Integer>> levelOrder(TreeNode root) {
	    
	    Queue<TreeNode> q = new LinkedList<TreeNode>();
	   
	    q.offer(root);
	    
	    while(!q.isEmpty()) {
	    	
	    	 List<Integer> level = new ArrayList<Integer>();
	 	    
	    	 int size = q.size();
	 	    for(int i=0;i<size;i++) {
	 	    	 TreeNode x = q.peek();
	 	    	 
	 	    	 if(x.left != null) {
	 	    		 q.offer(x.left);
	 	    	 }
	 	    	 if(x.right != null) {
	 	    		 q.offer(x.right);
	 	    	 }
	 	    	
	 	    	level.add(x.val);
	 	    	q.poll();
	 	    }
	 	    
	 	    result.add(level);
	 	    
	    }
	    
		return result;
	    
	
	}
	
	public static void main(String args[]) {
    	
		LevelOrderTraversal lt = new LevelOrderTraversal();
    	TreeNode x=new TreeNode(1);
    	x.left = new TreeNode(9);
    	x.right = new TreeNode(20);
    	x.right.left = new TreeNode(15);
    	x.right.right = new TreeNode(7);
    	
    	List<List<Integer>> levelorderTraversalMethod = lt.levelOrder(x);
    	
    	System.out.println(levelorderTraversalMethod);
    }
 
	
}
