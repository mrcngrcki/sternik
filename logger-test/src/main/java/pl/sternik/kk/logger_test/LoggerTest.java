package pl.sternik.kk.logger_test;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class LoggerTest {

	private static final Logger Log = Logger.getLogger("LoggerTest");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BasicConfigurator.configure();

		Log.setLevel(Level.INFO);
		Log.fatal("Pora�ka na ca�ego");
		Log.error("EEE");
		Log.warn("warning!");
		Log.info("ssss");
		String dd="ppp";
		
		if(Log.isDebugEnabled()){
		Log.debug("debug" + dd.length());
		}
		Log.trace("sss");
	}

}
