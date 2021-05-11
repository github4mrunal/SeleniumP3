package watfordhousing;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class WchtIE {

        public static void main(String[] args) {
            String url = "https://www.wcht.org.uk/";
            System.setProperty("webdriver.ie.driver","drivers/iedriver.exe");//selenium jar file , webdriver path
            //webdriver declaration
            WebDriver driver = (WebDriver) new InternetExplorerDriver();
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

