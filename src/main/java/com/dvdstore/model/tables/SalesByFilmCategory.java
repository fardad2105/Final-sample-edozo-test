/*
 * This file is generated by jOOQ.
*/
package com.dvdstore.model.tables;


import com.dvdstore.model.Public;
import com.dvdstore.model.tables.records.SalesByFilmCategoryRecord;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class SalesByFilmCategory extends TableImpl<SalesByFilmCategoryRecord> {

    private static final long serialVersionUID = -1967727724;

    /**
     * The reference instance of <code>public.sales_by_film_category</code>
     */
    public static final SalesByFilmCategory SALES_BY_FILM_CATEGORY = new SalesByFilmCategory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SalesByFilmCategoryRecord> getRecordType() {
        return SalesByFilmCategoryRecord.class;
    }

    /**
     * The column <code>public.sales_by_film_category.category</code>.
     */
    public final TableField<SalesByFilmCategoryRecord, String> CATEGORY = createField("category", org.jooq.impl.SQLDataType.VARCHAR(25), this, "");

    /**
     * The column <code>public.sales_by_film_category.total_sales</code>.
     */
    public final TableField<SalesByFilmCategoryRecord, BigDecimal> TOTAL_SALES = createField("total_sales", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * Create a <code>public.sales_by_film_category</code> table reference
     */
    public SalesByFilmCategory() {
        this(DSL.name("sales_by_film_category"), null);
    }

    /**
     * Create an aliased <code>public.sales_by_film_category</code> table reference
     */
    public SalesByFilmCategory(String alias) {
        this(DSL.name(alias), SALES_BY_FILM_CATEGORY);
    }

    /**
     * Create an aliased <code>public.sales_by_film_category</code> table reference
     */
    public SalesByFilmCategory(Name alias) {
        this(alias, SALES_BY_FILM_CATEGORY);
    }

    private SalesByFilmCategory(Name alias, Table<SalesByFilmCategoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private SalesByFilmCategory(Name alias, Table<SalesByFilmCategoryRecord> aliased, Field<?>[] parameters) {
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
    public SalesByFilmCategory as(String alias) {
        return new SalesByFilmCategory(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesByFilmCategory as(Name alias) {
        return new SalesByFilmCategory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SalesByFilmCategory rename(String name) {
        return new SalesByFilmCategory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SalesByFilmCategory rename(Name name) {
        return new SalesByFilmCategory(name, null);
    }
}
