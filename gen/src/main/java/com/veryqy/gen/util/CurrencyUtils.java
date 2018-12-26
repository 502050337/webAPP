package com.veryqy.gen.util;

import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.UUID;

public class CurrencyUtils {

    public static String yuanToFen(String yuan) {
        if (StringUtils.isNumeric(yuan)) {
            return yuan;
        }
        DecimalFormat df = new DecimalFormat("0");
        BigDecimal total = new BigDecimal(yuan).multiply(new BigDecimal(100));
        return df.format(total);

    }

    public static String fenToYuan(String fen) {
        if (StringUtils.isNumeric(fen)) {
            return fen;
        }
        DecimalFormat df = new DecimalFormat("0.00");
        BigDecimal total = new BigDecimal(fen).divide(new BigDecimal(100), RoundingMode.HALF_UP);
        return df.format(total);
    }

    public static String getUUID32(){
        return UUID.randomUUID().toString().replace("-", "").toLowerCase();
    }
}
