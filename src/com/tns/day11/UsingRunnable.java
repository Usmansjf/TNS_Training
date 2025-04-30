package com.tns.day11;

public class UsingRunnable implements Runnable
{
	
	Thread thread;
	int high,low;
	String msg;
	public UsingRunnable(int low, int high, String msg) 
	{		
		thread = new Thread(this,"child Thread");
		this.high = high;
		this.low = low;
		this.msg = msg;
	}
	
	public void run() 
	{
		for(int i=low;i<=high;i++) 
		{
			try 
			{
				Thread.sleep(400);
			}
			catch(InterruptedException e) 
			{
				System.out.println("Erro "+e.getMessage());
			}
			System.out.println(msg+i);
		}
	}
}
