/*
 * This file is generated by jOOQ.
*/
package com.dvdstore.model.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Category implements Serializable {

    private static final long serialVersionUID = -1593403305;

    private Integer   categoryId;
    private String    name;
    private Timestamp lastUpdate;

    public Category() {}

    public Category(Category value) {
        this.categoryId = value.categoryId;
        this.name = value.name;
        this.lastUpdate = value.lastUpdate;
    }

    public Category(
        Integer   categoryId,
        String    name,
        Timestamp lastUpdate
    ) {
        this.categoryId = categoryId;
        this.name = name;
        this.lastUpdate = lastUpdate;
    }

    public Integer getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Category (");

        sb.append(categoryId);
        sb.append(", ").append(name);
        sb.append(", ").append(lastUpdate);

        sb.append(")");
        return sb.toString();
    }
}
