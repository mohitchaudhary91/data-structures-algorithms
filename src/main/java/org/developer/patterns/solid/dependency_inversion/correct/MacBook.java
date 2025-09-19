package org.developer.patterns.solid.dependency_inversion.correct;

import org.developer.patterns.solid.dependency_inversion.Keyboard;
import org.developer.patterns.solid.dependency_inversion.Mouse;

public class MacBook {
    private final Keyboard keyboard;
    private final Mouse mouse;

    public MacBook(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    void work() {
        keyboard.type();
        mouse.move();
    }

    /*
    This is the correct version making use of construction injection as dependency inversion.
     */
}
