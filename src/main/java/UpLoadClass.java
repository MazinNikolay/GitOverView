import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UpLoadClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\днс\\IdeaProjects\\test-selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(18, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.google.ru/");
        driver.findElement(By.xpath("//a[text()='Картинки']")).click();
        driver.findElement(By.xpath("//div[@aria-label=\"Поиск по картинке\"]")).click();
        driver.findElement(By.xpath("//a[text()=\"Загрузить изображение\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"awyMjb\"]")).sendKeys("D:\\Screenshots\\Screenshot.png");

    }
}
