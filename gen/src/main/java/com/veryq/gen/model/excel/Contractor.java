package com.veryq.gen.model.excel;


import com.deepoove.poi.data.MiniTableRenderData;

public class Contractor {

    String contract_sn;
    String name;
    String population;
    String title;

    private MiniTableRenderData order;

    public MiniTableRenderData getOrder() {
        return order;
    }

    public void setOrder(MiniTableRenderData order) {
        this.order = order;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContract_sn() {
        return contract_sn;
    }

    public void setContract_sn(String contract_sn) {
        this.contract_sn = contract_sn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }
}
