/*
 * This file is generated by jOOQ.
*/
package com.dvdstore.model.tables;


import com.dvdstore.model.Public;
import com.dvdstore.model.enums.MpaaRating;
import com.dvdstore.model.tables.records.FilmListRecord;

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
public class FilmList extends TableImpl<FilmListRecord> {

    private static final long serialVersionUID = 910072981;

    /**
     * The reference instance of <code>public.film_list</code>
     */
    public static final FilmList FILM_LIST = new FilmList();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FilmListRecord> getRecordType() {
        return FilmListRecord.class;
    }

    /**
     * The column <code>public.film_list.fid</code>.
     */
    public final TableField<FilmListRecord, Integer> FID = createField("fid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.film_list.title</code>.
     */
    public final TableField<FilmListRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.film_list.description</code>.
     */
    public final TableField<FilmListRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.film_list.category</code>.
     */
    public final TableField<FilmListRecord, String> CATEGORY = createField("category", org.jooq.impl.SQLDataType.VARCHAR(25), this, "");

    /**
     * The column <code>public.film_list.price</code>.
     */
    public final TableField<FilmListRecord, BigDecimal> PRICE = createField("price", org.jooq.impl.SQLDataType.NUMERIC(4, 2), this, "");

    /**
     * The column <code>public.film_list.length</code>.
     */
    public final TableField<FilmListRecord, Short> LENGTH = createField("length", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>public.film_list.rating</code>.
     */
    public final TableField<FilmListRecord, MpaaRating> RATING = createField("rating", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.dvdstore.model.enums.MpaaRating.class), this, "");

    /**
     * The column <code>public.film_list.actors</code>.
     */
    public final TableField<FilmListRecord, String> ACTORS = createField("actors", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>public.film_list</code> table reference
     */
    public FilmList() {
        this(DSL.name("film_list"), null);
    }

    /**
     * Create an aliased <code>public.film_list</code> table reference
     */
    public FilmList(String alias) {
        this(DSL.name(alias), FILM_LIST);
    }

    /**
     * Create an aliased <code>public.film_list</code> table reference
     */
    public FilmList(Name alias) {
        this(alias, FILM_LIST);
    }

    private FilmList(Name alias, Table<FilmListRecord> aliased) {
        this(alias, aliased, null);
    }

    private FilmList(Name alias, Table<FilmListRecord> aliased, Field<?>[] parameters) {
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
    public FilmList as(String alias) {
        return new FilmList(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmList as(Name alias) {
        return new FilmList(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FilmList rename(String name) {
        return new FilmList(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FilmList rename(Name name) {
        return new FilmList(name, null);
    }
}
