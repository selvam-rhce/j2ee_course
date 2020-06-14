package dev.selvam.module4.Qus4_Threads;

public class Demo_Threads {
	
	


	public static void main(String[] args) throws InterruptedException {
		table mytable = new table(5);
		Thread tablethread = new Thread(mytable);
		System.out.println("####### Printing table ###########");
		tablethread.start();
		
		System.out.println("######## printing even number #######");
		for (int num=2;num<=40;num+=2) {
			System.out.println(num);
		}
		

	}

}
class table implements Runnable{
	
	int tablenum;
	
	public table(int tablenum) {
		super();
		this.tablenum = tablenum;
	}

	public void printTable() {
		int tableLength = 10;
		for ( int iter=1;iter<=tableLength;iter++) {
			System.out.println(tablenum+" X "+iter+" = "+tablenum*iter);
		}
		
	
	}

	@Override
	public void run() {
		printTable();
	}
}