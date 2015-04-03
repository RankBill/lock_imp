/**
 * 
 * Function:继承TASlock 的接口，实现TASlock的类
 * 
 */
package com.yc.testAndset;

 public class TASlock implements Lock {

	 AtomicBoolean state=new AtomicBoolean(false);
	 
	@Override
	public void lock() {
		// TODO Auto-generated method stub
		while(state.getAndSet(true)){}
		
	}

	@Override
	public void unlock() {
		// TODO Auto-generated method stub
		
		state.set(false);
		
	}

  

}
 

 
 
 
