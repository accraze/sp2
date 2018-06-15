import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTests {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/Users/t33kt33k/Downloads/geckodriver");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.seleniumhq.org");
        System.out.println(driver.getTitle());
        Thread.sleep(1000);
        driver.quit();
    }

}
