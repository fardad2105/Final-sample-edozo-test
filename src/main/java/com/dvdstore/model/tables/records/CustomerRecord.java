/*
 * This file is generated by jOOQ.
*/
package com.dvdstore.model.tables.records;


import com.dvdstore.model.tables.Customer;

import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


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
public class CustomerRecord extends UpdatableRecordImpl<CustomerRecord> implements Record10<Integer, Short, String, String, String, Short, Boolean, Date, Timestamp, Integer> {

    private static final long serialVersionUID = -883835285;

    /**
     * Setter for <code>public.customer.customer_id</code>.
     */
    public void setCustomerId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.customer.customer_id</code>.
     */
    public Integer getCustomerId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.customer.store_id</code>.
     */
    public void setStoreId(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.customer.store_id</code>.
     */
    public Short getStoreId() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>public.customer.first_name</code>.
     */
    public void setFirstName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.customer.first_name</code>.
     */
    public String getFirstName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.customer.last_name</code>.
     */
    public void setLastName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.customer.last_name</code>.
     */
    public String getLastName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.customer.email</code>.
     */
    public void setEmail(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.customer.email</code>.
     */
    public String getEmail() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.customer.address_id</code>.
     */
    public void setAddressId(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.customer.address_id</code>.
     */
    public Short getAddressId() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>public.customer.activebool</code>.
     */
    public void setActivebool(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.customer.activebool</code>.
     */
    public Boolean getActivebool() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>public.customer.create_date</code>.
     */
    public void setCreateDate(Date value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.customer.create_date</code>.
     */
    public Date getCreateDate() {
        return (Date) get(7);
    }

    /**
     * Setter for <code>public.customer.last_update</code>.
     */
    public void setLastUpdate(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.customer.last_update</code>.
     */
    public Timestamp getLastUpdate() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>public.customer.active</code>.
     */
    public void setActive(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.customer.active</code>.
     */
    public Integer getActive() {
        return (Integer) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Short, String, String, String, Short, Boolean, Date, Timestamp, Integer> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Short, String, String, String, Short, Boolean, Date, Timestamp, Integer> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Customer.CUSTOMER.CUSTOMER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field2() {
        return Customer.CUSTOMER.STORE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Customer.CUSTOMER.FIRST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Customer.CUSTOMER.LAST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Customer.CUSTOMER.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field6() {
        return Customer.CUSTOMER.ADDRESS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return Customer.CUSTOMER.ACTIVEBOOL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field8() {
        return Customer.CUSTOMER.CREATE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return Customer.CUSTOMER.LAST_UPDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return Customer.CUSTOMER.ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getCustomerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component2() {
        return getStoreId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component6() {
        return getAddressId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component7() {
        return getActivebool();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component8() {
        return getCreateDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getLastUpdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getCustomerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value2() {
        return getStoreId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value6() {
        return getAddressId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getActivebool();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value8() {
        return getCreateDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getLastUpdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerRecord value1(Integer value) {
        setCustomerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerRecord value2(Short value) {
        setStoreId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerRecord value3(String value) {
        setFirstName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerRecord value4(String value) {
        setLastName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerRecord value5(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerRecord value6(Short value) {
        setAddressId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerRecord value7(Boolean value) {
        setActivebool(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerRecord value8(Date value) {
        setCreateDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerRecord value9(Timestamp value) {
        setLastUpdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerRecord value10(Integer value) {
        setActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerRecord values(Integer value1, Short value2, String value3, String value4, String value5, Short value6, Boolean value7, Date value8, Timestamp value9, Integer value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CustomerRecord
     */
    public CustomerRecord() {
        super(Customer.CUSTOMER);
    }

    /**
     * Create a detached, initialised CustomerRecord
     */
    public CustomerRecord(Integer customerId, Short storeId, String firstName, String lastName, String email, Short addressId, Boolean activebool, Date createDate, Timestamp lastUpdate, Integer active) {
        super(Customer.CUSTOMER);

        set(0, customerId);
        set(1, storeId);
        set(2, firstName);
        set(3, lastName);
        set(4, email);
        set(5, addressId);
        set(6, activebool);
        set(7, createDate);
        set(8, lastUpdate);
        set(9, active);
    }
}
