package com.frameworkium.integration.seleniumhq.pages;

import com.frameworkium.core.ui.annotations.Visible;
import com.frameworkium.core.ui.pages.BasePage;
import com.frameworkium.core.ui.pages.PageFactory;
import com.frameworkium.integration.seleniumhq.components.NavBar;
import org.openqa.selenium.support.CacheLookup;

public class HomePage extends BasePage<HomePage> {

    @CacheLookup
    @Visible
    private NavBar navBar;

    public static HomePage open() {
        return PageFactory.newInstance(
                HomePage.class,
                "https://selenium.dev/");
    }

    public NavBar getNavBar() {
        return navBar;
    }
}
