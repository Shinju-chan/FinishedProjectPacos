package ProjectPcosAllCode;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FinalProject {
    public WebDriver driver;

    public void HighlighElement(WebDriver driver, WebElement element)

    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='3px solid red'", element);
    }


    @Before
    public void setup(){
    System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    }

    @Test
    //obrazy na stronie głownej/ galeria
    public void DysplayGrafick() {
        driver.get("http://pakos.com.pl/");
        driver.manage().window().maximize();
        WebElement Foto;

        Foto = driver.findElement(By.cssSelector("#gallery-1 > dl:nth-child(1) > dt > a"));
        Foto.click();
        driver.navigate().refresh();
        Foto = driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div[2]/dl[2]/dt/a"));
        Foto.click();
        driver.navigate().refresh();
        Foto = driver.findElement(By.cssSelector("#gallery-1 > dl:nth-child(3) > dt > a"));
        Foto.click();
        driver.navigate().refresh();
        Foto = driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div[2]/dl[4]/dt/a"));
        Foto.click();
        driver.navigate().refresh();
        driver.close();
    }
    @Test
    // cenniki >
    public void RedirectionViaGraphics() {
        driver.get("http://pakos.com.pl/");
        driver.manage().window().maximize();
        WebElement Menu;

        Menu = driver.findElement(By.id("menu-item-750"));
        Menu.click();
        Menu = driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div[1]/div/div[1]/a"));
        Menu.click();
//        Menu = driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div[2]/div/div[1]"));
//        Menu.click();
//        Menu = driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div[6]/div/div[3]/a"));
//        Menu.click();
//        driver.close();
    }

        @Test
        //test Shinju przełanczanie grafiki nagłuwkowej Sklep>
                public void RedirectionFromTheBottomMenuAndChangeOfTheHeaderGraphics()
        {
            driver.get("http://pakos.com.pl/");
            driver.manage().window().maximize();
        WebElement Menu;

            Menu = driver.findElement(By.cssSelector("#menu-item-832 > a > span"));
            Menu.click();
            Menu = driver.findElement(By.cssSelector("#slide-link-3"));
            Menu.click();
            Menu = driver.findElement(By.cssSelector("#slide-link-0"));
            Menu.click();
            driver.close();
        }
    @Test
    //test krzysztofa otwiera stronę i klika prodeucenta >
    public void openSiteAndClickOnProducentBar()
    {
        String desiredPage = "https://rolno-ogrodniczy.pl/index.php?d=szukaj&producent=390";
        driver.get("https://rolno-ogrodniczy.pl");
        List<WebElement> producentBar = driver.findElements(By.className("select-producent"));
        producentBar.get(0).click();
        WebElement adama = driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr/td/div[4]/div[1]/form[1]/div/select/option[2]"));
        adama.click();

        assertThat(driver.getCurrentUrl()).isEqualTo(desiredPage);
    }

    @Test
    //test krzysztofa sprawdza sortowanie >
    public void testSorting()
    {
        String desiredPage = "https://rolno-ogrodniczy.pl/index.php?d=szukaj&producent=215";
        driver.get("https://rolno-ogrodniczy.pl/index.php?d=szukaj&producent=215");
        List<WebElement> sortBar = driver.findElements(By.name("sort"));
        sortBar.get(0).click();

        WebElement popularity = driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr/td/div[4]/div[2]/div/table[1]/tbody/tr/td/div/table/tbody/tr/td/div/form/table/tbody/tr/td[2]/div/select/option[1]"));
        popularity.click();
        assertThat(driver.getCurrentUrl()).isEqualTo(desiredPage);

        WebElement productNameAscending = driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr/td/div[4]/div[2]/div/table[1]/tbody/tr/td/div/table/tbody/tr/td/div/form/table/tbody/tr/td[2]/div/select/option[2]"));
        productNameAscending.click();
        assertThat(driver.getCurrentUrl()).isEqualTo(desiredPage);

        WebElement productNameDescending = driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr/td/div[4]/div[2]/div/table[1]/tbody/tr/td/div/table/tbody/tr/td/div/form/table/tbody/tr/td[2]/div/select/option[3]"));
        productNameDescending.click();
        assertThat(driver.getCurrentUrl()).isEqualTo(desiredPage);

        WebElement orderOfAddingAscending = driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr/td/div[4]/div[2]/div/table[1]/tbody/tr/td/div/table/tbody/tr/td/div/form/table/tbody/tr/td[2]/div/select/option[4]"));
        orderOfAddingAscending.click();
        assertThat(driver.getCurrentUrl()).isEqualTo(desiredPage);

        WebElement orderOfAddingDescending = driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr/td/div[4]/div[2]/div/table[1]/tbody/tr/td/div/table/tbody/tr/td/div/form/table/tbody/tr/td[2]/div/select/option[5]"));
        orderOfAddingDescending.click();
        assertThat(driver.getCurrentUrl()).isEqualTo(desiredPage);

        WebElement priceAscending = driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr/td/div[4]/div[2]/div/table[1]/tbody/tr/td/div/table/tbody/tr/td/div/form/table/tbody/tr/td[2]/div/select/option[6]"));
        priceAscending.click();
        assertThat(driver.getCurrentUrl()).isEqualTo(desiredPage);

        WebElement priceDescending = driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr/td/div[4]/div[2]/div/table[1]/tbody/tr/td/div/table/tbody/tr/td/div/form/table/tbody/tr/td[2]/div/select/option[7]"));
        priceDescending.click();
        assertThat(driver.getCurrentUrl()).isEqualTo(desiredPage);

        WebElement viewership = driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr/td/div[4]/div[2]/div/table[1]/tbody/tr/td/div/table/tbody/tr/td/div/form/table/tbody/tr/td[2]/div/select/option[8]"));
        viewership.click();
        assertThat(driver.getCurrentUrl()).isEqualTo(desiredPage);
    }

    @Test
    //najczęściej zadawane pytania sklep >
    public void FaqTesting(){
        WebElement faq = driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr/td/div[4]/div[3]/div[4]/ul/li[2]/a"));
        faq.click();
        for(int i=1;i<3;i+=2) {
            WebElement faqElement = driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr/td/div[4]/div[2]/div/div[2]/a["+i+"]"));
            faqElement.click();
        }
    }
    @Test
    // subskrypcja, w sklepie >
    public void Subscription(){
        WebElement emailBar=driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr/td/div[4]/div[1]/form[2]/div/p/input"));
        emailBar.sendKeys("adres@email.com");
        WebElement subsSignIn=driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr/td/div[4]/div[1]/form[2]/div/input[2]"));
        subsSignIn.click();
        driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr/td/div[4]/div[1]/form[2]/div/p/input")).sendKeys("adres@email.com");
        WebElement subsSignOut=driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr/td/div[4]/div[1]/form[2]/div/input[3]"));
        subsSignOut.click();
    }
    @Test
    //wyszukiwarkai enter >
    public void testingSearchBarByEnter7()
    {
        driver.get("https://www.rolno-ogrodniczy.pl");
        WebElement searchBar = driver.findElement(By.name("szukaj"));
        searchBar.sendKeys("nasiona traw");
        driver.findElement(By.name("szukaj")).sendKeys(Keys.ENTER);
        WebElement searchBar2 = driver.findElement(By.name("szukaj"));
        searchBar2.sendKeys("nasiona traw!!!");
        driver.findElement(By.name("szukaj")).sendKeys(Keys.ENTER);
    }

    @Test
    //test wyszykiwarki >
    public void testingSearchBarByObject7a()
    {
        driver.get("https://www.rolno-ogrodniczy.pl");
        WebElement searchBar = driver.findElement(By.name("szukaj"));
        searchBar.sendKeys("karmnik");
        WebElement selectButton = driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr/td/div[3]/form/div/input[2]"));
        selectButton.click();
        WebElement searchBar2 = driver.findElement(By.name("szukaj"));
        searchBar2.sendKeys("teleturniej");
        WebElement selectButton2 = driver.findElement(By.cssSelector("body > div:nth-child(6) > table > tbody > tr > td > div.podmenu > form > div > input.submit"));
        selectButton2.click();
    }

    @Test
    //przyciski- odnośniki >
    public void testingPakosButton9() {
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



