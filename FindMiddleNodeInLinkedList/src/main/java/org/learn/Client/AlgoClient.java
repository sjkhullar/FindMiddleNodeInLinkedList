package org.learn.Client;

import org.learn.List.Node;
import org.learn.Question.FindMiddleNode;

public class AlgoClient {
	public static void main(String[] args) {
		int[] data = { 1, 2, 3, 4, 5 };
		Node head = new Node(data[0]);

		for (int count = 1; count < data.length; count++)
			FindMiddleNode.insert(head, data[count]);

		System.out.printf("1.) Single linked list is : ");

		FindMiddleNode.print(head);
		Node middle = FindMiddleNode.findMiddleNode(head);
		if (null != middle) {
			System.out.printf("2.) Middle node is at position : %d", middle.data);
		}
	}
}
