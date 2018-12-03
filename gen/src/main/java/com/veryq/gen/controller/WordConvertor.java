package com.veryq.gen.controller;

import com.deepoove.poi.XWPFTemplate;

import java.io.FileOutputStream;

public class WordConvertor {

    public  static void genWord(String templateFile, Object data, String outFile) throws Exception {
        XWPFTemplate template = XWPFTemplate.compile(templateFile).render(data);
        try (FileOutputStream out = new FileOutputStream(outFile)) {
            template.write(out);
            out.flush();
        } finally {
            template.close();
        }
    }

}
