package ru.mineralmarket.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;


public class VipProductsPage {
    SelenideElement
            addCartButton = $("div.col-sm-6 col-xs-12", 1),
            cookieCloseButton = $("id_popup_leadscatcher_wrapper_discount_close_text")
            //popupText = $(byText("Ваш личный камень-талисман"))
    ;

    @Step("Открыть страницу каталога VIP изделий")
    public VipProductsPage openPage() {
        open("/7093-vip");
        return this;
    }

    @Step("Добавить в корзину товар")
    public void addProductToCart() {
        cookieCloseButton.click();
        addCartButton.click();
    }

  /*  @Step("Проверить отображение попапа")
    public void checkPopup() {
        popupText.shouldBe(visible);
    }

   */
}
