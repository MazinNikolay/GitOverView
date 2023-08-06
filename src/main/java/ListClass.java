import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ListClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\днс\\IdeaProjects\\test-selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(18, TimeUnit.SECONDS);

        driver.get("https://market.yandex.ru/");
        driver.findElement(By.xpath("//span[text()=\"Электроника\"]")).click();
        driver.findElement(By.xpath("//a[text()=\"Смартфоны\"]")).click();
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//aside//legend[text()=\"Производитель\"]/following-sibling::ul//span[@class=\"_1o8_r\"]"));
        checkBoxes.get(4).click();

        if (checkBoxes.size() == 12) System.out.println("It`s okay");
        else System.out.println("False");

        for (WebElement checkBox : checkBoxes){
            checkBox.click();
        }

    }
}
