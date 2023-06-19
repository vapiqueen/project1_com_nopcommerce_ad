package project_1_com_nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class chromebrowsertest1 {
    public static void main(String[] args) {
 String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";
 //Set up ChromeBrowser
        WebDriver driver = new ChromeDriver();
        //Open the URL into the Browser
         driver.get(baseUrl);
        System.out.println("Current URL" + driver.getCurrentUrl());

        //Maximise Browser
        driver.manage().window().maximize();

        //Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //Print the title of the page
       String title = driver.getTitle();
        System.out.println("Title of the Page is" + title);

        //Print current URL
         String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL is" + currentUrl);

         //Print the page source
      String pageSource = driver.getPageSource();
        System.out.println("Print the page source" + pageSource);

      //Enter the email to email field
         WebElement email  = driver.findElement(By.id("Email"));
        email.sendKeys("aartidoshi1234@gmail.com");

        //Enter Password to password field
        driver.findElement(By.name("Password")).sendKeys("Prime123");


        //Close the browser
       driver.close();

    }
}