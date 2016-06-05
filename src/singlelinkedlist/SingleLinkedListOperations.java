package singlelinkedlist;

public class SingleLinkedListOperations {

	Node head = null;
	Node tail = null;

	public void insertNode(Node node) {
		if (head == null) {
			head = node;
		} else {
			node.setNext(head);
			head = node;
		}
	}

	public void printAllNodes() {
		while (head != null && head.getData() != null) {
			System.out.println(head.getData() + ", ");
			head = head.getNext();

		}
	}

	public static void main(String[] args) {
		SingleLinkedListOperations linkedList = new SingleLinkedListOperations();
		Node firstNode = new Node("srinu");
		Node secondNode = new Node("ravi");
		Node thirdNode = new Node("kalpana");
		Node fourthNode = new Node("surya");

		linkedList.insertNode(firstNode);
		linkedList.insertNode(secondNode);
		linkedList.insertNode(thirdNode);
		linkedList.insertNode(fourthNode);

		linkedList.printAllNodes();

		System.out.println("*******************************");
		linkedList.printAllNodes();
	}

}
