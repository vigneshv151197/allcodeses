package jarfile;

import java.util.ArrayList;
import java.util.List;

import com.beust.testng.TestNG;

public class twowheelerjar {

public static void main(String[] args) {
        
        // Create object of TestNG Class
        TestNG runner=new TestNG();

        // Create a list of String 
        List<String> suitefiles=new ArrayList<String>();

        // Add xml file which you have to execute
        suitefiles.add("testngtw.xml");

        // now set xml file for execution
        runner.setTestSuites(suitefiles);

        // finally execute the runner using run method
        runner.run();
    }

}
	

