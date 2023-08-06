import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SwitchClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\днс\\IdeaProjects\\test-selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(18, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        driver.get("https://www.google.com/");
        jse.executeScript("confirm('Are you sure?');");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.switchTo().alert().accept();

        jse.executeScript("confirm('Wonna fuck');");
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        driver.switchTo().alert().dismiss();

        driver.get("https://meteoinfo.ru/forecasts5000/russia/irkutsk-area/angarsk");
        String mainWindow = driver.getWindowHandle();
        driver.findElement(By.xpath("//a[@href=\"https://vk.com/meteoinfo_ru\"]")).click();

        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
        }
        driver.findElement(By.xpath("//a[text()=\"Забыли пароль?\"]")).click();

        driver.switchTo().window(mainWindow);

        driver.findElement(By.xpath("//li[@class=\"dj-up itemid113 parent\"]//a[@href=\"/forecasts\"]")).click();

        driver.get("https://www.oracle.com/java/technologies/downloads/");
        driver.findElement(By.xpath("//*[contains(text(), 'OpenJDK Early Access Builds')]/..")).click();
    }
}
