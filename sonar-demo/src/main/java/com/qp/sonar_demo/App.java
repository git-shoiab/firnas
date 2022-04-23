package com.qp.sonar_demo;

import java.time.LocalDateTime;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public void met(int[] a) {
		a[0]=20;
	}
    public static void main( String[] args )
    {
        App obj=new App();
        int[] a= {10,20,30};
        obj.met(a);
        obj.met2(a);
        
        System.out.println(LocalDateTime.now());
        
    }
    public void met2(int[] b) {
    	b[0]=40;
    }
}
