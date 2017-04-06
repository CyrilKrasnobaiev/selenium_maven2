import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class hello_world {
    public static void main(String[] args) {

        String email = "kirillk-prod33@templatemonster.me";
        String password = "opa2008";

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        //Launch website
        driver.navigate().to("https://www.templatemonster.com/");

        //Maximize the browser
        driver.manage().window().maximize();

        Set<String> oldWindows = driver.getWindowHandles(); // get windows handles before clicking

        driver.findElement(By.id("header-signin-link")).click();
        Set<String> allWindows = driver.getWindowHandles();
        allWindows.removeAll(oldWindows);
        String newWindow = allWindows.iterator().next();
        driver.switchTo().window(newWindow);


        WebElement user_email = driver.findElement(By.className("text-field__input"));

        user_email.sendKeys(email);
        driver.findElement(By.className("TMUI__TypographyText")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("id-general-password-field")));

        // Input password
        WebElement user_password = driver.findElement(By.className("id-general-password-field"));
        user_password.click();

        user_password.sendKeys(password);
        user_password.click();

        //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
}
