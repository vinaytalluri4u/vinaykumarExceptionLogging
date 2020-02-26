package cleancode.interest.constructioncost;

import static org.junit.Assert.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import cleancode.interest.constructioncost.Simpleinterest;

public class SimpleinterestTest {
	private static final Logger logger=LogManager.getLogger(SimpleinterestTest.class);
	@Test
	public void test() {
		Simpleinterest s=new Simpleinterest();
		assertEquals(Double.valueOf(200.0),s.calculate_simpleinterest(1000.0,5.0,4.0));
		logger.info("Simple interest is calculated");
		logger.debug(s.calculate_simpleinterest(1000.0,5.0,4.0));
		logger.warn("No warnings in Simple interest and calculated");
		logger.error("No errors in Simple interest and calculated");
		
	}

}
