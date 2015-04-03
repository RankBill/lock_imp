/**
 * 
 * @Author：yechong
 * @Function:定义 原子布尔型 ，
 * 
 */

package com.yc.testAndset;

public class AtomicBoolean {
	boolean value;
	
	public AtomicBoolean(boolean value){
		this.value=value;
		
	}
	public synchronized boolean getAndSet(boolean newValue){  //但其中的synchronized的实现仍然用到java的库

		boolean prior=value;
		value=newValue;
		return prior;
		
	}
	public void set(boolean value){
		
		this.value=value;
	}
}
