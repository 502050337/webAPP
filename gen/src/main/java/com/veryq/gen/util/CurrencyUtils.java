package com.veryq.gen.util;

import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;

public class CurrencyUtils {

    public static String yuanToFen(String yuan){
        if(StringUtils.isBlank(yuan)){
            return yuan;
        }
        java.text.DecimalFormat df=new java.text.DecimalFormat("0");
        try{
            BigDecimal total = new BigDecimal(yuan).multiply(new BigDecimal(100));
            return df.format(total);
        }catch (java.lang.NumberFormatException ex)
        {
            System.out.println(yuan);
        }
        return "";
    }

    public static String fenToYuan(String fen){
        if(StringUtils.isEmpty(fen)){
            return fen;
        }
        java.text.DecimalFormat df=new java.text.DecimalFormat("0.00");
        BigDecimal total = new BigDecimal(fen).divide(new BigDecimal(100));
        return df.format(total);
    }



    public static String doubleToString(double money){
        java.text.DecimalFormat df=new java.text.DecimalFormat("0.00");
        BigDecimal total = new BigDecimal(money);
        return df.format(total);
    }


    public static void main(String[] args) {
       String d= CurrencyUtils.doubleToString(-0.01);
       System.out.println(d);

    }

}
