import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.opera.OperaDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class KeyInputClass {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\днс\\IdeaProjects\\test-selenium\\drivers\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.opera.driver","C:\\Users\\днс\\IdeaProjects\\test-selenium\\drivers\\operadriver.exe");
        WebDriver driver = new OperaDriver();
        driver.manage().timeouts().implicitlyWait(18, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://ru.wikipedia.org/");
        WebElement searchInput = driver.findElement(By.xpath("//input[@name=\"search\"]"));
        String select = Keys.chord(Keys.CONTROL,"a");
        String cut = Keys.chord(Keys.CONTROL, "x");
        String paste = Keys.chord(Keys.CONTROL, "v");
        searchInput.sendKeys(Keys.chord(Keys.SHIFT, "text"));
        searchInput.sendKeys(select);
        searchInput.sendKeys(cut);
        searchInput.sendKeys(paste);

        searchInput.sendKeys(Keys.ENTER);

        Date dateNow = new Date();
        SimpleDateFormat format = new SimpleDateFormat("hh_mm_ss");
        String filename = format.format(dateNow) + ".png";

        File screenShot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(screenShot, new File("D:\\Screenshots\\" + filename));
        } catch (IOException e) {
            e.printStackTrace();
        }

        driver.quit();

    }
}
