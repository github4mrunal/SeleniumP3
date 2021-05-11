package watfordhousing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class WchtEdge {

        public static void main(String[] args) {
            String url = "https://www.wcht.org.uk/";
            System.setProperty("webdriver.msedge.driver","drivers/msedgedriver.exe");//selenium jar file , webdriver path
            //webdriver declaration
            WebDriver driver = (WebDriver) new EdgeDriver();
            /* method to open url */
            driver.get(url);
            String title = driver.getTitle();
            boolean verifyTitle = title.equals("Watford");
            boolean verifyTitlecontains = title.contains("Community Housing Homepage");
            System.out.println(verifyTitle);
            System.out.println(verifyTitlecontains);
            System.out.println(title);
            driver.manage().window().maximize();//driver to maximize window on opening
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//driver to keep window open for time

            String pagesource = driver.getPageSource();
            // System.out.println(pagesource);
            driver.close();
        }
    }

