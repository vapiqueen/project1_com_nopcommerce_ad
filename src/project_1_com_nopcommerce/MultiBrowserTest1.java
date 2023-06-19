package project_1_com_nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest1 {
    static String browser = "Edge";

    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";

    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else {
            System.out.println("Wrong Browser Name.Please try again");
        }

        //setup Edge browser
        WebDriver driver1 = new EdgeDriver();

        //Open URL
        driver1.get(baseUrl);

        // Maximise Browser
        driver.manage().window().maximize();

        //Implicit wait driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Print the title of the page
        String title = driver1.getTitle();
        System.out.println("Title of the page" + title);

        //Print the current url
        String currentUrl = driver1.getCurrentUrl();
        System.out.println("Current URL is " + currentUrl);

        //Print the page source
        String pageSource = driver1.getPageSource();
        System.out.println("Page Source " + pageSource);

        //Enter the email to email field
        WebElement email = driver1.findElement(By.id("Email"));
        email.sendKeys("aartidoshi1234@gmail.com");

        //Enter the password to password field

        WebElement password = driver1.findElement(By.name("Password"));
        password.sendKeys("Prime123");

        //Close the browser
        driver1.close();




    }
}
