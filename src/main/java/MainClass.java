import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class MainClass {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\днс\\IdeaProjects\\test-selenium\\drivers\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.opera.driver","C:\\Users\\днс\\IdeaProjects\\test-selenium\\drivers\\operadriver.exe");
        WebDriver driver = new OperaDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        driver.get("https://ru.wikipedia.org/wiki/");

        driver.get("https://github.com/");

        WebElement button = driver.findElement(By.xpath("//div[@class=\"d-flex flex-column flex-sm-row flex-items-center\"]//button"));

        if (button.getText().equals("Sign up for GitHub")) {
            System.out.println("Ochen horosho");
        } else System.out.println("Fail");
        //button.submit();
        WebElement button2 = driver.findElement(By.xpath("//a[contains(text(),\"Sign in\")]"));
        button2.click();
        driver.get("https://www.facebook.com/");
        //WebElement button5 = driver.findElement(By.xpath("//button[@name=\"login\"]"));
        driver.findElement(By.xpath("//button[@name=\"login\"]")).click();


        System.out.println(button2.getText());

        //driver.quit();
    }
}
