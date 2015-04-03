/**
 * 
 * @Author：yechong
 * @Function:定义 创建抽象线程
 * 
 */

package com.yc.testAndset;

import java.util.List;

class ThreadToal implements Runnable{

	private Counter counter;
	private  int id;
	private List<Integer> values;
	private TASlock lock;
	ThreadID tid=new ThreadID();
	int n=0;
	  public ThreadToal(Counter counter, int id, List<Integer> values, TASlock lock) {
	        this.counter = counter;
	        this.id = id;
	        this.values = values;
	        this.lock = lock;
	    }
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	       	
		while(true){
			tid.set(id);
			lock.lock();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try{
				
             System.out.print(" Thread "+id+" get lock");
             
			if(n<100){
				
			n=counter.getAndIncrement();
			values.add(n);
			System.out.println("  counter:"+counter.getValue());
			}else{
				return;}
			}finally{
			lock.unlock();
			System.out.println(" Thread "+id+" unlock ");
			
			}
		}
		
	}

	
	
}
