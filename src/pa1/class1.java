package pa1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class class1 {
	private static WebDriverWait wait=null;
	static WebDriver driver=null;
	static WebElement element=null;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Browser/chromedriver.exe");
		driver=new ChromeDriver();
		/*driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//li[@class='menu_Flights']//span[@class='headerIconTextAlignment chNavText darkGreyText']")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class=\"flt_fsw_inputBox searchCity inactiveWidget \"]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//label[@for=\"fromCity\"]/input[@type=\"text\"]")).sendKeys("Pun");
		driver.findElement(By.xpath("//p[text()='Pune, India']")).click();
		driver.findElement(By.xpath("//input[@id=\"toCity\"]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id=\"toCity\"]")).sendKeys("Hyd");
		driver.findElement(By.xpath("//p[text()='Hyderabad, India']")).click();
		System.out.println("Passed");
		driver.close(); */
		
		
		driver.get("https://www.highcharts.com/docs/chart-and-series-types/pie-chart");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id=\"hc-cookie-dialog-decline\"]")).click();
		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@title='Highcharts example'])[1]")));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);
		//WebElement element=driver.findElement(By.xpath("//*[local-name()='svg' and @class='highcharts-root']/*[name()='g'][3]/*[name()='g'][4]/*[name()='text']"));
		WebElement element=driver.findElement(By.xpath("(//*[name()='text'][normalize-space()='26.7%'])[1]"));
		// element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='svg' and @class='highcharts-root']/*[name()='g'][3]/*[name()='g'][4]/*[name()='text']")));
		
		//js.executeScript("arguments[0].scrollIntoView(true)",element);
		
		//wait.until(ExpectedConditions.elementToBeClickable(element));
		//element.click();
		//WebElement pieElement=driver.findElement(By.xpath("//*[name()='svg' and @class=\"highcharts-root\"]/*[name()='g'][3]/*[name()='g'][4]"));
		
		//js.executeScript("arguments[0].scrollIntoView(true)", pieElement);
		
		String text=element.getText();
	
	System.out.println(text);
		//*[@id="highcharts-i7w664m-0"]/svg/g[3]/g[4]/text
		//*[name()='svg' and @class='highcharts-root']/g[3]/g[4]
	}

}
