package AutomatedTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatedTesting {
	public static void main(String[] args) {
		//setting the driver executable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anarg\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open browser with desired URL
		driver.get("https://www.amazon.com/");
		//Testing the adding item to cart feature
		//Clearing search box
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		//Search led lights
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("led lights");
		//Clicking on search
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		//Selecting a product
		//driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[8]/div/div/div/div/div[1]/span/a/div/img")).click();
		driver.findElement(By.linkText("DAYBETTER Led Strip Lights 32.8ft Kit with Remote and Power Supply Color Changing")).click();
		//Adding item to cart
		driver.findElement(By.id("add-to-cart-button")).click();
		//Going back home
		driver.get("https://www.amazon.com/");
		String url = driver.getCurrentUrl();
		
		//closing the browser
		driver.close();
		//Checking if url matches
		if(url.equals("https://www.amazon.com/")) {
			System.out.println("Success");
		} else {
			System.out.println("Failure");
		}
		
	}
}
