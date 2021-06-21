package com.bridgelabz.generics;
import org.junit.Assert;
import org.junit.Before;

public class MaxTest {

	Max maximum;
	 @Before
	    public void setup() {
	        maximum = new Max();
	    }
	    @org.junit.Test
	    public void Given_Max_Number_at_1st_Position_return_the_Same_Number() {
	        Integer maxResult=maximum.checkMax(50,40,30);
	        Integer result=50;
	        Assert.assertEquals(result,maxResult);
	    }
	    @org.junit.Test
	    public void Given_Max_Number_at_2nd_Position_return_the_Same_Number(){
	        Integer maxResult=maximum.checkMax(40,50,30);
	        Integer result=50;
	        Assert.assertEquals(result,maxResult);
	    }
	    @org.junit.Test
	    public void Given_Max_Number_at_3rd_Position_return_the_Same_Number() {
	        Integer maxResult=maximum.checkMax(20,30,40);
	        Integer result=40;
	        Assert.assertEquals(result,maxResult);
	    }
	
}
