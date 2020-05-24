package top.nintha.json;

import java.util.HashMap;

public class JsonNumber implements JsonValue {
    private double value = 0.0;

    public JsonNumber(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}