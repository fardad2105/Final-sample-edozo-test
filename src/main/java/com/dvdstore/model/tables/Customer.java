/*
 * This file is generated by jOOQ.
*/
package com.dvdstore.model.tables;


import com.dvdstore.model.Indexes;
import com.dvdstore.model.Keys;
import com.dvdstore.model.Public;
import com.dvdstore.model.tables.records.CustomerRecord;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class Customer extends TableImpl<CustomerRecord> {

    private static final long serialVersionUID = -219915196;

    /**
     * The reference instance of <code>public.customer</code>
     */
    public static final Customer CUSTOMER = new Customer();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CustomerRecord> getRecordType() {
        return CustomerRecord.class;
    }

    /**
     * The column <code>public.customer.customer_id</code>.
     */
    public final TableField<CustomerRecord, Integer> CUSTOMER_ID = createField("customer_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('customer_customer_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.customer.store_id</code>.
     */
    public final TableField<CustomerRecord, Short> STORE_ID = createField("store_id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.customer.first_name</code>.
     */
    public final TableField<CustomerRecord, String> FIRST_NAME = createField("first_name", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>public.customer.last_name</code>.
     */
    public final TableField<CustomerRecord, String> LAST_NAME = createField("last_name", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>public.customer.email</code>.
     */
    public final TableField<CustomerRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.customer.address_id</code>.
     */
    public final TableField<CustomerRecord, Short> ADDRESS_ID = createField("address_id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.customer.activebool</code>.
     */
    public final TableField<CustomerRecord, Boolean> ACTIVEBOOL = createField("activebool", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.customer.create_date</code>.
     */
    public final TableField<CustomerRecord, Date> CREATE_DATE = createField("create_date", org.jooq.impl.SQLDataType.DATE.nullable(false).defaultValue(org.jooq.impl.DSL.field("('now'::text)::date", org.jooq.impl.SQLDataType.DATE)), this, "");

    /**
     * The column <code>public.customer.last_update</code>.
     */
    public final TableField<CustomerRecord, Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>public.customer.active</code>.
     */
    public final TableField<CustomerRecord, Integer> ACTIVE = createField("active", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>public.customer</code> table reference
     */
    public Customer() {
        this(DSL.name("customer"), null);
    }

    /**
     * Create an aliased <code>public.customer</code> table reference
     */
    public Customer(String alias) {
        this(DSL.name(alias), CUSTOMER);
    }

    /**
     * Create an aliased <code>public.customer</code> table reference
     */
    public Customer(Name alias) {
        this(alias, CUSTOMER);
    }

    private Customer(Name alias, Table<CustomerRecord> aliased) {
        this(alias, aliased, null);
    }

    private Customer(Name alias, Table<CustomerRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CUSTOMER_PKEY, Indexes.IDX_FK_ADDRESS_ID, Indexes.IDX_FK_STORE_ID, Indexes.IDX_LAST_NAME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CustomerRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CUSTOMER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CustomerRecord> getPrimaryKey() {
        return Keys.CUSTOMER_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CustomerRecord>> getKeys() {
        return Arrays.<UniqueKey<CustomerRecord>>asList(Keys.CUSTOMER_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CustomerRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CustomerRecord, ?>>asList(Keys.CUSTOMER__CUSTOMER_ADDRESS_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Customer as(String alias) {
        return new Customer(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Customer as(Name alias) {
        return new Customer(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Customer rename(String name) {
        return new Customer(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Customer rename(Name name) {
        return new Customer(name, null);
    }
}
