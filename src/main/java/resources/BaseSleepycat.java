package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseSleepycat {

	public RemoteWebDriver driver;
	public Properties property;
	public static final String USERNAME = "girjakahar_4kEVqO";
	public static final String AUTOMATE_KEY = "GWisE2vkz9cr2qDDg2nD";
	public static final String URL1 = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	public RemoteWebDriver initializeChrome() throws IOException {
		property = new Properties();
		FileInputStream filePath = new FileInputStream("C:\\Users\\user\\eclipse-workspaceNew\\SleepycatAutomationV1\\src\\main\\java\\resources\\WebsiteData.properties");
		property.load(filePath);
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "10");
		caps.setCapability("browser_version", "92.0");
		caps.setCapability("browserstack.local", "false");
		caps.setCapability("browserstack.networkLogs", "true");
		caps.setCapability("browserstack.debug", "true");
		caps.setCapability("browserstack.selenium_version", "3.141.59");
		caps.setCapability("browser", "Chrome");
		caps.setCapability("browserstack.use_w3c", "true");
		caps.setBrowserName("Chrome");

		try {
			driver = new RemoteWebDriver(new URL(URL1), caps);

		} catch (Exception e) {
			System.out.println(e);
		}
		return driver;

	}
	
	    public RemoteWebDriver initializeSafari() throws IOException {
	    property = new Properties();
		FileInputStream filePath = new FileInputStream("C:\\Users\\user\\eclipse-workspaceNew\\SleepycatAutomationV1\\src\\main\\java\\resources\\WebsiteData.properties");
		property.load(filePath);
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("os", "OS X");
		caps.setCapability("os_version", "Catalina");
		caps.setCapability("browser", "Safari");
		caps.setCapability("browser_version", "13.0");
		caps.setCapability("browserstack.local", "false");
		caps.setCapability("browserstack.debug", "true");
		caps.setCapability("browserstack.networkLogs", "true");
		caps.setCapability("browserstack.selenium_version", "3.14.0");


		try {
			driver = new RemoteWebDriver(new URL(URL1), caps);

		} catch (Exception e) {
			System.out.println(e);
		}
		return driver;

	}
	    public RemoteWebDriver initializeFirefox() throws IOException {
		    property = new Properties();
			FileInputStream filePath = new FileInputStream("C:\\Users\\user\\eclipse-workspaceNew\\SleepycatAutomationV1\\src\\main\\java\\resources\\WebsiteData.properties");
			property.load(filePath);
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("os", "Windows");
			caps.setCapability("os_version", "10");
			caps.setCapability("browser", "Firefox");
			caps.setCapability("browser_version", "90.0");
			caps.setCapability("browserstack.local", "true");
			caps.setCapability("browserstack.debug", "true");
			caps.setCapability("browserstack.networkLogs", "true");
			caps.setCapability("browserstack.selenium_version", "3.10.0");

			try {
				driver = new RemoteWebDriver(new URL(URL1), caps);

			} catch (Exception e) {
				System.out.println(e);
			}
			return driver;
		}
	
	public void getScreenShotPath(String testCaseName,RemoteWebDriver driver) throws IOException 
	  { 
		  TakesScreenshot ts=(TakesScreenshot) driver;//TakesScreenshot method is used to take screenshot in selenium 
		  File source=ts.getScreenshotAs(OutputType.FILE);//File in this step has info that wherethe screenshot is captured 
		  String destinationFile =System.getProperty("user.dir")+"\\Screenshot\\"+testCaseName+".png";//to providepath where you need to store the screenshot 
		  FileUtils.copyFile(source,new File(destinationFile));//FileUtils is to copy the screenshot into your local machine from vertiual place source
	  }
	
	public static void verifyLinkActive(String linkUrl)
	{
        try 
        {
           URL url = new URL(linkUrl);//creating object of url which is coming from the website
           
           HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();//First creating the connection using url and then it will retrun the HttpURLConnection object
           
           httpURLConnect.setConnectTimeout(3000);
           
           httpURLConnect.connect();
           
           if(httpURLConnect.getResponseCode()==200)
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
               System.out.println("link is working properly");
            }
          if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
            }
        } catch (Exception e) {
        	
        	System.out.println("link is broken  " +e);
           
        }
	

}
	
}
