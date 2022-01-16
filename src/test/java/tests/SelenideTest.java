package tests;

import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import page.MainPage;
import page.QuestionsPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.actions;


public class SelenideTest extends BaseTest {

    QuestionsPage questionsPage = new QuestionsPage();
    MainPage mainPage = new MainPage();

    //  Сколько это стоит? И как оплатить?
    @Test
    @Description("Проверка соответствия текста в поле: Сколько это стоит? И как оплатить?")
    @DisplayName("Сколько это стоит? И как оплатить?")
    public void howMuchDoesItCostTest() {
        mainPage.openMainPage()
                .submitCookie();
        actions().moveToElement($x("//div[@id='accordion__heading-0']")).click().perform();
        $x("//div[@id='accordion__panel-0']").shouldHave(text("Сутки — 400 рублей. Оплата курьеру — наличными или картой."));
        $x("//div[@id='accordion__panel-0']").parent().shouldHave(text("Сколько это стоит? И как оплатить?"));
    }

    //    Хочу сразу несколько самокатов! Так можно?
    @Test
    @Description("Проверка соответствия текста в поле: Хочу сразу несколько самокатов! Так можно?")
    @DisplayName("Хочу сразу несколько самокатов! Так можно?")
    public void wantSeveralScootersAtOnceTest() {
        mainPage.openMainPage()
                .submitCookie();

        actions().moveToElement($x("//div[@id='accordion__heading-1']")).click().perform();
        $x("//div[@id='accordion__panel-1']")
                .shouldHave(text("Пока что у нас так: один заказ — один самокат. " +
                        "Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."));
    }

    //  Как рассчитывается время аренды?
    @Test
    @Description("Проверка соответствия текста в поле: Как рассчитывается время аренды?")
    @DisplayName("Как рассчитывается время аренды?")
    public void howIsTheRentalTimeCalculatedTest() {
        mainPage.openMainPage()
                .submitCookie();

        actions().moveToElement($x("//div[@id='accordion__heading-2']")).click().perform();
        $x("//div[@id='accordion__panel-2']")
                .shouldHave(text("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня." +
                        " Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру." +
                        " Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."));
    }

    //    Можно ли заказать самокат прямо на сегодня?
    @Test
    @Description("Проверка соответствия текста в поле: Можно ли заказать самокат прямо на сегодня?")
    @DisplayName("Можно ли заказать самокат прямо на сегодня?")
    public void isItPossibleToOrderScooterRightForTodayTest() {
        mainPage.openMainPage()
                .submitCookie();

        actions().moveToElement($x("//div[@id='accordion__heading-3']")).click().perform();
        $x("//div[@id='accordion__panel-3']")
                .shouldHave(text("Только начиная с завтрашнего дня. Но скоро станем расторопнее."));
    }

    //    Можно ли продлить заказ или вернуть самокат раньше?
    @Test
    @Description("Проверка соответствия текста в поле: Можно ли продлить заказ или вернуть самокат раньше?")
    @DisplayName("Можно ли продлить заказ или вернуть самокат раньше?")
    public void isItPossibleToExtendTheOrderTest() {
        mainPage.openMainPage()
                .submitCookie();

        actions().moveToElement($x("//div[@id='accordion__heading-4']")).click().perform();
        $x("//div[@id='accordion__panel-4']")
                .shouldHave(text("Пока что нет! Но если что-то срочное — " +
                        "всегда можно позвонить в поддержку по красивому номеру 1010."));
    }

    //    Вы привозите зарядку вместе с самокатом?
    @Test
    @Description("Проверка соответствия текста в поле: Вы привозите зарядку вместе с самокатом?")
    @DisplayName("Вы привозите зарядку вместе с самокатом?")
    public void doYouBringChargingAlongWithTheScooterTest() {
        mainPage.openMainPage()
                .submitCookie();

        actions().moveToElement($x("//div[@id='accordion__heading-5']")).click().perform();
        $x("//div[@id='accordion__panel-5']")
                .shouldHave(text("Самокат приезжает к вам с полной зарядкой. " +
                        "Этого хватает на восемь суток — даже если будете кататься без передышек и во сне." +
                        " Зарядка не понадобится."));
    }

    //    Можно ли отменить заказ?
    @Test
    @Description("Проверка соответствия текста в поле: Можно ли отменить заказ?")
    @DisplayName("Можно ли отменить заказ?")
    public void isItPossibleToCancelTheOrderTest() {
        mainPage.openMainPage()
                .submitCookie();

        actions().moveToElement($x("//div[@id='accordion__heading-6']")).click().perform();
        $x("//div[@id='accordion__panel-6']")
                .shouldHave(text("Да, пока самокат не привезли. Штрафа не будет, " +
                        "объяснительной записки тоже не попросим. Все же свои."));
    }

    //    Я живу за МКАДом, привезёте?
    @Test
    @Description("Проверка соответствия текста в поле: Я живу за МКАДом, привезёте?")
    @DisplayName("Я живу за МКАДом, привезёте?")
    public void willYouBringMeTest() {
        mainPage.openMainPage()
                .submitCookie();

        actions().moveToElement($x("//div[@id='accordion__heading-7']")).click().perform();
        $x("//div[@id='accordion__panel-7']")
                .shouldHave(text("Да, обязательно. Всем самокатов! И Москве, и Московской области."));
    }
}
