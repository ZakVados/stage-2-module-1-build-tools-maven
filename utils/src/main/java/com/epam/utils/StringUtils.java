package com.epam.utils;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.regex.*;
public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (str == null) return false;
        Pattern pattern = Pattern.compile("0\\d+");
        if (pattern.matcher(str).matches()) return false;
        NumberFormat format = NumberFormat.getInstance();
        try {
            Number value = format.parse(str);
            return (value.floatValue() > 0);
        } catch (ParseException e) {
            return false;
        }
    }
}
