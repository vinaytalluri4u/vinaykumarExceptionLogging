package cleancode.interest.constructioncost;

import static org.junit.Assert.*;

import org.junit.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import cleancode.interest.constructioncost.GenerateBill;

public class GenerateBillTest {
	private static final Logger logger=LogManager.getLogger(GenerateBill.class);
	@Test
	public void testCost() {
		GenerateBill test= new GenerateBill();
		assertEquals(3600.00,test.totalcost("standard material", 3),0);
		logger.info("House construction with Standard material is calculated");
		logger.debug(test.totalcost("standard material", 3));
		logger.warn("No warnings in calculating the standard matrial house construction cost");
		logger.error("No errors in calculating the standard matrial house construction cost");

	}
	@Test
	public void testCost1() {
		GenerateBill test= new GenerateBill();
		assertEquals(6000.00,test.totalcost("Abovestandard material", 4),0);
		logger.info("House construction with Above Standard material is calculated");
		logger.debug(test.totalcost("Abovestandard material", 4));
		logger.warn("No warnings in calculating the Above standard matrial house construction cost");
		logger.error("No errors in calculating the Above standard matrial house construction cost");
	}
	@Test
	public void testCost2() {
		GenerateBill test= new GenerateBill();
		assertEquals(3600.00,test.totalcost("Highstandard material", 2),0);
		logger.info("House construction with Highstandard material is calculated");
		logger.debug(test.totalcost("Highstandard material", 2));
		logger.warn("No warnings in calculating the Highstandard matrial house construction cost");
		logger.error("No errors in calculating Highstandard matrial house construction cost");
	}
	@Test
	public void testCost3() {
		GenerateBill test= new GenerateBill();
		assertEquals(10000.00,test.totalcost("HighstandardFullautomatic", 4),0);
		logger.info("House construction with Highstandard Fullautomatic material is calculated");
		logger.debug(test.totalcost("HighstandardFullautomatic", 4));
		logger.warn("No warnings in calculating the Highstandard Fullautomatic matrial house construction cost");
		logger.error("No errors in calculating Highstandard Fullautomatic matrial house construction cost");
	}
}
