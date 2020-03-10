package testDay1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testcase1 {
	
	private static Logger log =LogManager.getLogger(Testcase1.class.getName());
	  
	@Test
	public  void Demo() 
	{
		// TODO Auto-generated method stub
		log.info("Hello");
		log.info("Testin1");
		log.debug("I am debugging");
		log.info("object is found");		
		log.error("object is not found" );	
		log.fatal("this is fatal");

	}

	
	@Test
	public  void secondtest() 
	{
		// TODO Auto-generated method stub
		System.out.println("Second Test");


	}

	
}
