package ProjectPcosTest;

import ProjectPcosPage.PacosHomePage;
import ProjectPcosPage.ShopPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

//to jest main do wywoływania klas ich atrybutów i metod,
//których działanie opisane jest tutaj
public class PacosHomeTest {

    public WebDriver chromeDriver;


    @Before
    public void SetUp()
    //otwiera stronę głowną
    {
        System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver.exe");
        chromeDriver = new ChromeDriver();
    }

    @Test
    public void HomePagePacosTesting() {
        PacosHomePage homePage = new PacosHomePage(chromeDriver);
    }

    @Test
    public void testingProductsBatton()
    //odnośniki do katalogów na stronie głównej
    {
        PacosHomePage homePage = new PacosHomePage(chromeDriver);
        String menu, menu2, detail;
        menu = "menu-item-750";
        menu2 = "/html/body/div[1]/div[2]/section/div[1]/div/div[1]/a";
        detail = "/html/body/div[1]/div[2]/section/div[6]/div/div[3]/a";
        PacosHomePage.Overlap(menu, menu2, detail);
    }

    @Test
    public void ShopTesting()
    // otwiera sklep poprzez przekierowanie w menu na stronie głownej
    {
        PacosHomePage homePage = new PacosHomePage(chromeDriver);
        homePage.driver.findElement(By.id("menu-item-1012")).click();
        ShopPage shopPage = new ShopPage(chromeDriver);
    }

    @Test
    public void GraphicTestShop()
    //przełanaczanie "ręczne" grafiki nagłowkowej
    {
        ShopPage shopPage = new ShopPage(chromeDriver);
        ShopPage.GraphicChange();
    }

    @Test
    public void SubscribeAndFaq()
    //działanie subskrybcji oraz FAQ
    {
        ShopPage shopPage = new ShopPage(chromeDriver);
        ShopPage.Subscribe();
        ShopPage.Faq();
    }

    @Test
    public void SortingShopTest()
    //sprawdza sortowanie dla róznych wyborów zakładek
    {
        ShopPage shopPage = new ShopPage(chromeDriver);

        List<WebElement> prodactBar = ShopPage.driver.findElements(By.xpath("/html/body/div[4]/table/tbody/tr/td/div[4]/div[2]/div[2]/ul/li[1]"));
        prodactBar.get(0).click();
        WebElement chwastobujcze = ShopPage.driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr/td/div[4]/div[2]/div[2]/ul/li[1]/div/p[1]/a"));
        chwastobujcze.click();
        ShopPage.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ShopPage.Sorting();

        List<WebElement> producentBar = ShopPage.driver.findElements(By.className("select-producent"));
        producentBar.get(0).click();
        WebElement adama = ShopPage.driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr/td/div[4]/div[1]/form[1]/div/select/option[2]"));
        adama.click();
        ShopPage.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ShopPage.Sorting();

        ShopPage.driver.findElement(By.cssSelector("body > div:nth-child(6) > table > tbody > tr > td > div.podstrona > div.lewa > ul > li:nth-child(1) > a")).click();
        ShopPage.Sorting();
    }

    @Test
    public void testingSearchBarShop()
    //działanie wyszykiwarki sklepowej 1. przycisk 2.enter
    {
        ShopPage shopPage = new ShopPage(chromeDriver);
        String searchOb = new String();

        searchOb = "karmnik";
        ShopPage.SrechBar(searchOb);
        searchOb = "brokuł";
        ShopPage.SrechBar(searchOb);
        searchOb = "nasiona";
        ShopPage.SrechBar(searchOb);
        searchOb = "teleturniej";
        ShopPage.SrechBar(searchOb);

        searchOb = "nasiona traw";
        ShopPage.SearchByEnter(searchOb);
        searchOb = "kiełki";
        ShopPage.SearchByEnter(searchOb);
        searchOb = "nasiona zbórz";
        ShopPage.SearchByEnter(searchOb);
        searchOb = "nasiona traf!";
        ShopPage.SearchByEnter(searchOb);
    }




}





