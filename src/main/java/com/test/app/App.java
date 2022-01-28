package com.test.app;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.chrome.ChromeDriver;


public class App 
{
    @Test
    public void launchChromeBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver_mac"); // Change this for windows, executable is at the root

        ChromeOptions options = new ChromeOptions();
        options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        options.setCapability(CapabilityType.ELEMENT_SCROLL_BEHAVIOR, 1);
        WebDriver driver 			= new ChromeDriver(options);
        try{
            System.out.println("!!!!!! Starting Chrome Browser !!!!!!");
            driver.navigate().to("https://google.com" );
        } catch (Exception e){
            System.out.println("Error: " + e);
        }
    }

}
