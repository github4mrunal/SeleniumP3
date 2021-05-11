package watfordhousing;

import com.sun.javafx.geom.Edge;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WchtMulti {
static String browser = "chrome";
static String mainURL = "https://www.wcht.org.uk/";
static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.close();
        }
        else if (browser.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.close();
        }
        else if (browser.equalsIgnoreCase("Edge")){
            System.setProperty("webdriver.msedge.driver","drivers/msedgedriver.exe");
            driver = new EdgeDriver();
            driver.close();
        }
        else if (browser.equalsIgnoreCase("IE")){
            System.setProperty("webdriver.ie.driver","drivers/iedriver.exe");
            driver = new InternetExplorerDriver();
            driver.close();
        }
        else{
            System.out.println("Wrong browser name");
        }
        driver.get(mainURL);
    }
}
