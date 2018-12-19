package com.veryqy.gen.model.excel;


import com.deepoove.poi.data.MiniTableRenderData;
import lombok.Data;

@Data
public class ExcelContractor {
    private String title;
    private String agreementId;
    private String personName;
    private String personAddress;
    private String personIdno;
    private MiniTableRenderData order;
}

