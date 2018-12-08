package com.veryq.gen.model;

import com.deepoove.poi.data.RowRenderData;
import com.veryq.gen.bo.TableTypeEnum;
import lombok.Data;
import org.codehaus.plexus.util.StringUtils;

import static com.veryq.gen.util.CurrencyUtils.fenToYuan;


@Data
public class Row {

    private String seq;//序号
    private String id;//ID
    private String category;//一级分类
    private String subcategory;//二级分类
    private String name;//名称
    private String unit;//单位
    private String remark;//备注
    private String subname;//规格
    private String col8;
    private String col9;
    private String col10;
    private Long price;//单价
    private Double count;//数量
    private boolean checked;
    private String orderId;
    private Double total;//总价


    public Row(String seq, Double total) {
        this.seq = seq;
        this.total = total;
    }

    public RowRenderData toRowRenderData(TableTypeEnum tableTypeEnum) {
        if (TableTypeEnum.LINGMU == tableTypeEnum) {
            return RowRenderData.build(
                    this.seq.toString(),
                    StringUtils.defaultString(this.getSubcategory()),
                    StringUtils.defaultString(this.getSubname()),
                    StringUtils.defaultString(this.getName()),
                    this.getPrice() == null ? "" : fenToYuan(this.getPrice().toString()),
                    this.getCount() == null ? "" : this.getCount().toString(),
                    fenToYuan(getTotal().toString())
            );
        } else if (TableTypeEnum.QOMGMIAO == tableTypeEnum) {
            return RowRenderData.build(
                    this.seq.toString(),
                    StringUtils.defaultString(this.getSubcategory()),
                    StringUtils.defaultString(this.getName()),
                    this.getPrice() == null ? "" : fenToYuan(this.getPrice().toString()),
                    this.getCount() == null ? "" : this.getCount().toString(),
                    fenToYuan(getTotal().toString())
            );
        } else if (TableTypeEnum.FUSHUWU == tableTypeEnum) {
            return RowRenderData.build(
                    this.seq.toString(),
                    StringUtils.defaultString(this.getName()),
                    StringUtils.defaultString(this.getSubcategory()),
                    this.getCount() == null ? "" : this.getCount().toString(),
                    this.getPrice() == null ? "" : fenToYuan(this.getPrice().toString()),
                    fenToYuan(getTotal().toString())
            );
        }
        return null;
    }

    public Double getTotal() {
        return total != null ? total : (this.getPrice() * this.getCount());
    }

}
