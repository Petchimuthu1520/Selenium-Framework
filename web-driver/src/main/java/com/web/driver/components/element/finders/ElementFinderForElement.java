package com.web.driver.components.element.finders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.web.driver.components.element.impl.WebPageElementImpl;
import com.web.driver.components.element.service.WebPageElement;

import java.util.Collection;

/**
 * Represents an ElementFinder specifically for a WebElement.
 *
 * @author petchimuthu1520
 * @version 1.0
 */
public final class ElementFinderForElement extends AbstractElementFinder {
    private final WebElement element;

    public ElementFinderForElement(final WebElement element) {
        this.element = element;
    }

    /**
     *{@inheritDoc}
     *
     * @param by The By locator used to getElementFinder elements within the WebElement.
     * @return A collection of WebPageElement representing the found elements.
     */
    @Override
    public Collection<WebPageElement> findElements(final By by) {
        return getCommonElements(element.findElements(by));
    }

    /**
     *{@inheritDoc}
     *
     * @param by The By locator used to getElementFinder the element within the WebElement.
     * @return The WebPageElement representing the found element.
     */
    @Override
    public WebPageElement findElement(final By by) {
        return new WebPageElementImpl(element.findElement(by));
    }

}
