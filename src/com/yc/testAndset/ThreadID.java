/**
 * 
 * @Author��yechong
 * @Function:���� ThreadID ��õ�ǰ���̺߳�
 * 
 */

package com.yc.testAndset;

public class ThreadID {

	private static int id;

	public void set(int id) {
		this.id = id;
	}
	
	public static int get() {
		return id;
	}

}
