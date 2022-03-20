package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Заказ негативный тест")
    void generatedTest() {
        step("Открыть 'https://alfabank.ru/'", () -> {
            step("// todo: just add selenium action");
        });

        step("Кликнуть на кнопку \"Получить карту\"", () -> {
            step("// todo: just add selenium action");
        });

        step("Ввести Фамилию Имя Отчество 'Иванов Иван Иванович'", () -> {
            step("// todo: just add selenium action");
        });

        step("Ввести телефон '1234567890'", () -> {
            step("// todo: just add selenium action");
        });

        step("Ввести электронный адрес 'qwe@mail.ru'", () -> {
            step("// todo: just add selenium action");
        });

        step("Кликнуть на кнопку \"Продолжить\"", () -> {
            step("// todo: just add selenium action");
        });

        step("Проверяем оповещение \"Чтобы продолжить, необходимо ваше согласие\"", () -> {
            step("// todo: just add selenium action");
        });
    }
}