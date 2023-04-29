package com.ecommercearchitect.designpatterns.builder.ImmutableExample;

public class ImmutableObject {
    private final int value1;
    private final int value2;
    private final String value3;

    private ImmutableObject(int value1, int value2, String value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public int getValue1() {
        return value1;
    }

    public int getValue2() {
        return value2;
    }

    public String getValue3() {
        return value3;
    }

    public static class Builder {
        private final int value1;
        private final int value2;
        private String value3;

        public Builder(int value1, int value2) {
            this.value1 = value1;
            this.value2 = value2;
        }

        public Builder value3(String value3) {
            this.value3 = value3;
            return this;
        }

        public ImmutableObject build() {
            return new ImmutableObject(value1, value2, value3);
        }
    }
}
