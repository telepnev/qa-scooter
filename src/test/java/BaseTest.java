import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


public class BaseTest {
    @BeforeEach
     void beforeAll() {
        Configuration.startMaximized = true;

    }

    @AfterEach
    void tearDown() {
        Selenide.closeWebDriver();
    }
}
