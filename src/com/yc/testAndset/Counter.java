/**
 * 
 * @Author：yechong
 * @Time:26/3/2015
 * @Function:定义 Counter 的计数器
 * 
 */
package com.yc.testAndset;

public class Counter{
	 
	 private static int value;
	 TASlock taslock = new TASlock();
	 
	 public Counter (int value){		       
		 this.value = value;
	 }
	 
	 public int getValue(){
		 return value;
		 
	 }
	 
	 public int getAndIncrement(){
	     taslock.lock();
	     try{
	    	 int temp = value;
	    	    value = temp+1;   	 
	     }finally{
	    	 taslock.unlock(); 
	     }
		 return value;
		 
	 }
	 
}

