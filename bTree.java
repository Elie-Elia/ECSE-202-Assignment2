

public class bTree {
	//root is an object of the class listNode
	//left and right are objects of the class bTree
	listNode root;
	bTree left;
	bTree right;
	//Add node to the bTree
	public void addNode(String given_value)
	{
		//if the root is equal to null
		if (root == null)
		{
			//a new root is created
			root = new listNode(given_value);
			//new nodes are assigned to the left and right references
			left = new bTree();
			right = new bTree();
			//compare the given value to the root value
		}else if(given_value.compareTo(root.value) < 0)
			//if the value is smaller, add the value along the left branch
			left.addNode(given_value);
		else
			//if the value is larger, add the value along the right branch
			right.addNode(given_value);
	}
	public void traverse_tree()
	{
		//if the left root is not null
		if(left.root != null)
			//traverse the left branch of the binary tree
			left.traverse_tree();
		//output the root value
		System.out.println(root.value);

		//if the right root is not null
		if(right.root != null)
			//traverse the right branch of the binary tree
			right.traverse_tree();
	}

	public void reverse_traverse() {
		//creates a new empty stack
		Stack st = new Stack();
		//add the content of the binary tree to the stack
		addToStack(st , this);
		//as long as the top of the stack is not null
		while(st.top != null)
		//print the pop value
			System.out.println(st.pop().value);
	}

	public void addToStack(Stack st, bTree tree) {
		//if the left branch of the binary tree is not null
		if(tree.left.root != null)
		//add the content of the left branch to the stack
			addToStack(st,tree.left);
		//push the root value
		st.push(tree.root.value);
		//if the right branch of the binary tree is not null
		if(tree.right.root != null)
		//add the content of the right branch to the stack
			addToStack(st,tree.right);

	}


}
