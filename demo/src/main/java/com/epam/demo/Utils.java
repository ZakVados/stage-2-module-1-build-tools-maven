package com.epam.demo;

import java.util.List;
import static com.epam.utils.StringUtils.isPositiveNumber;


public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
       //magic happens here
        if (args == null) return false;
        for (String str : args) {
            if (isPositiveNumber(str) == false) {
                return false;
            };
        }
        return true;
    }
}