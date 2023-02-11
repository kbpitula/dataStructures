package nodeList;

public class LinkedList {
	private Node head = new Node(null);
	private int size;
	
	public LinkedList() {
		clear();
	}
	
	public void clear() {
		size=0;
		head.setNext(null);
	}
	
	public void add(Object o) {
		if(head.getNext() == null) {
			head.setNext(new Node(o));
			size++;
		} else {
			Node last = head.getNext();
			while(last.getNext() != null) {
				last = head.getNext();
			}
			size++;
			last.setNext(new Node(o));
		}
	}
	
	public boolean delete(Object o) {
		if(size == 0 || head.getNext() == null) {
			return false;
		}
		Node find = head.getNext();
		for(int i=0; i<= size; i++) {
			find = head.getNext();
			if (find.getValue().equals(o)) {
				head.setNext(head.getNext().getNext());
				size--;
				return true;
			}
		}
		return false;
	}
	
	public Object get(int index) throws IndexOutOfBoundsException {
		if(index<0 || index> size) throw new IndexOutOfBoundsException();
		Node find = head.getNext();
		for(int i=0; i <= index; i++) {
			find = find.getNext();
		}
		return find.getValue();
	}
	
	public void set(int index, Object value) throws IndexOutOfBoundsException {
		if(index<0 || index> size) throw new IndexOutOfBoundsException();
		Node find = head.getNext();
		for(int i=0; i <= index; i++) {
			find = find.getNext();
		}
		find.setValue(value);
	}
	
	public int size() { 
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
}
