package com.example.app;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class AppTest{
@Test
public void testgreet(){
	String result=App.greet("Student");
	assertEquals("Hello, Student! Welcome to CI/CD Demo",result);
}
}
