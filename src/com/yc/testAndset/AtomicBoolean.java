/**
 * 
 * @Author��yechong
 * @Function:���� ԭ�Ӳ����� ��
 * 
 */

package com.yc.testAndset;

public class AtomicBoolean {
	boolean value;
	
	public AtomicBoolean(boolean value){
		this.value=value;
		
	}
	public synchronized boolean getAndSet(boolean newValue){  //�����е�synchronized��ʵ����Ȼ�õ�java�Ŀ�

		boolean prior=value;
		value=newValue;
		return prior;
		
	}
	public void set(boolean value){
		
		this.value=value;
	}
}
