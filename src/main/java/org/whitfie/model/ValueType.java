package org.whitfie.model;

public enum ValueType {
    POSITIVE,
    NEGATIVE;


    public static ValueType getType(int value) {
        if (value < 0) {
            return NEGATIVE;
        }

        return POSITIVE;
    }
}
