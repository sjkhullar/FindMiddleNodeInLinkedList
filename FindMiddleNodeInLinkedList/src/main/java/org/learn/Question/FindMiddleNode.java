package org.learn.Question;

import org.learn.List.Node;

public class FindMiddleNode {
	public static Node findMiddleNode(Node head) {
		if (null == head) {
			System.out.println("Single linked list is empty");
			return null;
		}
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public static void insert(Node head, int data) {
		while (head.next != null)
			head = head.next;
		head.next = new Node(data);
	}

	public static void print(Node head) {
		while (head != null) {
			System.out.printf("%d ", head.data);
			head = head.next;
		}
		System.out.println("");
	}
}
