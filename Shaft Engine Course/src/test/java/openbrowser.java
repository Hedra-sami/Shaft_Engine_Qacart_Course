import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class openbrowser {
    @Test
    public void openchromebrowser(){
        String url = "https://the-internet.herokuapp.com/";
        SHAFT.GUI.WebDriver driver = new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL(url);
        driver.assertThat().browser().title().equals("The Internet");




        // Login Elements
        By basicauthbutton = By.linkText("Form Authentication");
        By loginpage = By.xpath("/html/body/div[2]/div/div/h2");
        By usernamefield = By.id("username");
        By passwordfield = By.id("password");
        By loginbutton = By.cssSelector("[type=submit]");

        // dropdown Elements
        By dropdownlist = By.linkText("Dropdown");
        By dropdownfield = By.id("dropdown");

        // Dynamic Loading Page for waits Elements
        By dynamicloadingpage = By.linkText("Dynamic Loading");
        By example1 = By.linkText("Example 1: Element on page that is hidden");
        By startbutton = By.xpath("//*[@id=\"start\"]/button");
        By finish = By.id("finish");


        // Login Actions
        driver.element().click(basicauthbutton);
        driver.assertThat().element(loginpage).text().equals("Login Page");

        driver.element().type(usernamefield,"Hedra Sami");
        driver.element().type(passwordfield,"983757935");
        driver.element().click(loginbutton);

        // Return to main page
        driver.browser().navigateToURL(url);


        // Dropdown Actions
        driver.element().click(dropdownlist);
        driver.element().select(dropdownfield,"Option 1");

        // Return to main page
        driver.browser().navigateToURL(url);

        // Dynamic Loading Page Actions
        driver.element().click(dynamicloadingpage);
        driver.element().click(example1);
        driver.element().click(startbutton);
        driver.assertThat().element(finish).exists();


    }
}
