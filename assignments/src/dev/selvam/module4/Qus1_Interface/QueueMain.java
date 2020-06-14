package dev.selvam.module4.Qus1_Interface;

public class QueueMain {

	public static void main(String[] args) {
		QueueInterface myque = new Queue(6);
		
		myque.insert(1);
		myque.insert(2);
		myque.insert(3);
		myque.insert(4);
		myque.insert(5);
		myque.insert(14);
		myque.insert(15);
		myque.insert(24);
		myque.insert(25);
		myque.delete();
		myque.delete();
		myque.delete();
		myque.delete();
		myque.delete();
		myque.delete();
		myque.delete();
		myque.delete();
		myque.display();

	}

}
