package com.web.driver.components.element.finders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.web.driver.components.element.impl.WebPageElementImpl;
import com.web.driver.components.element.service.WebPageElement;

import java.util.Collection;

/**
 * Represents an ElementFinder specifically for WebDriver.
 *
 * @author petchimuthu1520
 * @version 1.0
 */
public final class ElementFinderForDriver extends AbstractElementFinder {

    private final WebDriver driver;

    public ElementFinderForDriver(final WebDriver driver) {
        this.driver = driver;
    }

    /**
     * {@inheritDoc}
     *
     * @param by The By locator used to getElementFinder elements.
     * @return A collection of WebPageElement representing the found elements.
     */
    @Override
    public Collection<WebPageElement> findElements(final By by) {
        return getCommonElements(driver.findElements(by));
    }

    /**
     *{@inheritDoc}
     *
     * @param by The By locator used to getElementFinder the element.
     * @return The WebPageElement representing the found element.
     */
    @Override
    public WebPageElement findElement(final By by) {

        return new WebPageElementImpl(driver.findElement(by));
    }

}
