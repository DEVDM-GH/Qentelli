package gitTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestPushTestNG {
	@Test
	public void test() {
		Reporter.log("Wow this is happening.. It's Good !!!",true);
		Reporter.log("Yo man.. I did this on GitHub. Try to pull this on the PC !!!",true);
	}
}
