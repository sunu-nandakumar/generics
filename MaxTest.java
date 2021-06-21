package com.bridgelabz.generics;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxTest {

	Max maximum;
	 @Before
	    public void checkTest() {
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
	
	    @Test
	    public void Given_Max_Float_at_1st_Position_return_the_Same_Float() {
	        Float maxResult=maximum.checkMax(55.5f,45.5f,35.5f);
	        Float result=55.5f;
	        Assert.assertEquals(result,maxResult);
	    }

	    @Test
	    public void Given_Max_Float_at_2nd_Position_return_the_Same_Float() {
	        Float maxResult=maximum.checkMax(45.5f,55.5f,35.5f);
	        Float result=55.5f;
	        Assert.assertEquals(result,maxResult);
	    }
	    @Test
	    public void Given_Max_Float_at_3rd_Position_return_the_Same_Float(){
	        Float maxResult=maximum.checkMax(45.5f,35.5f,55.5f);
	        Float result=55.5f;
	        Assert.assertEquals(result,maxResult);
	    }
	    @Test
	    public void Given_Max_String_at_1st_Position_return_the_Same_String() {
	        String maximumResult=maximum.checkMax("sonet", "seltos", "nexon");
	        Assert.assertEquals("sonet",maximumResult);
	    }
	    @Test
	    public void Given_Max_String_at_2nd_Position_return_the_Same_String() {
	        String maximumResult=maximum.checkMax("sonet", "seltos", "nexon");
	        Assert.assertEquals("seltos",maximumResult);
	    }

	    @Test
	    public void Given_Max_String_at_3rd_Position_return_the_Same_String() {
	        String maximumResult = maximum.checkMax("sonet", "seltos", "nexon");
	        Assert.assertEquals("nexon", maximumResult);
	    }
}
