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
public class Store implements Serializable {

    private static final long serialVersionUID = -1377784458;

    private Integer   storeId;
    private Short     managerStaffId;
    private Short     addressId;
    private Timestamp lastUpdate;

    public Store() {}

    public Store(Store value) {
        this.storeId = value.storeId;
        this.managerStaffId = value.managerStaffId;
        this.addressId = value.addressId;
        this.lastUpdate = value.lastUpdate;
    }

    public Store(
        Integer   storeId,
        Short     managerStaffId,
        Short     addressId,
        Timestamp lastUpdate
    ) {
        this.storeId = storeId;
        this.managerStaffId = managerStaffId;
        this.addressId = addressId;
        this.lastUpdate = lastUpdate;
    }

    public Integer getStoreId() {
        return this.storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Short getManagerStaffId() {
        return this.managerStaffId;
    }

    public void setManagerStaffId(Short managerStaffId) {
        this.managerStaffId = managerStaffId;
    }

    public Short getAddressId() {
        return this.addressId;
    }

    public void setAddressId(Short addressId) {
        this.addressId = addressId;
    }

    public Timestamp getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Store (");

        sb.append(storeId);
        sb.append(", ").append(managerStaffId);
        sb.append(", ").append(addressId);
        sb.append(", ").append(lastUpdate);

        sb.append(")");
        return sb.toString();
    }
}
