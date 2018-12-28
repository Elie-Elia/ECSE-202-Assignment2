
public class Stack {
	listNode top;

	public void push(String given_value)
	{
		//creating a new node to store the pushed value
		listNode newNode = new listNode(given_value);
		//make the new node reference the current top
		newNode.nextNode = top;
		//top now references the new node
		top= newNode;
	}
	public listNode pop()
	{
		//if the top is not null
		if(top != null)
		{
			
			listNode oldTop = top;
			//top references the next node
			top = top.nextNode;
			//return the previous node
			return oldTop;
		}else {
			return null;
		}
	}
}
