import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TextFieldClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\днс\\IdeaProjects\\test-selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().window().maximize();
        driver.get("https://ru.wikipedia.org/wiki/");

        driver.findElement(By.xpath("//input[@id=\"searchInput\"]")).sendKeys("Жопа собаки");
        driver.findElement(By.xpath("//input[@id=\"searchButton\"]")).click();
        System.out.println(driver.findElement(By.xpath("//div[@id=\"searchText\"]/input")).getAttribute("value"));
        driver.findElement(By.xpath("//div[@id=\"searchText\"]/input")).clear();

        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("fetishist");
        driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("zalupa");
        driver.findElement(By.xpath("//button[@name=\"login\"]")).submit();






    }
}
