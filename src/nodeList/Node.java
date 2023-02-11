package nodeList;

public class Node {
	private Object value;
	private Node next;
	
	public Node(Object val) {
		this(val, null);
	}
	
	public Node(Object val, Node n) {
		value = val;
		next = n;
	}
	
	public Object getValue() {
		return value;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node n) {
		next = n;
	}
	
	public void setValue(Object o) {
		value = o;
	}
}
