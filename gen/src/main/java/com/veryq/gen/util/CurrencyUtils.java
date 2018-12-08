package com.veryq.gen.util;

import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class CurrencyUtils {

    public static String yuanToFen(String yuan) {
        if (StringUtils.isBlank(yuan) && isNumber(yuan)) {
            return yuan;
        }
        DecimalFormat df = new DecimalFormat("0");
        BigDecimal total = new BigDecimal(yuan).multiply(new BigDecimal(100));
        return df.format(total);

    }

    public static String fenToYuan(String fen) {
        if (StringUtils.isBlank(fen) && isNumber(fen)) {
            return fen;
        }
        DecimalFormat df = new DecimalFormat("0.00");
        BigDecimal total = new BigDecimal(fen).divide(new BigDecimal(100), RoundingMode.HALF_UP);
        return df.format(total);
    }


    private static boolean isNumber(String str) {
        String reg = "^[0-9]+(.[0-9]+)?$";
        return str.matches(reg);
    }
}
