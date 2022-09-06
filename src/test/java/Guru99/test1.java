package Guru99;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) throws Exception 
	{
		String exptitle="OrangeHRM";
		System.setProperty("webdriver.chrome.driver","C://Users//kabir//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//System.out.println(driver.getTitle());
	String	pagetitle = driver.getTitle();
	System.out.println(pagetitle);
	String geturl=driver.getCurrentUrl();
	System.out.println(geturl);
		if (pagetitle.contentEquals(exptitle)) {
			System.out.println("test passed");
		}else {
			System.out.println("Test failed");
		}
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(8000);
		driver.close();
	}

}
