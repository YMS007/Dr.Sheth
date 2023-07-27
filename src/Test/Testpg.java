package Test;

import org.testng.annotations.Test;

import Base.BaseClas;
import Page.Loginpg;

public class Testpg extends BaseClas  {
		@Test
		public void testing() throws InterruptedException
		{
			Loginpg ob =new Loginpg(driver);
			ob.a();
			/*ob.b();
			ob.c();
			ob.d();*/
			ob.e();
			Thread.sleep(3000);
			ob.f();
			Thread.sleep(5000);
			ob.search("sunscreen");
			Thread.sleep(3000);
			ob.product();
			Thread.sleep(3000);
			ob.addcart();
			
		}
}
