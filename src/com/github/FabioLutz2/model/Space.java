package com.github.FabioLutz2.model;

public class Space {
    private final int expected;
    private int actual;
    private final boolean isFixed;

    public Space(int expected, boolean isFixed) {
        this.expected = expected;
        this.isFixed = isFixed;

        if (isFixed) {
            actual = expected;
        } else {
            actual = 0;
        }
    }

    public int getExpected() {
        return expected;
    }

    public int getActual() {
        return actual;
    }

    public boolean setValue(int value) {
        if (isFixed) return false;

        this.actual = value;
        return true;
    }

    public boolean isFixed() {
        return isFixed;
    }
}
