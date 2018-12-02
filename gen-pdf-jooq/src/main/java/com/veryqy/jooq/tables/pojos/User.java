/*
 * This file is generated by jOOQ.
*/
package com.veryqy.jooq.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


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
public class User implements Serializable {

    private static final long serialVersionUID = 596810316;

    private String  user;
    private String  password;
    private Integer id;

    public User() {}

    public User(User value) {
        this.user = value.user;
        this.password = value.password;
        this.id = value.id;
    }

    public User(
        String  user,
        String  password,
        Integer id
    ) {
        this.user = user;
        this.password = password;
        this.id = id;
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("User (");

        sb.append(user);
        sb.append(", ").append(password);
        sb.append(", ").append(id);

        sb.append(")");
        return sb.toString();
    }
}
