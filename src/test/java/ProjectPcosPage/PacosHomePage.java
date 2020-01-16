package ProjectPcosPage;
//moje h. -atrybuty i nazwy metod

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PacosHomePage {
    public static WebDriver driver;
    public String URL = "http://pakos.com.pl/";
    public WebElement emailBar;
    private String overlap;


    public PacosHomePage(WebDriver _drver) {
        this.driver = _drver;
        driver.get(URL);
        driver.manage().window().maximize();
    }

    public static void Overlap(String overlap, String overlap2, String logo) {
        WebElement Menu;

        Menu = driver.findElement(By.id(overlap));
        Menu.click();
        driver.findElement(By.xpath(overlap2)).click();
        driver.findElement(By.xpath(logo)).click();


    }

}





