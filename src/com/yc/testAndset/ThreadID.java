/**
 * 
 * @Author：yechong
 * @Function:定义 ThreadID 获得当前的线程号
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
