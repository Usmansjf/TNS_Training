package com.tns.day11;

public class ThreadDemo 
{

	public static void main(String[] args) 
	{
		
		ChildThread thread1 = new ChildThread(5,"First");
		ChildThread thread2 = new ChildThread(8,"Second");
		System.out.println("Current thread "+Thread.currentThread());
		thread1.start();
		thread2.start();
		Thread.currentThread().setName("Parent thread");
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		System.out.println("Current thread "+Thread.currentThread());
		
		try 
		{
			thread1.join();
			thread2.join(30);
		}
		catch(InterruptedException e) 
		{
			System.out.println("Thread is interrupted"+e.getMessage());
		}
		System.out.println("End of main");
	}

}
