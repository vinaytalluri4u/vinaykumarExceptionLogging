package cleancode.interest.constructioncost;

import static org.junit.Assert.*;



import org.junit.Test;

import cleancode.interest.constructioncost.Simpleinterest;
import cleancode.interest.constructioncost.compoundinterest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class compoundinterestTest {

	private static final Logger logger=LogManager.getLogger(compoundinterestTest.class);
	
	@Test
	public void test() {
		
		compoundinterest c=new compoundinterest();
		assertEquals(Double.valueOf(216.65290240000013),c.calculate_compoundinterest(1000.0,5.0,4.0));
		
		logger.info("Compound interest is calculated");
		logger.debug(c.calculate_compoundinterest(1000.0,5.0,4.0));
		logger.warn("No warnings in Compound interest and calculated");
		logger.error("No errors in Compound interest and calculated");
	}

}
