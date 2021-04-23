package AssignmentWeek5_DataProvider;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTests implements IRetryAnalyzer {

	int maxRetry=2;
	int retryinit=0;
	
	public boolean retry(ITestResult result) {
		
		if(!result.isSuccess() && retryinit<maxRetry) {
			retryinit++;
			return true;	
		}
		
		return false;
	}

}
