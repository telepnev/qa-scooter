package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class QuestionsPage {
    DataQuestion dataQuestion = new DataQuestion();

    //    Сколько это стоит? И как оплатить?
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__heading-0']")
    private SelenideElement clickByHowMuchDoesItCost;
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__panel-0']")
    private SelenideElement locatorByHowMuchDoesItCost;

    //    Хочу сразу несколько самокатов! Так можно?
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__heading-1']")
    private SelenideElement clickByWantSeveralScootersAtOnce;
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__panel-1']")
    private SelenideElement locatorWantSeveralScootersAtOnce;

    //  Как рассчитывается время аренды?
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__heading-2']")
    private SelenideElement clickByHowIsTheRentalTimeCalculated;
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__panel-2']")
    private SelenideElement locatorHowIsTheRentalTimeCalculated;

    //    Можно ли заказать самокат прямо на сегодня?
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__heading-3']")
    private SelenideElement clickByIsItPossibleToOrderScooterRightForToday;
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__panel-3']")
    private SelenideElement locatorIsItPossibleToOrderScooterRightForToday;

    //    Можно ли продлить заказ или вернуть самокат раньше?
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__heading-4']")
    private SelenideElement clickByIsItPossibleToExtendTheOrder;
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__panel-4']")
    private SelenideElement locatorIsItPossibleToExtendTheOrder;

    //    Вы привозите зарядку вместе с самокатом?
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__heading-5']")
    private SelenideElement clickByDoYouBringCharging;
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__panel-5']")
    private SelenideElement locatorDoYouBringCharging;

    //    Можно ли отменить заказ?
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__heading-6']")
    private SelenideElement clickByIsItPossibleToCancelTheOrder;
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__panel-6']")
    private SelenideElement locatorIsItPossibleToCancelTheOrder;

    //    Я живу за МКАДом, привезёте?
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__heading-7']")
    private SelenideElement clickByWillYouBringMe;
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__panel-7']")
    private SelenideElement locatorWillYouBringMe;

    //    Я живу за МКАДом, привезёте?
    public QuestionsPage clickByWillYouBringMe() {
        actions().moveToElement(clickByWillYouBringMe).click().perform();
        return this;
    }
    public String getTextWillYouBringMe() {
        return locatorWillYouBringMe.getText();
    }

    //    Можно ли отменить заказ?
    public QuestionsPage clickByIsItPossibleToCancelTheOrder() {
        actions().moveToElement(clickByIsItPossibleToCancelTheOrder).click().perform();
        return this;
    }
    public String getTextIsItPossibleToCancelTheOrder() {
        return locatorIsItPossibleToCancelTheOrder.getText();
    }

    //    Вы привозите зарядку вместе с самокатом?
    public QuestionsPage clickByDoYouBringCharging() {
        actions().moveToElement(clickByDoYouBringCharging).click().perform();
        return this;
    }
    public String getTextDoYouBringCharging() {
        return locatorDoYouBringCharging.getText();
    }


    //    Можно ли продлить заказ или вернуть самокат раньше?
    public QuestionsPage clickByIsItPossibleToExtendTheOrder() {
        actions().moveToElement(clickByIsItPossibleToExtendTheOrder).click().perform();
        return this;
    }
    public String getTextIsItPossibleToExtendTheOrder() {
        return locatorIsItPossibleToExtendTheOrder.getText();
    }


    //    Можно ли заказать самокат прямо на сегодня?
    public QuestionsPage clickByIsItPossibleToOrderScooterRightForToday() {
        actions().moveToElement(clickByIsItPossibleToOrderScooterRightForToday).click().perform();
        return this;
    }
    public String getTextIsItPossibleToOrderScooterRightForToday() {
        return locatorIsItPossibleToOrderScooterRightForToday.getText();
    }


    //  Как рассчитывается время аренды?
    public QuestionsPage clickByHowIsTheRentalTimeCalculated() {
        actions().moveToElement(clickByHowIsTheRentalTimeCalculated).click().perform();
        return this;
    }
    public String getTextHowIsTheRentalTimeCalculated() {
        return locatorHowIsTheRentalTimeCalculated.getText();
    }


    //    Сколько это стоит? И как оплатить?
    public QuestionsPage clickByHowMuchDoesItCost() {
        actions().moveToElement(clickByHowMuchDoesItCost).click().perform();
        return this;
    }
    public String getTextHowMuchDoesItCost() {
        return locatorByHowMuchDoesItCost.getText();
    }

    //    Хочу сразу несколько самокатов! Так можно?
    public QuestionsPage clickByWantSeveralScootersAtOnce() {
        actions().moveToElement(clickByWantSeveralScootersAtOnce).click().perform();
        return this;
    }
    public String getTextWantSeveralScootersAtOnce() {
        return locatorWantSeveralScootersAtOnce.getText();
    }

}

