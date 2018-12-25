package com.veryqy.gen.model;

import com.deepoove.poi.data.RowRenderData;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.veryqy.gen.bo.TableTypeEnum;
import lombok.Data;
import lombok.experimental.Tolerate;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * 表格的一行信息
 */
@Data
public class Row {

    @Tolerate
    public Row(){

    }
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
    private String price;//单价
    private String count;//数量
    private boolean checked;
    private String orderId;
    private String total;//总价

    public static void main(String[] args) {
        System.out.println(NumberUtils.isParsable("200.00"));;
    }
    public Row(String seq, String total) {
        this.seq = seq;
        this.total = total;
    }

    @JsonIgnore
    public RowRenderData toRowRenderData(TableTypeEnum tableTypeEnum) {
        if (TableTypeEnum.LINGMU == tableTypeEnum) {
            return RowRenderData.build(
                    this.seq,
                    StringUtils.defaultString(this.getName()),
                    StringUtils.defaultString(this.getSubname()),
                    "",
                    this.getPrice() == null ? "" : this.getPrice(),
                    this.getCount() == null ? "" : this.getCount(),
                    getTotalString()
            );
        } else if (TableTypeEnum.QOMGMIAO == tableTypeEnum) {
            return RowRenderData.build(
                    this.seq,
                    StringUtils.defaultString(this.getSubcategory()),
                    StringUtils.defaultString(this.getName()),
                    this.getPrice() == null ? "" : this.getPrice(),
                    this.getCount() == null ? "" : this.getCount(),
                    getTotalString()
            );
        } else if (TableTypeEnum.FUSHUWU == tableTypeEnum) {
            return RowRenderData.build(
                    this.seq,
                    StringUtils.defaultString(this.getName()),
                    StringUtils.defaultString(this.getSubname()),
                    this.getCount() == null ? "" : this.getCount(),
                    this.getPrice() == null ? "" : this.getPrice(),
                    getTotalString()
            );
        }else if (TableTypeEnum.JIANZHUWU == tableTypeEnum) {
            return RowRenderData.build(
                    this.seq,
                    StringUtils.defaultString(this.getName()),
                    StringUtils.defaultString(this.getSubcategory()),
                    this.getCount() == null ? "" : this.getCount(),
                    this.getPrice() == null ? "" : this.getPrice(),
                    getTotalString()
            );
        }
        throw new RuntimeException("不支持的表类型"+tableTypeEnum);
    }


    @JsonIgnore
    public String getTotalString() {
        if(StringUtils.isNotEmpty(this.total)){
            //总价不用计算
            return this.total;
        }
        if(!NumberUtils.isParsable(this.getPrice())){
            throw new RuntimeException("price invalid:"+this.price);
        }
        if(!NumberUtils.isParsable(this.getCount())){
            throw new RuntimeException("count invalid:"+this.count);
        }
        DecimalFormat df = new DecimalFormat("0.00");
        BigDecimal total = new BigDecimal(this.getPrice()).multiply(new BigDecimal(this.getCount()));
        return df.format(total);
    }


    @JsonIgnore
    public com.veryqy.jooq.tables.pojos.Row toJooqRow(){
        com.veryqy.jooq.tables.pojos.Row row=new com.veryqy.jooq.tables.pojos.Row();
        row.setChecked(this.isChecked());
        row.setCount(this.count);
        row.setCommodityId(this.id);
        row.setName(this.name);
        row.setPrice(this.getPrice());
        row.setRemark(this.getRemark());
        row.setSubcategory(this.getSubcategory());
        row.setSubname(this.getSubname());
        row.setTotal(this.getTotalString());
        row.setUnit(this.getUnit());
        return row;
    }

}
