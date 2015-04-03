/**
 * 
 * Function:�̳�TASlock �Ľӿڣ�ʵ��TASlock����
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
 

 
 
 
