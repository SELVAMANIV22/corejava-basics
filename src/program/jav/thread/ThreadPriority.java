package program.jav.thread;

public class ThreadPriority extends Thread{  
	 
	public void run(){  
	   System.out.println("running thread name is:"+Thread.currentThread().getName());  
	   System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  	  
	  }  
	
	 public static void main(String args[]){  
	  
	  ThreadPriority m1=new ThreadPriority();  
	  ThreadPriority m2=new ThreadPriority();  
	  
	  m1.setName("Abc");
	  m2.setName("XYZ");
	  
	  System.out.println("thread is alive for" + "name of thread" + m1.getName()+ "is alive"+ m1.isAlive());
	  System.out.println("thread state" +m1.getState());
	  System.out.println("thread is daemon thread" +m1.isDaemon());
	  System.out.println("thread hashcode" +m2.hashCode());
	   
	  m1.setPriority(Thread.MIN_PRIORITY);  
	  m2.setPriority(Thread.NORM_PRIORITY);  
	  
	  m1.start();  
	  m2.start();  
	   
	 }  
	}     
