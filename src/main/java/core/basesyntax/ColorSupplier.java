package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLORS_COUNT = Colors.values().length;
    private final Random random = new Random();

    public Colors getRandomColor() {
        int color = random.nextInt(COLORS_COUNT);
        return Colors.values()[color];
    }

}
