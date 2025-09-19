package org.developer.patterns.solid.dependency_inversion.incorrect;

import org.developer.patterns.solid.dependency_inversion.WiredKeyboard;
import org.developer.patterns.solid.dependency_inversion.WiredMouse;

public class MacBook {
    private final WiredKeyboard keyboard;
    private final WiredMouse mouse;

    public MacBook() {
        this.keyboard = new WiredKeyboard();
        this.mouse = new WiredMouse();
    }

    /*
    Here we have coded with concrete classes instead of interfaces.
    This principle states that classes should have dependency on interfaces rather than concrete classes.
    Additionally, objects are not being injected with constructor injection instead being hardcoded here.

    Above classes should be coded to Keyboard and Mouse instead of WiredKeyboard and WiredMouse
     */
}
