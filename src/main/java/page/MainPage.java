package page;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    public MainPage openMainPage() {
        open("https://qa-scooter.praktikum-services.ru/");
        $x("//div[@class='Header_Disclaimer__3VEni']").shouldHave(Condition.text("Учебный тренажер"));
        return this;
    }

    public MainPage submitCookie() {
        boolean element = $x("//button[@id='rcc-confirm-button']").exists();
        if (element == true) {
            $x("//button[@id='rcc-confirm-button']").click();
        } else {
            System.out.println("Кнопка 'Да все привыкли' не найдена!");
        }
        return this;
    }
}
