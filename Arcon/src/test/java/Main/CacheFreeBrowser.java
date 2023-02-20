package Main;

import org.testng.annotations.Test;

import BaseClass.LibGlobal;

public class CacheFreeBrowser extends LibGlobal {

	
	@Test
	private void browserLaunch() {
		
		launchBrowser("chrome");
	}
}
