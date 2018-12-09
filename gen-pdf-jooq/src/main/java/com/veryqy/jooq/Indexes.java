/*
 * This file is generated by jOOQ.
*/
package com.veryqy.jooq;


import com.veryqy.jooq.tables.Commodity;
import com.veryqy.jooq.tables.Contractor;
import com.veryqy.jooq.tables.Order;
import com.veryqy.jooq.tables.Row;
import com.veryqy.jooq.tables.User;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index COMMODITY_PKEY = Indexes0.COMMODITY_PKEY;
    public static final Index CONTRACTOR_PKEY = Indexes0.CONTRACTOR_PKEY;
    public static final Index ORDER_PKEY = Indexes0.ORDER_PKEY;
    public static final Index ROW_PKEY = Indexes0.ROW_PKEY;
    public static final Index USER_PKEY = Indexes0.USER_PKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index COMMODITY_PKEY = Internal.createIndex("commodity_pkey", Commodity.COMMODITY, new OrderField[] { Commodity.COMMODITY.ID }, true);
        public static Index CONTRACTOR_PKEY = Internal.createIndex("contractor_pkey", Contractor.CONTRACTOR, new OrderField[] { Contractor.CONTRACTOR.ID }, true);
        public static Index ORDER_PKEY = Internal.createIndex("Order_pkey", Order.ORDER, new OrderField[] { Order.ORDER.ID }, true);
        public static Index ROW_PKEY = Internal.createIndex("row_pkey", Row.ROW, new OrderField[] { Row.ROW.ID }, true);
        public static Index USER_PKEY = Internal.createIndex("user_pkey", User.USER, new OrderField[] { User.USER.ID }, true);
    }
}
