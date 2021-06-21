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
	        String maxResult=maximum.checkMax("sonet", "seltos", "nexon");
	        Assert.assertEquals("sonet",maxResult);
	    }
	    @Test
	    public void Given_Max_String_at_2nd_Position_return_the_Same_String() {
	        String maxResult=maximum.checkMax("sonet", "seltos", "nexon");
	        Assert.assertEquals("seltos",maxResult);
	    }

	    @Test
	    public void Given_Max_String_at_3rd_Position_return_the_Same_String() {
	        String maxResult = maximum.checkMax("sonet", "seltos", "nexon");
	        Assert.assertEquals("nexon", maxResult);
	    }@Test
	    public void givenInteger_ShouldReturnMaximumInteger() {
	        Comparable maxResult=maximum.checkMax(10,20,30);
	        Assert.assertEquals(30,maxResult);
	    }
	    @Test
	    public void givenFloat_UsingGenericClass_ShouldReturnMaximumFloat() {
	        Comparable maxResult=maximum.checkMax(25.1,85.1,3.3);
	        Assert.assertEquals(85.1,maxResult);
	    }
	    @Test
	    public void givenString_UsingGenericClass_ShouldReturnMaximumString(){
	        Comparable maxResult=maximum.checkMax("sonet", "seltos", "nexon");
	        Assert.assertEquals("seltos",maxResult);
	    }
	    @Test
	    public void givenNIntegers_UsingMoreThanThreeParameters_ShouldReturnMaximumInteger() {
	        Integer maxResult=maximum.checkMax_With_MoreThan_ThreeParameters(1,2,3,4,5,6);
	        Integer result=6;
	        Assert.assertEquals(result,maxResult);
	    }
	    @Test
	    public void givenNFloats_UsingMoreThanThreeParameters_ShouldReturnMaximumFloat(){
	        Float maxResult=maximum.checkMax_With_MoreThan_ThreeParameters(1.1f,2.2f,3.3f,4.4f,5.5f);
	        Float result=5.5f;
	        Assert.assertEquals(result,maxResult);
	    }
	    @Test
	    public void givenNStrings_UsingMoreThanThreeParameters_ShouldReturnMaximumString(){
	        String maxResult=maximum.checkMax_With_MoreThan_ThreeParameters("Dog","Cat","Ant","Tiger");
	        Assert.assertEquals("Tiger",maxResult);
	    }

}
