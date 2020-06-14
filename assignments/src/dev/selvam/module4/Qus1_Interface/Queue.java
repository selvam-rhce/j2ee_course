package dev.selvam.module4.Qus1_Interface;

public class Queue implements QueueInterface {

	int front;
	int rear;
	int capacity;
	int[] QueueArray;
	
	

	public Queue(int capacity) {
		super();
		this.capacity = capacity;
		QueueArray = new int[capacity];
		front = 0;
		rear = 0;
	}

	@Override
	public void insert(int number) {
		if ( rear == capacity ) {
			System.out.println("Queue is full!!!");
		}
		else {
			QueueArray[rear] = number;
			rear++;
			System.out.println("Inserted "+number+" to queue");
		}
	}

	@Override
	public void delete() {
		
		if ( front == rear ) {
			System.out.println("Queue already empty.");
		}
		else {
			System.out.println("Removing "+QueueArray[0]+" from queue");
			for ( int indexnum = 0; indexnum < rear-1;indexnum++) {
				QueueArray[indexnum] = QueueArray[indexnum+1];
			}
			if ( rear-1 < capacity ) {
				QueueArray[rear-1] = 0;
			}
			rear--;
			
		}
		
		
	}

	@Override
	public void display() {
		System.out.println("############ Queue ###########");
		for (int queuenum : QueueArray) {
			System.out.println(queuenum);
		}
		
	}

}
