package operr;

public class Demo {
	public static void main(String[] args) {

		Node head = new Node(1);

		SinglyLinkedList list = new SinglyLinkedList(head);

		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(1);
		Node node5 = new Node(4);
		Node node6 = new Node(5);

		// Test append method
		list.append(node2);
		list.append(node3);
		list.append(node4);
		list.append(node5);
		list.append(node6);
		
		System.out.println("Original list after append:");
		list.printNodes();

		// Test remove tail
		list.removeTail();
		
		System.out.println("After remove tail:");
		list.printNodes();
		
		// Test remove elements greater than 2
		list.removeNodes(2);
		
		System.out.println("After remove all elements greater than 2:");
		list.printNodes();
		
		// Test remove elements greater than 1
		list.removeNodes(1);
		
		System.out.println("After remove all elements greater than 1:");
		list.printNodes();

	}
}
