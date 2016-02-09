package by.marketplace.util;

import java.util.Iterator;
/**
 * <p>Just the usual FIFO queue</p>
 * Primary usage is for handling transactions
 * 
 * @author A.Lagunov
 *
 * @param <T> must implement Comparable
 */
public class Queue<T extends Comparable<T>> implements Iterable<T>{
	public static void main(String[] args) {
		Queue<String> q = new Queue<String>();
		q.enqueue("A");
		q.enqueue("B");
		q.enqueue("C");
		q.enqueue("D");
		q.enqueue("E");
		q.enqueue("F");
		q.enqueue("G");
		Iterator iter = q.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	
	private Node last;
	
	private Node first;
	
	public Queue() {
		first = new Node();
		last = first;
	}

	private class Node {
		private T element;
		private Node prev;
	}
	
	/**
	 * To avoid unexpected errors it's better to deny enqueuing of null elements
	 * @param element
	 * @throws NullPointerException
	 */
	
	public void enqueue(T element) throws NullPointerException{
		if (element==null) throw new NullPointerException("Cannot enqueue null value");
		Node oldFirst = first;
		first = new Node();
		first.element = element;
		oldFirst.prev = first;
		
	}
	
	public T dequeue() {
		if (last.prev.element!=null) {
			last = last.prev;
			return last.element;
		} else {
			return null;
		}
	}
	
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("[");
		for (T elem:this) {
			result.append(elem.toString()+", ");
		}
		result.append("]");
		return result.toString();
	}
	
	@Override
	public Iterator<T> iterator() {
		return new Iter();
	}
	
	class Iter implements Iterator<T>{
		
		private Node pointer;
		
		public Iter() {
			this.pointer = last;
		}
		
		@Override
		public boolean hasNext() {
			return pointer.prev!=null;
		}

		@Override
		public T next() {
			if (pointer.prev.element!=null) {
				pointer= pointer.prev;
				return pointer.element;
			} else {
				return null;
			}
		}
		
	}
	
}
