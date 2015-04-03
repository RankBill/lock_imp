
/**
 * 
 * @Author：yechong
 * @Time:26/3/2015
 * @Function:作为TAS_Test lock的测试类
 * 
 */
package com.yc.testAndset;
import java.util.ArrayList;
import java.util.List;

public class TAS_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter counter = new Counter(1);
		Thread[] th = new Thread[2];
		List<Integer> values = new ArrayList<Integer>();
		TASlock taslock = new TASlock();
        long start=System.currentTimeMillis();
		for (int i = 0; i < th.length; ++i) {
			th[i] = new Thread(new ThreadToal(counter, i, values, taslock));
			th[i].start();
		}
		for (int i = 0; i < th.length; ++i) {
			try {
				th[i].join();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();// don't expect it but good
				// practice to handle anyway
			}
			System.out.println(values.size());
		}
		 long end=System.currentTimeMillis();
		 System.out.print("During Time:"+(end-start));
	}
}
