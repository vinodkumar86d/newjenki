package Sample;

import org.testng.annotations.Test;

public class SampleTest {
	@Test(groups="smoke")
	
	public void create()
	{
		System.out.println("====created=");
	}
	@Test(groups="smoke")
	public void update()
	{
		System.out.println("===update===");
	}
}
