package cloud.autotests.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Description;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Checking change Titles EN version")
    @DisplayName("Beresnev")
    void titleENTestBeresnev() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Открыть 'https://beresnev.games/en'", () -> {
            open("/en");
            sleep(200);
        });

        step("Провкручиваем страницу вниз через специальную кнопку", () -> {
            $("[class=BtnScroll_box__3XQTk]", 0).click();
        });

            step("Проверяем корректность написания заголовка Our games", () -> {
            $("[class='text--h2 text--center']", 0).shouldHave(text("Our games"));
        });


        step("Проверяем корректность написания заголовка We’re hiring", () -> {
            $("[class='text--h2 text--center']", 1).scrollIntoView(false).shouldHave(text("We’re hiring"));
        });

        step("Провкручиваем страницу вверх через специальную кнопку", () -> {
            $("[class=BtnScroll_box__3XQTk]", 1).click();
        });
    }


    @Test
    @Description("Checking change Titles Cz version")
    @DisplayName("Beresnev")
    void titleCZTestBeresnev() {
        step("Открыть 'https://beresnev.games/cz'", () -> {
            open("/cz");
            sleep(200);
        });

        step("Провкручиваем страницу вниз через специальную кнопку", () -> {
            $("[class=BtnScroll_box__3XQTk]", 0).click();
        });

        step("Проверяем корректность написания заголовка Naše hry", () -> {
            $("[class='text--h2 text--center']", 0).shouldHave(text("Naše hry"));
        });


        step("Проверяем корректность написания заголовка Volná pracovní místa", () -> {
            $("[class='text--h2 text--center']", 1).scrollIntoView(false).shouldHave(text("Volná pracovní místa"));
        });

        step("Провкручиваем страницу вверх через специальную кнопку", () -> {
            $("[class=BtnScroll_box__3XQTk]", 1).click();
        });
    }

    @Test
    @Description("Checking change Titles Ru version")
    @DisplayName("Beresnev")
    void titleRUTestBeresnev() {
        step("Открыть 'https://beresnev.games/ru'", () -> {
            open("/ru");
            sleep(200);
        });

        step("Провкручиваем страницу вниз через специальную кнопку", () -> {
            $("[class=BtnScroll_box__3XQTk]", 0).click();
        });

        step("Проверяем корректность написания заголовка Наши игры", () -> {
            $("[class='text--h2 text--center']", 0).shouldHave(text("Наши игры"));
        });


        step("Проверяем корректность написания заголовка Открытые вакансии", () -> {
            $("[class='text--h2 text--center']", 1).scrollIntoView(false).shouldHave(text("Открытые вакансии"));
        });

        step("Провкручиваем страницу вверх через специальную кнопку", () -> {
            $("[class=BtnScroll_box__3XQTk]", 1).click();
        });
    }

    @Test
    @Description("Checking change Titles Ru version")
    @DisplayName("Beresnev")
    void titleRUTestBeresnevVoc() {
        step("Переходим на вкладку с вакансиями (RU) 'https://beresnev.games/ru'", () -> {
            open("/ru/careers");
            sleep(200);
        });

        step("Проверяем Проверяем правильность написания заголовка Вакансии", () -> {
            $("[class=text--h1]").shouldHave(text("Вакансии"));
        });
    }

    @Test
    @Description("Checking change Titles Ru version")
    @DisplayName("Beresnev")
    void titleRUTestBeresnevAbo() {
        step("Переходим на вкладку с вакансиями (RU) 'https://beresnev.games/ru'", () -> {
            open("/ru/about");
            sleep(200);
        });

        step("Проверяем Проверяем правильность написания заголовка О нас", () -> {
            $("[class=text--h1]").shouldHave(text("О нас"));
        });
    }

    @Test
    @Description("Checking change Titles CZ version")
    @DisplayName("Beresnev")
    void titleCZTestBeresnevVoc() {
        step("Переходим на вкладку с вакансиями (CZ) 'https://beresnev.games/cz'", () -> {
            open("/cz/careers");
            sleep(200);
        });

        step("Проверяем Проверяем правильность написания заголовка Вакансии", () -> {
            $("[class=text--h1]").shouldHave(text("Volná místa"));
        });
    }

    @Test
    @Description("Checking change Titles Cz version")
    @DisplayName("Beresnev")
    void titleCZTestBeresnevAbo() {
        step("Переходим на вкладку с вакансиями (CZ) 'https://beresnev.games/cz'", () -> {
            open("/cz/about");
            sleep(200);
        });

        step("Проверяем Проверяем правильность написания заголовка О нас", () -> {
            $("[class=text--h1]").shouldHave(text("O nás"));
        });


    }

    @Test
    @Description("Checking change Titles EN version")
    @DisplayName("Beresnev")
    void titleENTestBeresnevVoc() {
        step("Переходим на вкладку с вакансиями (EN) 'https://beresnev.games/en'", () -> {
            open("/en/careers");
            sleep(200);
        });

        step("Проверяем Проверяем правильность написания заголовка Вакансии", () -> {
            $("[class=text--h1]").shouldHave(text("Careers"));
        });
    }

    @Test
    @Description("Checking change Titles Cz version")
    @DisplayName("Beresnev")
    void titleENTestBeresnevAbo() {
        step("Переходим на вкладку с вакансиями (EN) 'https://beresnev.games/en'", () -> {
            open("/en/about");
            sleep(200);
        });

        step("Проверяем Проверяем правильность написания заголовка О нас", () -> {
            $("[class=text--h1]").shouldHave(text("About us"));
        });


    }


}