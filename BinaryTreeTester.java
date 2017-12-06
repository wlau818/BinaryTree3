/**
 * This is a tester program for the BinaryTree class
 * @author Michael Ida
 *
 */
public class BinaryTreeTester {
	
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		int[] inputData = {20, 15, 200, 25, -5, 0, 100, 20, 12, 126, 1000, -150};
		
		for (int elem : inputData) {
			tree.insert(elem);
		}
		System.out.println("Tree 1");
		System.out.println("In-Order Traversal");
		tree.inOrder();
		System.out.println("\n\n");
		// should be: -150, -5, 0, 12, 15, 20, 20, 25, 100, 126, 200, 1000
		
		System.out.println("Pre-Order Traversal");
		tree.preOrder();
		System.out.println("\n\n");
		// should be: 20, 15, -5, -150, 0, 12, 200, 25, 20, 100, 126, 1000
		
		System.out.println("Post-Order Traversal");
		tree.postOrder();
		System.out.println("\n\n");
		// should be: -150, 12, 0, -5, 15, 20, 126, 100, 25, 1000, 200, 20
		
		System.out.println("Size: " + tree.size());
		// should be: 12
		
		System.out.println("Maximum Depth: " + tree.maxDepth());
		//should be: 5
		
		System.out.println("Minimum Depth: " + tree.minDepth());
		// should be: 2
		
		System.out.println("Number of times 20 appears: " + tree.countMatches(20));
		
		System.out.println("Max Number: " + tree.maxRecord());
		
		System.out.println("Min Number: " + tree.minRecord());
		
		System.out.println("");
		tree.removeNode(1000);
		System.out.println("Removed number 1000:");
		tree.inOrder();
		System.out.println("\n\n");
		// should be: -150 -5 0 12 15 20 20 25 100 126 200 
		
		
		BinaryTree tree1 = new BinaryTree();
		int[] input = {34, 12, 85, 15, 92, 1, 543, 23, 41, 4, 2, 41, 2};
		
		for (int elem : input) {
			tree1.insert(elem);
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Tree 2");
		System.out.println("In-Order Traversal");
		tree1.inOrder();
		System.out.println("\n\n");
		// should be: 1 2 2 4 12 15 23 34 41 41 85 92 543
		
		System.out.println("Pre-Order Traversal");
		tree1.preOrder();
		System.out.println("\n\n");
		// should be: 34 12 1 4 2 2 15 23 85 41 41 92 543 
		
		System.out.println("Post-Order Traversal");
		tree1.postOrder();
		System.out.println("\n\n");
		// should be: 2 2 4 1 23 15 12 41 41 543 92 85 34 
		
		System.out.println("Size: " + tree1.size());
		// should be: 13
		
		System.out.println("Maximum Depth: " + tree1.maxDepth());
		//should be: 6
		
		System.out.println("Minimum Depth: " + tree1.minDepth());
		// should be: 3
		
		System.out.println("Number of times 2 appears: " + tree1.countMatches(2));
		// should be: 2
		
		System.out.println("Max Number: " + tree1.maxRecord());
		// should be 543
		
		System.out.println("Min Number: " + tree1.minRecord());
		// should be: 1
		System.out.println("");
		
		tree1.removeNode(4);
		System.out.println("Removed number 4:");
		tree1.inOrder();
		System.out.println("\n\n");
		// should be: 1 2 2 12 15 23 34 41 41 85 92 543 

	}

}
