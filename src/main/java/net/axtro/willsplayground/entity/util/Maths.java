package net.axtro.willsplayground.entity.util;

public class Maths {
    public static final float QUARTER_PI = ((float)Math.PI / 4F);

    public static final float STARTING_ANGLE = 0.0174532925F;
    public static final float THREE_STARTING_ANGLE = STARTING_ANGLE * 3;
    public static final float EIGHT_STARTING_ANGLE = STARTING_ANGLE * 8;

    public static float rad(final double deg) {
        return (float) Math.toRadians(deg);
    }
}
