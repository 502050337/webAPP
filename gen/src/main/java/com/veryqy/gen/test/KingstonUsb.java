package com.veryqy.gen.test;

public class KingstonUsb implements  Usb {

    @Override
    public void write(String str) {
        System.out.println(str);
    }

    @Override
    public String read() {
        return "dddddd";
    }

}
