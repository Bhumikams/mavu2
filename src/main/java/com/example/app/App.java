package com.example.app;

/**
 * Hello world!
 *
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.commons.lang3.StringUtils;

public class App 
{
private static final Logger logger=LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {
	String name="CI/CD pipeline";
	if (StringUtils.isNotBlank(name)){
		String message=greet(name);
		logger.info(message);
		System.out.println(message);
    }
	else{
		logger.error("empty name");
}
}
    public static String greet(String name){
	return "Hello, "+name+"! Welcome to CI/CD Demo";

}
}

