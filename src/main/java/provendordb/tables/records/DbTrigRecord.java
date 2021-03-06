/*
 * This file is generated by jOOQ.
*/
package provendordb.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;

import provendordb.tables.DbTrig;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DbTrigRecord extends TableRecordImpl<DbTrigRecord> implements Record7<String, String, String, String, Integer, Integer, String> {

    private static final long serialVersionUID = 659796392;

    /**
     * Setter for <code>db_trig.trigger_name</code>.
     */
    public void setTriggerName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_trig.trigger_name</code>.
     */
    public String getTriggerName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>db_trig.target_class_name</code>.
     */
    public void setTargetClassName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_trig.target_class_name</code>.
     */
    public String getTargetClassName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>db_trig.target_attr_name</code>.
     */
    public void setTargetAttrName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>db_trig.target_attr_name</code>.
     */
    public String getTargetAttrName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>db_trig.target_attr_type</code>.
     */
    public void setTargetAttrType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>db_trig.target_attr_type</code>.
     */
    public String getTargetAttrType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>db_trig.action_type</code>.
     */
    public void setActionType(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>db_trig.action_type</code>.
     */
    public Integer getActionType() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>db_trig.action_time</code>.
     */
    public void setActionTime(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>db_trig.action_time</code>.
     */
    public Integer getActionTime() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>db_trig.comment</code>.
     */
    public void setComment(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>db_trig.comment</code>.
     */
    public String getComment() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, String, Integer, Integer, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, String, Integer, Integer, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return DbTrig.DB_TRIG.TRIGGER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return DbTrig.DB_TRIG.TARGET_CLASS_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return DbTrig.DB_TRIG.TARGET_ATTR_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return DbTrig.DB_TRIG.TARGET_ATTR_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return DbTrig.DB_TRIG.ACTION_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return DbTrig.DB_TRIG.ACTION_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return DbTrig.DB_TRIG.COMMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getTriggerName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getTargetClassName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getTargetAttrName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getTargetAttrType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getActionType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getActionTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getComment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getTriggerName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTargetClassName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTargetAttrName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTargetAttrType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getActionType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getActionTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getComment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbTrigRecord value1(String value) {
        setTriggerName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbTrigRecord value2(String value) {
        setTargetClassName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbTrigRecord value3(String value) {
        setTargetAttrName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbTrigRecord value4(String value) {
        setTargetAttrType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbTrigRecord value5(Integer value) {
        setActionType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbTrigRecord value6(Integer value) {
        setActionTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbTrigRecord value7(String value) {
        setComment(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbTrigRecord values(String value1, String value2, String value3, String value4, Integer value5, Integer value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DbTrigRecord
     */
    public DbTrigRecord() {
        super(DbTrig.DB_TRIG);
    }

    /**
     * Create a detached, initialised DbTrigRecord
     */
    public DbTrigRecord(String triggerName, String targetClassName, String targetAttrName, String targetAttrType, Integer actionType, Integer actionTime, String comment) {
        super(DbTrig.DB_TRIG);

        set(0, triggerName);
        set(1, targetClassName);
        set(2, targetAttrName);
        set(3, targetAttrType);
        set(4, actionType);
        set(5, actionTime);
        set(6, comment);
    }
}
