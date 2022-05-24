package tests;

import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

@Tag("selenide")
public class AndroidSelenideLastVersionAppWikiTests extends TestBase {
    @Test
    @DisplayName("Search in wiki(uploaded version)")
    void searchTest() {
        step("Skip welcome window", () ->
                $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_skip_button")).click());
        step("Type search", () -> {
            $(MobileBy.AccessibilityId("Search Wikipedia")).click();
            $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")).setValue("BrowserStack");
        });
        step("Verify content found", () ->
                $$(byClassName("android.widget.TextView")).shouldHave(sizeGreaterThan(0)));
    }
}
