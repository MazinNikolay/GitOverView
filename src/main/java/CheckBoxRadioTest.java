import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CheckBoxRadioTest {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\днс\\IdeaProjects\\test-selenium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        driver.get("https://market.yandex.ru/");
        driver.findElement(By.xpath("//span[text()=\"Электроника\"]")).click();
        driver.findElement(By.xpath("//a[text()=\"Смартфоны\"]")).click();

        selectCheckBox("Apple");
        selectCheckBox("BQ");
        selectCheckBox("HONOR");

        driver.findElement(By.xpath("//span[text()=\"С учётом доставки курьером\"]")).click();

    }

    public static void selectCheckBox(String name){
        String chbXpath = String.format("//span[text()=\"%s\"]", name);
        String verification = "//input[@name=\"Производитель %s\"]";
        driver.findElement(By.xpath(chbXpath)).click();
        System.out.println(driver.findElement(By.xpath(String.format(verification, name))).isSelected());

    }
}
