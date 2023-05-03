package data_structures;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DoublyLinkedList {
	
	private DoublyLinkedListElement first;
	private DoublyLinkedListElement last;

	public DoublyLinkedList() {
		// TODO Auto-generated constructor stub
	}

	public DoublyLinkedListElement getFirst() {
		return first;
	}

	public DoublyLinkedListElement getLast() {
		return last;
	}
	
	public void addElementAtBeginning(Serializable o) {
		
		if (first == null) {
			
			first = new DoublyLinkedListElement(o, null, null);
			last = first;
		}
		else {
			
			DoublyLinkedListElement current_first = first;
			DoublyLinkedListElement le = new DoublyLinkedListElement(o, null, current_first);
			first = le;
		}
			
		
	}
	
	public void addElementAtEnd(Serializable o) {
		
		if (last == null) {
			
			last = new DoublyLinkedListElement(o, null, null);
			first = last;
			
		}
		else {
			
			DoublyLinkedListElement current_last = last;
			DoublyLinkedListElement le = new DoublyLinkedListElement(o, current_last, null);
			last = le;
		}
		
			
		
	}
	
	public void loadList(String filename) throws ClassNotFoundException, IOException {
		
		clear();
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(filename);
			ois = new ObjectInputStream(fis);
			
			Serializable temp = (Serializable) ois.readObject() ;
			addElementAtBeginning(temp);
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
		catch (ClassNotFoundException ce) { ce.printStackTrace();}
		finally {
			try {
				ois.close();
			}
			catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}

		
	}
	
	public void writeList(String filename) throws IOException{
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(filename);
			oos = new ObjectOutputStream(fos);
			DoublyLinkedListElement current = first;
			while (current != null) {
				oos.writeObject(current.getData());
				current = current.getSuccessor();
			}
		}
		catch (IOException ioe) {ioe.printStackTrace();}
		
		finally {
			
			try {
				oos.close();
			}
			catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
		
	}
	
	
	public void clear() {
		first = null;
		last = null;
		
	}
	
	

}

