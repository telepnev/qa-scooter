package model;

import static com.codeborne.selenide.Selenide.$x;

public class QuestionsAboutImportant {

//    Сколько это стоит? И как оплатить?
    private String ClickByHowMuchDoesItCost = "//div[@id='accordion__heading-0']";
//    private  String HowMuchDoesItCost = "Сутки — 400 рублей. " +
//            "Оплата курьеру — наличными или картой.";
//   Хочу сразу несколько самокатов! Так можно?
    private String IWantSeveralScootersAtOnce = "Пока что у нас так: один заказ — один самокат. " +
            "Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
//   Как рассчитывается время аренды?
    private String HowIsTheRentalTimeCalculated = "Допустим, вы оформляете заказ на 8 мая." +
            " Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру." +
            " Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
//    Можно ли заказать самокат прямо на сегодня?
    private String IsItPossibleToOrderScooterRightForToday = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
//  Можно ли продлить заказ или вернуть самокат раньше?
    private String IsItPossibleToExtendTheOrder = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
//    Вы привозите зарядку вместе с самокатом?
    private String DoYouBringChargingAlongWithTheScooter = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — " +
            "даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
//    Можно ли отменить заказ?
    private String IsItPossibleToCancelTheOrder = "Да, пока самокат не привезли. Штрафа не будет, " +
            "объяснительной записки тоже не попросим. Все же свои.";
    //    Я живу за МКАДом, привезёте?
    private String WillYouBringMe = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

    public String getClickByHowMuchDoesItCost() {
        return ClickByHowMuchDoesItCost;
    }

    public String getIWantSeveralScootersAtOnce() {
        return IWantSeveralScootersAtOnce;
    }

    public String getHowIsTheRentalTimeCalculated() {
        return HowIsTheRentalTimeCalculated;
    }

    public String getIsItPossibleToOrderScooterRightForToday() {
        return IsItPossibleToOrderScooterRightForToday;
    }

    public String getIsItPossibleToExtendTheOrder() {
        return IsItPossibleToExtendTheOrder;
    }

    public String getDoYouBringChargingAlongWithTheScooter() {
        return DoYouBringChargingAlongWithTheScooter;
    }

    public String getIsItPossibleToCancelTheOrder() {
        return IsItPossibleToCancelTheOrder;
    }

    public String getWillYouBringMe() {
        return WillYouBringMe;
    }

    public void submitCookie() {
        boolean element = $x("//button[@id='rcc-confirm-button']").exists();
        if (element == true) {
            $x("//button[@id='rcc-confirm-button']").click();
        }
        }
    }

