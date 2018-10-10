package main.threadcheck;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/**
 * Here I am using executer and executer service to handle thread pool.
 * also ThreadPoolExecutor which give extra handling of threads execution.
 * @author m1017056
 *
 */
public class MultiThreadCall {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int nouberofThreads=2;
		int alowedThreads=4;
		long timeInMinlisencods=1000;
		
		
		BlockingQueue<Runnable> threads = new ArrayBlockingQueue<Runnable>(3);
		RejectedExecutionHandler rejectHandlerImpl = new MyRejectedExecutionHandler();
		Runnable myRunnable1 = new MyRuunable1();
		Runnable myRunnable2 = new MyRuunable1();
		Runnable myRunnable3 = new MyRuunable1();
		List<Runnable> threadsSet=new ArrayList<Runnable>();
		threadsSet.add(myRunnable1);
		threadsSet.add(myRunnable2);
		threadsSet.add(myRunnable3);
		threads.addAll(threadsSet);
		ThreadPoolExecutor threadPoolExecutor = 
			new ThreadPoolExecutor(nouberofThreads,alowedThreads,
					timeInMinlisencods,TimeUnit.MILLISECONDS,threads,Executors.defaultThreadFactory(),rejectHandlerImpl);
		/*ExecutorService executor = Executors.newFixedThreadPool(5);*/
		for(int i = 0 ;i <10; i++){
			
			threadPoolExecutor.execute(threads.poll());
		}
		/*executor.shutdown();*/
		threadPoolExecutor.shutdown();
		try {
			if(threadPoolExecutor.awaitTermination(5, TimeUnit.MINUTES))
			{
				System.out.println("completed all scuccessfully");
			}
			else{
				System.out.println("failed to complete all in given time");
				System.exit(0);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
