/*
 * This file is generated by jOOQ.
*/
package com.veryqy.jooq.tables.records;


import com.veryqy.jooq.tables.Row;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RowRecord extends UpdatableRecordImpl<RowRecord> implements Record13<String, String, String, String, String, String, String, String, String, Boolean, String, String, String> {

    private static final long serialVersionUID = 522005490;

    /**
     * Setter for <code>public.row.seq</code>.
     */
    public void setSeq(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.row.seq</code>.
     */
    public String getSeq() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.row.id</code>.
     */
    public void setId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.row.id</code>.
     */
    public String getId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.row.subcategory</code>.
     */
    public void setSubcategory(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.row.subcategory</code>.
     */
    public String getSubcategory() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.row.name</code>.
     */
    public void setName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.row.name</code>.
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.row.unit</code>.
     */
    public void setUnit(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.row.unit</code>.
     */
    public String getUnit() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.row.remark</code>.
     */
    public void setRemark(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.row.remark</code>.
     */
    public String getRemark() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.row.subname</code>.
     */
    public void setSubname(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.row.subname</code>.
     */
    public String getSubname() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.row.price</code>.
     */
    public void setPrice(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.row.price</code>.
     */
    public String getPrice() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.row.count</code>.
     */
    public void setCount(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.row.count</code>.
     */
    public String getCount() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.row.checked</code>.
     */
    public void setChecked(Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.row.checked</code>.
     */
    public Boolean getChecked() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>public.row.total</code>.
     */
    public void setTotal(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.row.total</code>.
     */
    public String getTotal() {
        return (String) get(10);
    }

    /**
     * Setter for <code>public.row.order_id</code>.
     */
    public void setOrderId(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.row.order_id</code>.
     */
    public String getOrderId() {
        return (String) get(11);
    }

    /**
     * Setter for <code>public.row.commodity_id</code>.
     */
    public void setCommodityId(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.row.commodity_id</code>.
     */
    public String getCommodityId() {
        return (String) get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<String, String, String, String, String, String, String, String, String, Boolean, String, String, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<String, String, String, String, String, String, String, String, String, Boolean, String, String, String> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Row.ROW.SEQ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Row.ROW.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Row.ROW.SUBCATEGORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Row.ROW.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Row.ROW.UNIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Row.ROW.REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Row.ROW.SUBNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Row.ROW.PRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Row.ROW.COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field10() {
        return Row.ROW.CHECKED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Row.ROW.TOTAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Row.ROW.ORDER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return Row.ROW.COMMODITY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getSeq();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getSubcategory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getUnit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getSubname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component10() {
        return getChecked();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getTotal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getOrderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getCommodityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getSeq();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSubcategory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getUnit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getSubname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value10() {
        return getChecked();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getTotal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getOrderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getCommodityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RowRecord value1(String value) {
        setSeq(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RowRecord value2(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RowRecord value3(String value) {
        setSubcategory(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RowRecord value4(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RowRecord value5(String value) {
        setUnit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RowRecord value6(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RowRecord value7(String value) {
        setSubname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RowRecord value8(String value) {
        setPrice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RowRecord value9(String value) {
        setCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RowRecord value10(Boolean value) {
        setChecked(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RowRecord value11(String value) {
        setTotal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RowRecord value12(String value) {
        setOrderId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RowRecord value13(String value) {
        setCommodityId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RowRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, Boolean value10, String value11, String value12, String value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RowRecord
     */
    public RowRecord() {
        super(Row.ROW);
    }

    /**
     * Create a detached, initialised RowRecord
     */
    public RowRecord(String seq, String id, String subcategory, String name, String unit, String remark, String subname, String price, String count, Boolean checked, String total, String orderId, String commodityId) {
        super(Row.ROW);

        set(0, seq);
        set(1, id);
        set(2, subcategory);
        set(3, name);
        set(4, unit);
        set(5, remark);
        set(6, subname);
        set(7, price);
        set(8, count);
        set(9, checked);
        set(10, total);
        set(11, orderId);
        set(12, commodityId);
    }
}
