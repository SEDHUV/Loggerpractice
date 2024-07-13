package basicconfigurator;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;


public class log4jxmlconfigurator {
	
	
	 static Logger logger = Logger.getLogger(log4jxmlconfigurator.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DOMConfigurator.configure("log4j.xml");
		logger.info("info message");
		logger.debug("debug message");
		logger.error("error message");
		logger.warn("warning message");
		logger.fatal("fatal message");
		System.out.println("completed");

	}

}
