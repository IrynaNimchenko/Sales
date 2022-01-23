package utils;

public class Rounder {

    private int decimalPlace;
    private double decimalValue;

    public static Double roundValue(double decimalValue, int decimalPlace) {
        double scale = Math.pow(10, decimalPlace);
        return Math.ceil(decimalValue * scale) / scale;
    }
}
