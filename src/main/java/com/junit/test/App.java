package com.junit.test;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	
    }
    
    public int add(int a , int b)
    {
    	return a+b;
    }
    
    public String checkString(String str)
    {
    	return str.toLowerCase();
    }
    
    public Boolean checkTrueFalse(int a , int b)
    {
    	return a > b;
    }
    
    public String checkSame(String a)
    {
    	return "Hello";
    }
    
    public List<String> checkLinesMatch()
    {
    	return List.of("A","b","c");
    }
    
    
    public Object checkNull(Object obj)
    {
    	if(obj != null)
    		return obj;
    	return null;
    }
}
