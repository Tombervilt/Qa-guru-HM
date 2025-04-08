import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

/*
class RickAsltley {
    @Test
    void successfulSearchTest() {
        open("https://ru.search.yahoo.com/");
        $("[name=p]").setValue("rick astley never gonna give you up").pressEnter();
        $("[class=bgico ico ico-modern fuji-video-play]").click();
        sleep(10000);

    }

}
*/

class YahooSearchTest {
    @Test
    void successfulSearchTest() {
        open("https://ru.search.yahoo.com/");
        $("[name=p]").setValue("Джун жестко тестит прод смотреть онлайн без смс и регистрации").pressEnter();
        $("[id=bd]").shouldHave(text("rutube.ru"));
        sleep(10000);

    }

}

public class SearchTests {
    @Test
    void successfulSearchTest() {
        open("https://www.google.com/");
        $("[name=q]").setValue("selenide").pressEnter();
        $("[id=search]").shouldHave(text("https://selenide.org"));
    }
}
