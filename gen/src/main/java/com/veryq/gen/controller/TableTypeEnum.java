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
            headTextStyle.setFontFamily("微软雅黑");
            headTextStyle.setFontSize(9);
            headTextStyle.setColor("000000");
            headStyle.setBackgroundColor("FFFFFF");
            headStyle.setAlign(STJc.CENTER);
           return RowRenderData.build(new TextRenderData("序号", headTextStyle),
                   new TextRenderData("种植类别", headTextStyle), new TextRenderData("田、地名称", headTextStyle),
                   new TextRenderData("补偿标准（元/亩）", headTextStyle), new TextRenderData("数量（亩）", headTextStyle),
                   new TextRenderData("补偿金额（元）", headTextStyle));
        }
    },LINGMU{
        @Override
        public RowRenderData getHeader(){
            TableStyle headStyle = new TableStyle();
            Style headTextStyle = new Style();
            headTextStyle.setFontFamily("微软雅黑");
            headTextStyle.setFontSize(9);
            headTextStyle.setColor("000000");
            headStyle.setBackgroundColor("FFFFFF");
            headStyle.setAlign(STJc.CENTER);
            return RowRenderData.build(new TextRenderData("序号", headTextStyle),
                    new TextRenderData("林木种类", headTextStyle), new TextRenderData("规格", headTextStyle),
                    new TextRenderData("位置", headTextStyle), new TextRenderData("补偿标准（元/根、株、公斤）", headTextStyle),
                    new TextRenderData("数量（根、株、公斤）", headTextStyle), new TextRenderData("补偿金额（元）", headTextStyle));
        }
    },FUSHUWU{
        @Override
        public RowRenderData getHeader(){
            TableStyle headStyle = new TableStyle();
            Style headTextStyle = new Style();
            headTextStyle.setFontFamily("微软雅黑");
            headTextStyle.setFontSize(9);
            headTextStyle.setColor("000000");
            headStyle.setBackgroundColor("FFFFFF");
            headStyle.setAlign(STJc.CENTER);
            return RowRenderData.build(new TextRenderData("序号", headTextStyle),
                    new TextRenderData("名称", headTextStyle), new TextRenderData("类别", headTextStyle),
                    new TextRenderData("数量", headTextStyle), new TextRenderData("补偿标准", headTextStyle),
                    new TextRenderData("补偿标准（元）", headTextStyle));
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
