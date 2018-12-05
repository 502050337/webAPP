package com.veryq.gen.model.excel;


import com.deepoove.poi.data.MiniTableRenderData;
import lombok.Data;

@Data
public class ExcelContractor {

    private String contract_sn;
    private String name;
    private String population;
    private String title;
    private MiniTableRenderData order;


}
