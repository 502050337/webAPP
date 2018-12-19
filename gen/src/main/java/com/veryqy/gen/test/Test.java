package com.veryqy.gen.test;

public class Test {
    public static void main(String[] args) {
        Usb usb=new Usb() {
            @Override
            public void write(String str) {
                System.out.println(str);
            }
            @Override
            public String read() {
                return "fffffff";
            }
        };

        Usb usb2=new Usb() {
            @Override
            public void write(String str) {
                System.out.println(str);
            }
            @Override
            public String read() {
                return "fffffff";
            }
        };

    }
}
