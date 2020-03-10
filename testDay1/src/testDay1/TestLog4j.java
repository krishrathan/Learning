package testDay1;


import org.apache.logging.log4j.*;

public class TestLog4j {

	private static Logger log =LogManager.getLogger(TestLog4j.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.debug("I am debugging");
			log.info("object is found");
			
		log.error("object is not found" );
		
		
		log.fatal("this is fatal");
		
	}

}
