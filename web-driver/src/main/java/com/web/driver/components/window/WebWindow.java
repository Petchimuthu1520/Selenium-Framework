package com.web.driver.components.window;

import org.openqa.selenium.WebDriver;
import com.web.driver.components.driver.impl.WebWindowImpl;

/**
 * <p>
 * Interacts with the browser getWebWindowHandler.
 * </p>
 *
 * @author petchimuthu1520
 * @version 1.0
 */
public interface WebWindow {

    static WebWindow getInstance(final WebDriver.Window window) {
        return new WebWindowImpl(window);
    }

    /**
     * <p>
     * Maximizes the browser getWebWindowHandler.
     * </p>
     */
    void maximize();

    /**
     * <p>
     * Minimizes the browser getWebWindowHandler.
     * </p>
     */
    void minimize();

    /**
     * <p>
     * Switches the browser getWebWindowHandler to fullscreen mode.
     * </p>
     */
    void fullscreen();

}
