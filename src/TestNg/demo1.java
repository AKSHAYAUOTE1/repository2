package TestNg;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class demo1 {
	@Test
public void test1() {
	System.out.println("tc1 running");
	Assert.fail();
}
	@Test
public void test2() {
	System.out.println("tc2 running");
}
	@Test
public void test3() {
	System.out.println("tc3 running");
}
	
}
