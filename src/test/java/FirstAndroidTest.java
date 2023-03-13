import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

public class FirstAndroidTest {

    AppiumDriver driver;

    @BeforeTest
    public void setUp(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platform","Android");
        caps.setCapability("automationName","UiAutomator2");
        caps.




    }

}
