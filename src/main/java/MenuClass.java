import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MenuClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\днс\\IdeaProjects\\test-selenium\\drivers\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        //WebDriverWait driverWait = new WebDriverWait(driver,18);
        driver.manage().timeouts().implicitlyWait(18, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://market.yandex.ru/");
        driver.findElement(By.xpath("//span[text()=\"Продавайте на Маркете\"]")).click();
        driver.findElement(By.xpath("//a[@href=\"#lead-zag\"]")).click();
        driver.switchTo().frame(driver.findElement(By.id("lead-promo-form-iframe")));
        driver.findElement(By.xpath("//span[text()=\"Сколько товаров в каталоге\"]/..")).click();
        driver.findElement(By.xpath("//div[text()=\"От 500 до 1000 товаров\"]")).click();
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//a[text()=\"Маркет для производителей\"]")).click();

        driver.get("https://www.dns-shop.ru/");
        driver.findElement(By.xpath("//a[@class=\"btn btn-additional\"]")).click();
        driver.findElement(By.xpath("//a[text()=\"Бытовая техника\"]")).click();
        driver.findElement(By.xpath("//span[text()=\"Техника для кухни\"]")).click();
        driver.findElement(By.xpath("//span[text()=\"Посудомоечные машины\"]")).click();
        driver.findElement(By.xpath("//div[@class=\"subcategory__content\"]/span[text()=\"Посудомоечные машины\"]")).click();
        driver.findElement(By.xpath("//div[text()=\"В любом из 5 магазинов\"]/span")).click();
        driver.findElement(By.xpath("//span[text()=\"Ангарск ТК «Центр»\"]/following-sibling::span")).click();
        driver.findElement(By.xpath("//a[text()=\"Выбирай правильно\"]")).click();
        driver.findElement(By.xpath("//a[text()=\"Видео гид\"]")).click();

    }
}
