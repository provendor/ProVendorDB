/*
 * This file is generated by jOOQ.
*/
package provendordb.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;

import provendordb.tables.DbDirectSuperClass;


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
public class DbDirectSuperClassRecord extends TableRecordImpl<DbDirectSuperClassRecord> implements Record2<String, String> {

    private static final long serialVersionUID = 22276600;

    /**
     * Setter for <code>db_direct_super_class.class_name</code>.
     */
    public void setClassName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_direct_super_class.class_name</code>.
     */
    public String getClassName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>db_direct_super_class.super_class_name</code>.
     */
    public void setSuperClassName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_direct_super_class.super_class_name</code>.
     */
    public String getSuperClassName() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return DbDirectSuperClass.DB_DIRECT_SUPER_CLASS.CLASS_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return DbDirectSuperClass.DB_DIRECT_SUPER_CLASS.SUPER_CLASS_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getClassName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getSuperClassName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getClassName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getSuperClassName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbDirectSuperClassRecord value1(String value) {
        setClassName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbDirectSuperClassRecord value2(String value) {
        setSuperClassName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbDirectSuperClassRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DbDirectSuperClassRecord
     */
    public DbDirectSuperClassRecord() {
        super(DbDirectSuperClass.DB_DIRECT_SUPER_CLASS);
    }

    /**
     * Create a detached, initialised DbDirectSuperClassRecord
     */
    public DbDirectSuperClassRecord(String className, String superClassName) {
        super(DbDirectSuperClass.DB_DIRECT_SUPER_CLASS);

        set(0, className);
        set(1, superClassName);
    }
}