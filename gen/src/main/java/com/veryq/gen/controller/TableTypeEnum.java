package com.veryq.gen.controller;

import com.deepoove.poi.data.RowRenderData;
import com.deepoove.poi.data.TextRenderData;
import com.deepoove.poi.data.style.Style;
import com.deepoove.poi.data.style.TableStyle;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STJc;

public enum  TableTypeEnum {
    QOMGMIAO{
       @Override
       public RowRenderData getHeader(){
            TableStyle headStyle = new TableStyle();
            Style headTextStyle = new Style();
            headTextStyle.setFontFamily("Hei");
            headTextStyle.setFontSize(9);
            headTextStyle.setColor("7F7F7F");
            headStyle.setBackgroundColor("F2F2F2");
            headStyle.setAlign(STJc.CENTER);
           return RowRenderData.build(new TextRenderData("日期", headTextStyle),
                   new TextRenderData("订单编号", headTextStyle), new TextRenderData("销售代表", headTextStyle),
                   new TextRenderData("离岸价", headTextStyle), new TextRenderData("发货方式", headTextStyle),
                   new TextRenderData("条款", headTextStyle), new TextRenderData("税号", headTextStyle));
        }
    },LINGMU{
        @Override
        public RowRenderData getHeader(){
            TableStyle headStyle = new TableStyle();
            Style headTextStyle = new Style();
            headTextStyle.setFontFamily("Hei");
            headTextStyle.setFontSize(9);
            headTextStyle.setColor("7F7F7F");
            headStyle.setBackgroundColor("F2F2F2");
            headStyle.setAlign(STJc.CENTER);
            return RowRenderData.build(new TextRenderData("日期", headTextStyle),
                    new TextRenderData("订单编号", headTextStyle), new TextRenderData("销售代表", headTextStyle),
                    new TextRenderData("离岸价", headTextStyle), new TextRenderData("发货方式", headTextStyle),
                    new TextRenderData("条款", headTextStyle), new TextRenderData("税号", headTextStyle));
        }
    },FUSHUWU{
        @Override
        public RowRenderData getHeader(){
            TableStyle headStyle = new TableStyle();
            Style headTextStyle = new Style();
            headTextStyle.setFontFamily("Hei");
            headTextStyle.setFontSize(9);
            headTextStyle.setColor("7F7F7F");
            headStyle.setBackgroundColor("F2F2F2");
            headStyle.setAlign(STJc.CENTER);
            return RowRenderData.build(new TextRenderData("日期", headTextStyle),
                    new TextRenderData("订单编号", headTextStyle), new TextRenderData("销售代表", headTextStyle),
                    new TextRenderData("离岸价", headTextStyle), new TextRenderData("发货方式", headTextStyle),
                    new TextRenderData("条款", headTextStyle), new TextRenderData("税号", headTextStyle));
        }
    };
    public static TableTypeEnum fromTitle(String title){
        if(title.contains("青苗")){
                return TableTypeEnum.QOMGMIAO;
        }else if(title.contains("林木")){
            return TableTypeEnum.LINGMU;
        }else if(title.contains("附属设施")){
            return TableTypeEnum.FUSHUWU;
        }else{
            throw new RuntimeException("不支持的表类型");
        }
    }
    public abstract  RowRenderData getHeader();
}
