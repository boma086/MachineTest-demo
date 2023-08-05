package Others;

class MyThread extends Thread 
{ 
    MyThread() {} 
    MyThread(Runnable r) {super(r); } 

} 
class RunnableDemo implements Runnable 
{

	@Override
	public void run() {
		System.out.print("Inside aaaa ");
		
	} 
} 
class ThreadDemo 
{  
    public static void main(String[] args) 
    { 
        new MyThread().start(); 
//        new MyThread(new RunnableDemo()).start(); 
    } 
} 