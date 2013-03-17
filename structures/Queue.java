package structures;
/**
 * @title Queue
 * @author Anthony Wong
 * @date March 12 2013
 */
public class Queue {
	
	/**
	 * Front of the Queue
	 */
	Node front;
	/**
	 * Rear of the Queue
	 */
	Node rear;
	/**
	 * Size of the Queue
	 */
	int size;
	
	public Queue(){
		front = null, rear = null;
		size = 0; 
	}
	/*
	 * Adds the Node to the end of the Queue
	 * @param Node
	 */
	 
	public void enqueue(Node target){
		if(size == 0){
			front = target;
			rear = target;
		}else{
			rear.next = target;
			rear = rear.next;		
		}
		size++;
	}
	
	/**
	 * Deletes the Node at the front of the Queue
	 * @return Node
	 */
	public Node dequeue(){
		if(size != 0){
			Node temp = front;
			front = front.next;
			size--;
			return temp;	
		}else{
			return null;
		}
	}
	
	/**
	 * 
	 * @return Front of the Queue
	 */
	public Node peek(){
		return front;
	}
	
	/**
	 * 
	 * @return Last 
	 */
	public Node getLast(){
		return rear;
	}
	
	/**
	 * 
	 * @return The size of the Queue
	 */
	public int getSize(){
		return size;
	}
}
