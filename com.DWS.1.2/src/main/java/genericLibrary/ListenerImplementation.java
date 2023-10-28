package genericLibrary;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
public class ListenerImplementation implements ITestListener {
public void onTestFailure(ITestResult result) {
	System.out.println("Test failed");}

	public void onStart(ITestContext context) {
			System.out.println("Testcase Execution started");
		}
	
	public void onFinish(ITestContext context) {
			System.out.println("test case execution finished");
	}
}

