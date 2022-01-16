import model.QuestionsAboutImportant;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class SelenideTest extends BaseTest {

    QuestionsAboutImportant questionsAboutImportant = new QuestionsAboutImportant();

    //  Сколько это стоит? И как оплатить?
    @Test
    public void howMuchDoesItCostTest() {
        open("https://qa-scooter.praktikum-services.ru/");
        questionsAboutImportant.submitCookie();
        actions().moveToElement($x("//div[@id='accordion__heading-0']")).click().perform();
        $x("//div[@id='accordion__panel-0']").shouldHave(text("Сутки — 400 рублей. Оплата курьеру — наличными или картой."));
        $x("//div[@id='accordion__panel-0']").parent().shouldHave(text("Сколько это стоит? И как оплатить?"));
    }

    //    Хочу сразу несколько самокатов! Так можно?
    @Test
    public void wantSeveralScootersAtOnceTest() {
        open("https://qa-scooter.praktikum-services.ru/");
//        $x("//button[@id='rcc-confirm-button']").click();
        questionsAboutImportant.submitCookie();

        actions().moveToElement($x("//div[@id='accordion__heading-1']")).click().perform();
        $x("//div[@id='accordion__panel-1']")
                .shouldHave(text("Пока что у нас так: один заказ — один самокат. " +
                        "Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."));
    }

    //  Как рассчитывается время аренды?
    @Test
    public void howIsTheRentalTimeCalculatedTest() {
        open("https://qa-scooter.praktikum-services.ru/");
//        $x("//button[@id='rcc-confirm-button']").click();
        questionsAboutImportant.submitCookie();

        actions().moveToElement($x("//div[@id='accordion__heading-2']")).click().perform();
        $x("//div[@id='accordion__panel-2']")
                .shouldHave(text("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня." +
                        " Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру." +
                        " Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."));
    }

    //    Можно ли заказать самокат прямо на сегодня?
    @Test
    public void isItPossibleToOrderScooterRightForTodayTest() {
        open("https://qa-scooter.praktikum-services.ru/");
//        $x("//button[@id='rcc-confirm-button']").click();
        questionsAboutImportant.submitCookie();

        actions().moveToElement($x("//div[@id='accordion__heading-3']")).click().perform();
        $x("//div[@id='accordion__panel-3']")
                .shouldHave(text("Только начиная с завтрашнего дня. Но скоро станем расторопнее."));
    }

    //    Можно ли продлить заказ или вернуть самокат раньше?
    @Test
    public void isItPossibleToExtendTheOrderTest() {
        open("https://qa-scooter.praktikum-services.ru/");
//        $x("//button[@id='rcc-confirm-button']").click();
        questionsAboutImportant.submitCookie();

        actions().moveToElement($x("//div[@id='accordion__heading-4']")).click().perform();
        $x("//div[@id='accordion__panel-4']")
                .shouldHave(text("Пока что нет! Но если что-то срочное — " +
                        "всегда можно позвонить в поддержку по красивому номеру 1010."));
    }

    //    Вы привозите зарядку вместе с самокатом?
    @Test
    public void doYouBringChargingAlongWithTheScooterTest() {
        open("https://qa-scooter.praktikum-services.ru/");
//        $x("//button[@id='rcc-confirm-button']").click();
        questionsAboutImportant.submitCookie();

        actions().moveToElement($x("//div[@id='accordion__heading-5']")).click().perform();
        $x("//div[@id='accordion__panel-5']")
                .shouldHave(text("Самокат приезжает к вам с полной зарядкой. " +
                        "Этого хватает на восемь суток — даже если будете кататься без передышек и во сне." +
                        " Зарядка не понадобится."));
    }

    //    Можно ли отменить заказ?
    @Test
    public void isItPossibleToCancelTheOrderTest() {
        open("https://qa-scooter.praktikum-services.ru/");
//        $x("//button[@id='rcc-confirm-button']").click();
        questionsAboutImportant.submitCookie();

        actions().moveToElement($x("//div[@id='accordion__heading-6']")).click().perform();
        $x("//div[@id='accordion__panel-6']")
                .shouldHave(text("Да, пока самокат не привезли. Штрафа не будет, " +
                        "объяснительной записки тоже не попросим. Все же свои."));
    }

    //    Я живу за МКАДом, привезёте?
    @Test
    public void willYouBringMeTest() {
        open("https://qa-scooter.praktikum-services.ru/");
//        $x("//button[@id='rcc-confirm-button']").click();
        questionsAboutImportant.submitCookie();

        actions().moveToElement($x("//div[@id='accordion__heading-7']")).click().perform();
        $x("//div[@id='accordion__panel-7']")
                .shouldHave(text("Да, обязательно. Всем самокатов! И Москве, и Московской области."));
    }

}
