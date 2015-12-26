package org.learn.Client;

import org.learn.List.Node;
import org.learn.Question.FindMiddleNode;

public class App 
{
	public static void main( String[] args )
    {
		int[] data = {1, 2, 3, 4, 5};
		Node head = new Node(data[0]);
		for(int count = 1; count < data.length; count++)
			FindMiddleNode.insert(head,data[count]);
		System.out.printf("Linked list is : ");
		FindMiddleNode.print(head);
		Node middle = FindMiddleNode.findMiddleNode(head);
		if(null != middle) {
			System.out.printf("Middle node is at : %d",middle.data);
		}
    }
}
