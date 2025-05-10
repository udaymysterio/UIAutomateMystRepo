package pracdemopackage;

import com.paulhammant.ngwebdriver.NgWebDriver;
import com.qount.qa.proppackage.SetupProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class PracDemoPage extends SetupProperties {
    WebDriver driver;
    FluentWait<WebDriver> wait;
    JavascriptExecutor jsDriver;
    NgWebDriver ngWebDriver;

    public PracDemoPage(WebDriver driver) {
        this.driver = driver;
        jsDriver = (JavascriptExecutor) driver;
        ngWebDriver = new NgWebDriver(jsDriver);
    }

    public void GoToPage() throws InterruptedException {
        driver.get("https://webdriveruniversity.com");
        driver.manage().window().maximize();
        Thread.sleep(4000);
    }

    public void PracWall() throws InterruptedException {
        driver.get("https://test.qount.io");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("udayandeviant@gmail.com");
        driver.findElement(By.id("input__password")).sendKeys("Qount-uday18");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(9000);
        driver.findElement(By.xpath("//span[text()='# Proposals']")).click();
        Thread.sleep(5000);
     //   driver.findElement(By.xpath("(//mat-icon[normalize-space()='home'])[1]")).click();
     //   Thread.sleep(5000);
     //   driver.findElement(By.xpath("(//div[@class='mat-mdc-menu-trigger logout-profile-badge'])[1]")).click();
     //   driver.findElement(By.xpath("(//span[contains(text(),'Sign Out')])[1]")).click();
     //   Thread.sleep(5000);
     //   driver.close();
    //    driver.quit();
    }
    public void ViewProposal() throws Exception { //InterruptedException {
        driver.findElement(By.xpath("//span[text()='# Proposals']")).click();
        Thread.sleep(5000);
    }
}

