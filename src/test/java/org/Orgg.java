package org;

import org.testng.annotations.Test;

public class Orgg {
     @Test(groups="smoke")
     public void test() {
    	 String browser=System.getProperty("browser");
    	 String url=System.getProperty("url");
    	 System.out.println(browser+ "  :  "+url+"     smoke testing");
    	 
    	 System.out.println("smoke");
     }
     
     
     @Test(groups="regression")
     public void test1() {
    	 
    	 String browser=System.getProperty("browser");
    	 String url=System.getProperty("url");
    	 System.out.println(browser+ "  :  "+url+"     regression testing");
    	 System.out.println("regression");
     }
}
