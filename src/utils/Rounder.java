package utils;

import java.text.DecimalFormat;

public class Rounder {

    public static String roundValue(double decimalValue) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return decimalFormat.format(decimalValue);
    }
}
