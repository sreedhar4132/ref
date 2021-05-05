package test_Pack;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


	public class ver2 extends Browser_Invocation {

		@Test
		public void browserrr2() throws IOException
		{
			invocation();
			driver.get(pro.getProperty("url"));
		}
		
		@AfterTest
		public void close()
		{
			driver.quit();
		}
}
