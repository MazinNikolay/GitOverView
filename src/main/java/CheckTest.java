import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CheckTest {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\днс\\IdeaProjects\\test-selenium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        driver.get("https://www.dns-shop.ru/");
        driver.findElement(By.xpath("//a[@class=\"btn btn-additional\"]")).click();
        driver.findElement(By.xpath("//a[text()=\"Бытовая техника\"]")).click();
        driver.findElement(By.xpath("//span[text()=\"Техника для кухни\"]")).click();
        driver.findElement(By.xpath("//span[text()=\"Посудомоечные машины\"]")).click();
        driver.findElement(By.xpath("//div[@class=\"subcategory__content\"]/span[text()=\"Посудомоечные машины\"]")).click();
        driver.findElement(By.xpath("//label[@class=\"ui-checkbox ui-checkbox_list\"]/span[2]")).click();

        driver.findElement(By.xpath("//span[text()=\"В наличии\"]")).click();

    }
}


