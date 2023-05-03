package data_structures;

import java.io.Serializable;

public class DoublyLinkedListElement {
	
	private Serializable data;
	private DoublyLinkedListElement predecessor;
	private DoublyLinkedListElement successor;

	public DoublyLinkedListElement(Serializable data,DoublyLinkedListElement predecessor, DoublyLinkedListElement successor ) {
		
		this.data = data;
		this.setPredecessor(predecessor);
		this.setSuccessor(successor);
		
	}

	public DoublyLinkedListElement getSuccessor() {
		return successor;
	}

	public void setSuccessor(DoublyLinkedListElement successor) {
		this.successor = successor;
	}

	public DoublyLinkedListElement getPredecessor() {
		return predecessor;
	}

	public void setPredecessor(DoublyLinkedListElement predecessor) {
		this.predecessor = predecessor;
	}

	public Serializable getData() {
		return data;
	}
	
	

}
