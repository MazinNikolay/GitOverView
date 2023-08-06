import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class MoveDragClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\днс\\IdeaProjects\\test-selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(18, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.ebay.com/");
        WebElement link = driver.findElement(By.xpath("//button[text()=\"Развернуть: Электроника\"]/../preceding-sibling::a[text()=\"Электроника\"]"));
        WebElement element = driver.findElement(By.xpath("//button[text()=\"Развернуть: Электроника\"]/../preceding-sibling::a[text()=\"Электроника\"]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(link).build().perform();

        //actions.dragAndDrop(element, link).build().perform();
        //actions.clickAndHold(element).moveToElement(link).release().build().perform();
        //actions.doubleClick(element);
        //actions.contextClick(element);

        //Action action = actions.clickAndHold(element).moveToElement(link).release().build();
        //action.perform();
    }
}
