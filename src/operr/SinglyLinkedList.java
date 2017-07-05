package operr;

public class SinglyLinkedList {
	private Node head = null;

	public SinglyLinkedList() {
		head = null;
	}

	public SinglyLinkedList(Node head) {
		this.head = head;
	}

	/**
	 * Append a node to the end of the list
	 * 
	 * @param Node The node to be appended
	 */
	public void append(Node node) {
		Node tail = getTail();

		tail.next = node;

		// Node.next should be already null but
		// we should set to null to be safe
		node.next = null;

	}

	/**
	 * Get the tail node
	 * @return Node The tail node
	 */
	public Node getTail() {
		Node tail = this.head;

		if (tail == null) {
			return null;
		}

		while (tail.next != null) {

			tail = tail.next;

		}

		return tail;
	}

	/**
	 * Remove tail node from the list
	 */
	public void removeTail() {
		Node head = this.head;

		if (head == null) {
			return;
		}

		Node headNext = head.next;

		if (headNext == null) {
			this.head = null;
			return;
		}

		while (headNext.next != null) {

			head = headNext;
			headNext = headNext.next;

		}

		// Remove headNext by setting head.next = null
		head.next = null;

	}

	/**
	 * Remove all nodes whose values are greater than target
	 * 
	 * @param target Target number compared to node's value
	 */
	public void removeNodes(int target) {
		Node current = this.head;

		if (current == null) {
			return;
		}

		Node afterCurrent = current.next;

		if (afterCurrent == null) {
			
			if (current.data > target) {
				this.head = null;
			}
			
			return;
		}

		while (afterCurrent != null) {

			if (afterCurrent.data > target) {
				current.next = afterCurrent.next;
				
				if (afterCurrent.next != null) {
					afterCurrent = afterCurrent.next;
				} else {
					afterCurrent = null;
				}
				
			} else {
				current = afterCurrent;
				afterCurrent = afterCurrent.next;
			}

		}

	}

	/**
	 * Print all nodes
	 */
	public void printNodes() {

		Node head = this.head;

		if (head == null) {
			System.out.println("None");
		}

		while (head != null) {
			System.out.print(head.data + " -> ");

			head = head.next;

		}

		System.out.println();
	}
}
