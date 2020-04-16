package cuie.module07.controllibrary;

import javafx.scene.control.SkinBase;

import java.util.function.Function;

public enum SkinType {
    SLIM      (SlimSkin::new),
    LINEAR    (LinearSkin::new),
    PIE       (PieSkin::new);

    private final Function<NumberRangeControl, SkinBase<NumberRangeControl>> factory;

    SkinType(Function<NumberRangeControl, SkinBase<NumberRangeControl>> factory) {
        this.factory = factory;
    }

    public Function<NumberRangeControl, SkinBase<NumberRangeControl>> getFactory() {
        return factory;
    }

}
