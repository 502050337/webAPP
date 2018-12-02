/*
 * This file is generated by jOOQ.
*/
package com.veryqy.jooq.tables.daos;


import com.veryqy.jooq.tables.User;
import com.veryqy.jooq.tables.records.UserRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class UserDao extends DAOImpl<UserRecord, com.veryqy.jooq.tables.pojos.User, Integer> {

    /**
     * Create a new UserDao without any configuration
     */
    public UserDao() {
        super(User.USER, com.veryqy.jooq.tables.pojos.User.class);
    }

    /**
     * Create a new UserDao with an attached configuration
     */
    public UserDao(Configuration configuration) {
        super(User.USER, com.veryqy.jooq.tables.pojos.User.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.veryqy.jooq.tables.pojos.User object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>user IN (values)</code>
     */
    public List<com.veryqy.jooq.tables.pojos.User> fetchByUser(String... values) {
        return fetch(User.USER.USER_, values);
    }

    /**
     * Fetch records that have <code>password IN (values)</code>
     */
    public List<com.veryqy.jooq.tables.pojos.User> fetchByPassword(String... values) {
        return fetch(User.USER.PASSWORD, values);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.veryqy.jooq.tables.pojos.User> fetchById(Integer... values) {
        return fetch(User.USER.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.veryqy.jooq.tables.pojos.User fetchOneById(Integer value) {
        return fetchOne(User.USER.ID, value);
    }
}
