package kr.human;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogTest {
	
	static Logger logger = Logger.getLogger(LogTest.class);
	
	public static void main(String[] args) {
		
		//logger.setLevel(Level.ERROR);
		
		log.info("하하하하 --- info");
		log.debug("하하하하 --- debug");
		log.warn("하하하하 --- warn");
		log.error("하하하하 --- error");
		log.trace("하하하하 --- trace");
		
		logger.info("하하하하 --- info");
		logger.debug("하하하하 --- debug");
		logger.warn("하하하하 --- warn");
		logger.error("하하하하 --- error");
		logger.trace("하하하하 --- trace");
	}
}
