package resources;

import java.io.IOException;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


public class Listneres extends BaseSleepycat implements ITestListener {
	
	ExtentTest test;
	ExtentReports extent = Extentreports.getreportobject();
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test= extent.createTest(result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(Status.PASS,"Test is passed successfully");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		test.fail(result.getThrowable());
		RemoteWebDriver driver=null;
		
		String testMethodname = result.getMethod().getMethodName();
		try {
			driver= (RemoteWebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (Exception e) {
		}
		try {
                getScreenShotPath(testMethodname,driver);
		     }
		catch(IOException e){
			
			e.printStackTrace();
		}
		
	}
		
	

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
		
	}

}



