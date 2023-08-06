import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AcceessMethodElementClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\днс\\IdeaProjects\\test-selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(18, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        /*WebElement element = driver.findElement(By.xpath(""));
        element.isSelected();
        element.isDisplayed();
        element.isEnabled();
        */
        driver.get("https://www.w3schools.com/jsref/prop_pushbutton_disabled.asp");
        System.out.println(driver.findElements(By.xpath("//a[text()=\"Retact\"]")).size());



    }
}
