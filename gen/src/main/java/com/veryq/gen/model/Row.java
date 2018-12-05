package com.veryq.gen.model;

import com.deepoove.poi.data.RowRenderData;
import com.veryq.gen.controller.TableTypeEnum;
import lombok.Builder;
import lombok.Data;



@Data
@Builder
public class Row {

    private int index;
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


    public RowRenderData toRowRenderData(Long index,TableTypeEnum tableTypeEnum){
        if(TableTypeEnum.LINGMU==tableTypeEnum){
            return RowRenderData.build(index.toString(), this.getSubcategory(), this.getSubname(), this.getName(), this.getPrice().toString(), this.getCount().toString(),getTotal());
        }else if(TableTypeEnum.QOMGMIAO==tableTypeEnum){
            return RowRenderData.build(index.toString(), this.getSubcategory(), this.getName(), this.getPrice().toString(), this.getCount().toString(),getTotal() );
        }else if(TableTypeEnum.FUSHUWU==tableTypeEnum){
            return RowRenderData.build(index.toString(), this.getName(), this.getSubcategory(), this.getCount().toString(), this.getPrice().toString(), getTotal());
        }
        return null;
    }

    private String getTotal(){
        return Long.toString((this.getPrice() * this.getCount()) / 100);
    }

    public static void main(String[] args) {
        //Row row=Row.builder().name("11").col1("111").build();
    }

}
