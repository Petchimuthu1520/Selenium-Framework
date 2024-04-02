package com.web.driver.components.driver.impl;

import org.openqa.selenium.WebDriver;
import com.web.driver.components.page.PageInformationProvider;

/**
 * Retrieves information about the browser.
 *
 * @author petchimuthu1520
 * @version 1.0
 */

public final class PageInformationProviderImpl implements PageInformationProvider {

    private final WebDriver driver;

    public PageInformationProviderImpl(final WebDriver driver) {
        this.driver = driver;
    }

    /**
     * {@inheritDoc}
     *
     * @param url The URL to getWebNavigator to.
     */
    @Override
    public void get(final String url) {
        driver.get(url);
    }

    /**
     * {@inheritDoc}
     *
     * @return The current URL of the browser.
     */
    @Override
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    /**
     * {@inheritDoc}
     *
     * @return The title of the current page.
     */
    @Override
    public String getTitle() {
        return driver.getTitle();
    }

    /**
     * {@inheritDoc}
     *
     * @return The source code of the current page.
     */
    @Override
    public String getPageSource() {
        return driver.getPageSource();
    }

}
