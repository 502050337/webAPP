package com.veryq.gen.model;

import com.deepoove.poi.data.RowRenderData;
import com.veryq.gen.bo.TableTypeEnum;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import static com.veryq.gen.util.CurrencyUtils.fenToYuan;


/**
 * 表格的一行信息
 */
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
    private String price;//单价
    private String count;//数量
    private boolean checked;
    private String orderId;
    private String total;//总价

    public Row(String seq, String total) {
        this.seq = seq;
        this.total = total;
    }

    public RowRenderData toRowRenderData(TableTypeEnum tableTypeEnum) {
        if (TableTypeEnum.LINGMU == tableTypeEnum) {
            return RowRenderData.build(
                    this.seq,
                    StringUtils.defaultString(this.getSubcategory()),
                    StringUtils.defaultString(this.getSubname()),
                    StringUtils.defaultString(this.getName()),
                    this.getPrice() == null ? "" : fenToYuan(this.getPrice()),
                    this.getCount() == null ? "" : this.getCount(),
                    fenToYuan(getTotal())
            );
        } else if (TableTypeEnum.QOMGMIAO == tableTypeEnum) {
            return RowRenderData.build(
                    this.seq,
                    StringUtils.defaultString(this.getSubcategory()),
                    StringUtils.defaultString(this.getName()),
                    this.getPrice() == null ? "" : this.getPrice(),
                    this.getCount() == null ? "" : this.getCount(),
                    fenToYuan(getTotal())
            );
        } else if (TableTypeEnum.FUSHUWU == tableTypeEnum) {
            return RowRenderData.build(
                    this.seq,
                    StringUtils.defaultString(this.getName()),
                    StringUtils.defaultString(this.getSubcategory()),
                    this.getCount() == null ? "" : this.getCount(),
                    this.getPrice() == null ? "" : this.getPrice(),
                    fenToYuan(getTotal())
            );
        }
        return null;
    }

    public String getTotal() {
        if(StringUtils.isNumeric(this.getPrice())&& StringUtils.isNumeric(this.getCount())){
            DecimalFormat df = new DecimalFormat("0.00");
            BigDecimal total = new BigDecimal(this.getPrice()).multiply(new BigDecimal(this.getCount()));
            return df.format(total);
        }
        return "";
    }


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
        row.setTotal(this.getTotal());
        row.setUnit(this.getUnit());
        return row;
    }

}
