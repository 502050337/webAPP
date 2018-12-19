package com.veryqy.gen.model;

import com.veryqy.gen.util.JSON;
import lombok.Data;
import java.util.List;

@Data
public class Contractor {

    private String id;//唯一标识
    private String agreementId; //协议编号
    private String name;//合同名称
    private Person person; //户主信息
    private List<Order> orders;//协议内容

    public com.veryqy.jooq.tables.pojos.Contractor toJOOQContractor(){
        com.veryqy.jooq.tables.pojos.Contractor contractor=new com.veryqy.jooq.tables.pojos.Contractor();
        contractor.setAgreementId(this.agreementId);
        contractor.setName(this.name);
        contractor.setPersonName(this.getPerson().getName());
        contractor.setPersonIdno(this.getPerson().getIdno());
        contractor.setId(this.getId());
        contractor.setJosn(JSON.stringify(this));
        return contractor;
    }

}
