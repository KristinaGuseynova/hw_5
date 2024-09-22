package hw5;

import com.codeborne.selenide.DragAndDropOptions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HW5Test {

    @Test
    void openEnterprisePageTest() {
        open("https://github.com/");
        $(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        $(".font-mktg").shouldHave(text("The AI-powered developer platform."));
    }

    @Test
    void dragAndDropTest() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDrop(DragAndDropOptions.to($("#column-b")));
        //actions().moveToElement($("#column-a")).clickAndHold().moveByOffset(150, 0).release().perform();
        $("#column-a").shouldHave(text("B"));

    }


}
