package com.veryq.gen.model;

import com.deepoove.poi.data.RowRenderData;
import com.veryq.gen.bo.TableTypeEnum;
import lombok.Data;
import org.codehaus.plexus.util.StringUtils;

import static com.veryq.gen.util.CurrencyUtils.fenToYuan;


@Data
public class Row {

    private String seq;
    private String id;
    private String category;
    private String subcategory;
    private String name;
    private String unit;
    private String remark;
    private String subname;
    private String col8;
    private String col9;
    private String col10;
    private Long price;
    private Long count;
    private boolean checked;
    private String orderId;
    private  Long total;


    public Row(String seq,Long total){
        this.seq=seq;
        this.total=total;
    }

    public RowRenderData toRowRenderData(TableTypeEnum tableTypeEnum){
        if(TableTypeEnum.LINGMU==tableTypeEnum){
            return RowRenderData.build(
                    this.seq.toString(),
                    StringUtils.defaultString(this.getSubcategory()),
                    StringUtils.defaultString(this.getSubname()),
                    StringUtils.defaultString(this.getName()),
                    this.getPrice()==null?"":fenToYuan(this.getPrice().toString()),
                    this.getCount()==null?"":this.getCount().toString(),
                    fenToYuan(getTotal().toString())
            );
        }else if(TableTypeEnum.QOMGMIAO==tableTypeEnum){
            return RowRenderData.build(
                    this.seq.toString(),
                    StringUtils.defaultString(this.getSubcategory()),
                    StringUtils.defaultString(this.getName()),
                    this.getPrice()==null?"":fenToYuan(this.getPrice().toString()),
                    this.getCount()==null?"":this.getCount().toString(),
                    fenToYuan(getTotal().toString())
            );
        }else if(TableTypeEnum.FUSHUWU==tableTypeEnum){
            return RowRenderData.build(
                    this.seq.toString(),
                    StringUtils.defaultString(this.getName()),
                    StringUtils.defaultString(this.getSubcategory()),
                    this.getCount()==null?"":this.getCount().toString(),
                    this.getPrice()==null?"":fenToYuan(this.getPrice().toString()),
                    fenToYuan(getTotal().toString())
            );
        }
        return null;
    }

    public Long getTotal(){
        return total!=null?total:(this.getPrice() * this.getCount());
    }

    public static void main(String[] args) {
        //Row row=Row.builder().name("11").col1("111").build();
    }

}
