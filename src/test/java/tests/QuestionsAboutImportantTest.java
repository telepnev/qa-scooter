package tests;

import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import page.DataQuestion;
import page.MainPage;
import page.QuestionsPage;

import static com.codeborne.selenide.Selenide.page;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuestionsAboutImportantTest extends BaseTest {

    MainPage mainPage = new MainPage();
    DataQuestion dataQuestion = new DataQuestion();
    QuestionsPage questionsPage = page(QuestionsPage.class);


    //    Сколько это стоит? И как оплатить?
    @Test
    @Description("Проверка соответствия текста в поле: Сколько это стоит? И как оплатить?")
    @DisplayName("Сколько это стоит? И как оплатить?")
    void howMuchDoesItCostTest() {
        mainPage
                .openMainPage()
                .submitCookie();
        questionsPage
                .clickByHowMuchDoesItCost();
        String actualTextHowMuchDoesItCost = questionsPage.getTextHowMuchDoesItCost();

        assertEquals(dataQuestion.getHowMuchDoesItCost(),
                actualTextHowMuchDoesItCost,
                "Текст не совпадает");
    }

    //    Хочу сразу несколько самокатов! Так можно?
    @Test
    @Description("Проверка соответствия текста в поле: Хочу сразу несколько самокатов! Так можно?")
    @DisplayName("Хочу сразу несколько самокатов! Так можно?")
    public void wantSeveralScootersAtOnceTest() {
        mainPage.openMainPage()
                .submitCookie();
        questionsPage
                .clickByWantSeveralScootersAtOnce();
        String actualTextWantSeveralScootersAtOnce = questionsPage.getTextWantSeveralScootersAtOnce();

        assertEquals(dataQuestion.getIWantSeveralScootersAtOnce(),
                actualTextWantSeveralScootersAtOnce,
                "Текст не совпадает");
    }

    //  Как рассчитывается время аренды?
    @Test
    @Description("Проверка соответствия текста в поле: Как рассчитывается время аренды?")
    @DisplayName("Как рассчитывается время аренды?")
    public void howIsTheRentalTimeCalculatedTest() {
        mainPage.openMainPage()
                .submitCookie();
        questionsPage
                .clickByHowIsTheRentalTimeCalculated();
        String actualTextHowIsTheRentalTimeCalculated = questionsPage.getTextHowIsTheRentalTimeCalculated();

        assertEquals(dataQuestion.getHowIsTheRentalTimeCalculated(),
                actualTextHowIsTheRentalTimeCalculated,
                "Текст не совпадает");
    }

    //    Можно ли заказать самокат прямо на сегодня?
    @Test
    @Description("Проверка соответствия текста в поле: Можно ли заказать самокат прямо на сегодня?")
    @DisplayName("Можно ли заказать самокат прямо на сегодня?")
    public void isItPossibleToOrderScooterRightForTodayTest() {
        mainPage.openMainPage()
                .submitCookie();
        questionsPage
                .clickByIsItPossibleToOrderScooterRightForToday();
        String actualTextIsItPossibleToOrderScooterRightForToday = questionsPage.getTextIsItPossibleToOrderScooterRightForToday();

        assertEquals(dataQuestion.getIsItPossibleToOrderScooterRightForToday(),
                actualTextIsItPossibleToOrderScooterRightForToday,
                "Текст не совпадает");
    }

    //    Можно ли продлить заказ или вернуть самокат раньше?
    @Test
    @Description("Проверка соответствия текста в поле: Можно ли продлить заказ или вернуть самокат раньше?")
    @DisplayName("Можно ли продлить заказ или вернуть самокат раньше?")
    public void isItPossibleToExtendTheOrderTest() {
        mainPage.openMainPage()
                .submitCookie();
        questionsPage
                .clickByIsItPossibleToExtendTheOrder();
        String actualTextIsItPossibleToExtendTheOrder = questionsPage.getTextIsItPossibleToExtendTheOrder();

        assertEquals(dataQuestion.getIsItPossibleToExtendTheOrder(),
                actualTextIsItPossibleToExtendTheOrder,
                "Текст не совпадает");
    }

    //    Вы привозите зарядку вместе с самокатом?
    @Test
    @Description("Проверка соответствия текста в поле: Вы привозите зарядку вместе с самокатом?")
    @DisplayName("Вы привозите зарядку вместе с самокатом?")
    public void doYouBringChargingAlongWithTheScooterTest() {
        mainPage.openMainPage()
                .submitCookie();
        questionsPage
                .clickByDoYouBringCharging();

        String actualTextDoYouBringCharging = questionsPage.getTextDoYouBringCharging();
        assertEquals(dataQuestion.getDoYouBringCharging(),
                actualTextDoYouBringCharging,
                "Текст не совпадает");
    }

    //    Можно ли отменить заказ?
    @Test
    @Description("Проверка соответствия текста в поле: Можно ли отменить заказ?")
    @DisplayName("Можно ли отменить заказ?")
    public void isItPossibleToCancelTheOrderTest() {
        mainPage.openMainPage()
                .submitCookie();
        questionsPage
                .clickByIsItPossibleToCancelTheOrder();
        String actualTextIsItPossibleToCancel = questionsPage.getTextIsItPossibleToCancelTheOrder();
        assertEquals(dataQuestion.getIsItPossibleToCancelTheOrder(),
                actualTextIsItPossibleToCancel,
                "Текст не совпадает");

    }

    //    Я живу за МКАДом, привезёте?
    @Test
    @Description("Проверка соответствия текста в поле: Я живу за МКАДом, привезёте?")
    @DisplayName("Я живу за МКАДом, привезёте?")
    public void willYouBringMeTest() {
        mainPage.openMainPage()
                .submitCookie();
        questionsPage
                .clickByWillYouBringMe();
        String actualTextWillYouBringMe = questionsPage.getTextWillYouBringMe();
        assertEquals(dataQuestion.getWillYouBringMe(),
                actualTextWillYouBringMe,
                "Текст не совпадает");
    }
}
