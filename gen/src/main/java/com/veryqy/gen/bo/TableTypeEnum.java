package com.veryqy.gen.bo;

import com.deepoove.poi.data.RowRenderData;
import com.deepoove.poi.data.TextRenderData;
import com.deepoove.poi.data.style.Style;

public enum TableTypeEnum {
    QOMGMIAO {
        @Override
        public RowRenderData getHeader() {
            Style headTextStyle = new Style();
            headTextStyle.setFontFamily("微软雅黑");
            headTextStyle.setFontSize(9);
            headTextStyle.setColor("000000");
            return RowRenderData.build(
                    new TextRenderData("序号", headTextStyle),
                    new TextRenderData("种植类别", headTextStyle),
                    new TextRenderData("田、地名称", headTextStyle),
                    new TextRenderData("补偿标准（元/亩）", headTextStyle),
                    new TextRenderData("数量（亩）", headTextStyle),
                    new TextRenderData("补偿金额（元）", headTextStyle));
        }

        @Override
        public String getTitle() {
            return "征收集体土地青苗补偿登记表（表二）";
        }
    }, LINGMU {
        @Override
        public RowRenderData getHeader() {
            Style headTextStyle = new Style();
            headTextStyle.setFontFamily("微软雅黑");
            headTextStyle.setFontSize(9);
            headTextStyle.setColor("000000");
            return RowRenderData.build(
                    new TextRenderData("序号", headTextStyle),
                    new TextRenderData("林木种类", headTextStyle),
                    new TextRenderData("规格", headTextStyle),
                    new TextRenderData("位置", headTextStyle),
                    new TextRenderData("补偿标准（元/根、株、公斤）", headTextStyle),
                    new TextRenderData("数量（根、株、公斤）", headTextStyle),
                    new TextRenderData("补偿金额（元）", headTextStyle));
        }

        @Override
        public String getTitle() {
            return "征收集体土地林木补偿登记表（表三）";
        }
    }, FUSHUWU {
        @Override
        public RowRenderData getHeader() {
            Style headTextStyle = new Style();
            headTextStyle.setFontFamily("微软雅黑");
            headTextStyle.setFontSize(9);
            headTextStyle.setColor("000000");
            return RowRenderData.build(
                    new TextRenderData("序号", headTextStyle),
                    new TextRenderData("名称", headTextStyle),
                    new TextRenderData("类别", headTextStyle),
                    new TextRenderData("数量", headTextStyle),
                    new TextRenderData("补偿标准", headTextStyle),
                    new TextRenderData("补偿标准（元）", headTextStyle));
        }

        @Override
        public String getTitle() {
            return "征收集体土地构筑物、附属设施补偿登记表（表五-2）";
        }
    }, JIANZHUWU {
        @Override
        public RowRenderData getHeader() {
            Style headTextStyle = new Style();
            headTextStyle.setFontFamily("微软雅黑");
            headTextStyle.setFontSize(9);
            headTextStyle.setColor("000000");
            return RowRenderData.build(
                    new TextRenderData("序号", headTextStyle),
                    new TextRenderData("类别", headTextStyle),
                    new TextRenderData("名称", headTextStyle),
                    new TextRenderData("数量", headTextStyle),
                    new TextRenderData("补偿标准", headTextStyle),
                    new TextRenderData("补偿标准（元）", headTextStyle));
        }

        @Override
        public String getTitle() {
            return "征收集体土地构筑物、附属设施补偿登记表（表五）";
        }
    };


    String title;

    public static TableTypeEnum fromTitle(String title) {
        if (title.contains("青苗")) {
            return TableTypeEnum.QOMGMIAO;
        } else if (title.contains("林木")) {
            return TableTypeEnum.LINGMU;
        } else if (title.contains("附属设施")) {
            return TableTypeEnum.FUSHUWU;
        } else if (title.contains("构筑物")) {
            return TableTypeEnum.JIANZHUWU;
        } else {
            throw new RuntimeException("不支持的表类型");
        }
    }

    public abstract RowRenderData getHeader();

    public abstract String getTitle();
}
