package com.veryqy.gen.bo;

import com.deepoove.poi.XWPFTemplate;
import org.jodconverter.JodConverter;
import org.jodconverter.office.OfficeException;

import java.io.File;
import java.io.FileOutputStream;

public class FileConvertor {

    public static void genWord(String templateFile, Object data, String outFile) throws Exception {
        XWPFTemplate template = XWPFTemplate.compile(templateFile).render(data);
        try (FileOutputStream out = new FileOutputStream(outFile)) {
            template.write(out);
            out.flush();
        } finally {
            template.close();
        }
    }

    public static void toPdf(String in, String out) throws OfficeException {
        File inputFile = new File(in);
        File outputFile = new File(out);
        JodConverter.convert(inputFile).to(outputFile).execute();
    }

}
