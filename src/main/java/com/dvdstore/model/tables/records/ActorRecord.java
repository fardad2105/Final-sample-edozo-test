/*
 * This file is generated by jOOQ.
*/
package com.dvdstore.model.tables.records;


import com.dvdstore.model.tables.Actor;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class ActorRecord extends UpdatableRecordImpl<ActorRecord> implements Record4<Integer, String, String, Timestamp> {

    private static final long serialVersionUID = -70669273;

    /**
     * Setter for <code>public.actor.actor_id</code>.
     */
    public void setActorId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.actor.actor_id</code>.
     */
    public Integer getActorId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.actor.first_name</code>.
     */
    public void setFirstName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.actor.first_name</code>.
     */
    public String getFirstName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.actor.last_name</code>.
     */
    public void setLastName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.actor.last_name</code>.
     */
    public String getLastName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.actor.last_update</code>.
     */
    public void setLastUpdate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.actor.last_update</code>.
     */
    public Timestamp getLastUpdate() {
        return (Timestamp) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Actor.ACTOR.ACTOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Actor.ACTOR.FIRST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Actor.ACTOR.LAST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return Actor.ACTOR.LAST_UPDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getActorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getLastUpdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getActorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getLastUpdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActorRecord value1(Integer value) {
        setActorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActorRecord value2(String value) {
        setFirstName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActorRecord value3(String value) {
        setLastName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActorRecord value4(Timestamp value) {
        setLastUpdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActorRecord values(Integer value1, String value2, String value3, Timestamp value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ActorRecord
     */
    public ActorRecord() {
        super(Actor.ACTOR);
    }

    /**
     * Create a detached, initialised ActorRecord
     */
    public ActorRecord(Integer actorId, String firstName, String lastName, Timestamp lastUpdate) {
        super(Actor.ACTOR);

        set(0, actorId);
        set(1, firstName);
        set(2, lastName);
        set(3, lastUpdate);
    }
}
