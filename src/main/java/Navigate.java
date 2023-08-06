import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Navigate {

        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\днс\\IdeaProjects\\test-selenium\\drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            driver.manage().window().maximize();

            driver.get("https://meteoinfo.ru/forecasts5000/russia/irkutsk-area/angarsk");
            driver.navigate().to("https://vk.com/id19736562");
            driver.navigate().back();
            driver.manage().window().setSize(new Dimension(900, 500));
            driver.navigate().forward();

            System.out.println(driver.getTitle());
            System.out.println(driver.getCurrentUrl());

            driver.get("https://ru.wikipedia.org/wiki/");

            WebElement link = driver.findElement(By.linkText("Войти"));
            WebElement link2 = driver.findElement(By.partialLinkText("редактировать каждый"));
            WebElement searchField = driver.findElement(By.name("search"));
            WebElement searchButton = driver.findElement(By.className("searchButton"));
            WebElement liId = driver.findElement(By.id("pt-anoncontribs"));
            WebElement tagInput = driver.findElement(By.tagName("input")); //возвращает первое из найденных
            WebElement element = driver.findElement(By.cssSelector("div#main-tfa div#mw-customcollapsible-tfa")); //form#searchform > div - внутри id; div.vector-body > a - внутри класса
            WebElement logo = driver.findElement(By.xpath("//div[@id=\"mw-panel\"]/div[@id=\"p-logo\"]/a"));

    }

}
