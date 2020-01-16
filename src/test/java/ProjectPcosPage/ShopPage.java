package ProjectPcosPage;

import org.openqa.selenium.*;

public class ShopPage {

    public static WebDriver driver;
    private static WebElement searchBar;
    private WebElement Grafic;


    public ShopPage(WebDriver driverShop) {
        String URLShop = "https://www.rolno-ogrodniczy.pl/";
        this.driver = driverShop;
        driver.get(URLShop);
        driver.manage().window().maximize();
    }

    public static void GraphicChange()
    {
        driver.manage().window().maximize();
        WebElement
        Grafic = driver.findElement(By.cssSelector("#slide-link-3"));
            Grafic.click();
        Grafic = driver.findElement(By.cssSelector("#slide-link-0"));
            Grafic.click();
        Grafic = driver.findElement(By.cssSelector("#slide-link-2"));
            Grafic.click();
        Grafic = driver.findElement(By.cssSelector("#slide-link-1"));
        Grafic.click();
    }

   public static void Sorting()
    {
        driver.manage().window().maximize();
        WebElement popularity = driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr/td/div[4]/div[2]/div/table[1]/tbody/tr/td/div/table/tbody/tr/td/div/form/table/tbody/tr/td[2]/div/select/option[1]"));
        popularity.click();
       // assertThat(driver.getCurrentUrl()).isEqualTo(driverShop);

        WebElement productNameAscending = driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr/td/div[4]/div[2]/div/table[1]/tbody/tr/td/div/table/tbody/tr/td/div/form/table/tbody/tr/td[2]/div/select/option[2]"));
        productNameAscending.click();
       // assertThat(driver.getCurrentUrl()).isEqualTo(driverShop);

        WebElement productNameDescending = driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr/td/div[4]/div[2]/div/table[1]/tbody/tr/td/div/table/tbody/tr/td/div/form/table/tbody/tr/td[2]/div/select/option[3]"));
        productNameDescending.click();
      //  assertThat(driver.getCurrentUrl()).isEqualTo(driverShop);

        WebElement orderOfAddingAscending = driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr/td/div[4]/div[2]/div/table[1]/tbody/tr/td/div/table/tbody/tr/td/div/form/table/tbody/tr/td[2]/div/select/option[4]"));
        orderOfAddingAscending.click();
     //   assertThat(driver.getCurrentUrl()).isEqualTo(driverShop);

        WebElement orderOfAddingDescending = driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr/td/div[4]/div[2]/div/table[1]/tbody/tr/td/div/table/tbody/tr/td/div/form/table/tbody/tr/td[2]/div/select/option[5]"));
        orderOfAddingDescending.click();
      //  assertThat(driver.getCurrentUrl()).isEqualTo(driverShop);

        WebElement priceAscending = driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr/td/div[4]/div[2]/div/table[1]/tbody/tr/td/div/table/tbody/tr/td/div/form/table/tbody/tr/td[2]/div/select/option[6]"));
        priceAscending.click();
      //  assertThat(driver.getCurrentUrl()).isEqualTo(driverShop);

        WebElement priceDescending = driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr/td/div[4]/div[2]/div/table[1]/tbody/tr/td/div/table/tbody/tr/td/div/form/table/tbody/tr/td[2]/div/select/option[7]"));
        priceDescending.click();
      //  assertThat(driver.getCurrentUrl()).isEqualTo(driverShop);

        WebElement viewership = driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr/td/div[4]/div[2]/div/table[1]/tbody/tr/td/div/table/tbody/tr/td/div/form/table/tbody/tr/td[2]/div/select/option[8]"));
        viewership.click();
      //  assertThat(driver.getCurrentUrl()).isEqualTo(driverShop);

    }
    public static void SrechBar(String searchObject)
    {
        driver.manage().window().maximize();
        WebElement searchBar = driver.findElement(By.name("szukaj"));
        searchBar.sendKeys(searchObject);
        WebElement selectButton = driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr/td/div[3]/form/div/input[2]"));
        selectButton.click();
        WebElement selectButton2 = driver.findElement(By.cssSelector("body > div:nth-child(6) > table > tbody > tr > td > div.podmenu > form > div > input.submit"));
        selectButton2.click();
    }

    public static void SearchByEnter(String serchE)
    {
        WebElement searchBar = driver.findElement(By.name("szukaj"));
        searchBar.sendKeys(serchE);
        driver.findElement(By.name("szukaj")).sendKeys(Keys.ENTER);
    }

    public static void Subscribe()
    {
        driver.manage().window().maximize();
        WebElement emailBar = driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr/td/div[4]/div[1]/form[2]/div/p/input"));
        emailBar.sendKeys("adres@email.com");
        WebElement subsSignIn = driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr/td/div[4]/div[1]/form[2]/div/input[2]"));
        subsSignIn.click();
        driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr/td/div[4]/div[1]/form[2]/div/p/input")).sendKeys("adres@email.com");
        WebElement subsSignOut = driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr/td/div[4]/div[1]/form[2]/div/input[3]"));
        subsSignOut.click();
    }
    public static void Faq()
    {
        WebElement faq = driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr/td/div[4]/div[3]/div[4]/ul/li[2]/a"));
        faq.click();
        for(int i=1;i<3;i+=2)
        {
            WebElement faqElement = driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr/td/div[4]/div[2]/div/div[2]/a["+i+"]"));
            faqElement.click();
        }
    }

    public static void ButtonProducts() {
        driver.get("https://www.rolno-ogrodniczy.pl");
        WebElement nowosci = driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr/td/div[2]/ul/li[3]/a"));
        nowosci.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        WebElement trutka = driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr/td/div[4]/div[2]/div/table[2]/tbody/tr[1]/td/form/div[28]/table/tbody/tr/td[2]/div/a/span"));
        trutka.click();
        WebElement cookies = driver.findElement(By.xpath("//*[@id=\"accept-cookies-checkbox\"]"));
        cookies.click();
        WebElement logo = driver.findElement(By.cssSelector("body > div:nth-child(6) > table > tbody > tr > td > div.top > h1 > a"));
        logo.click();
    }
}
