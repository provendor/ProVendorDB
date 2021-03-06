/*
 * This file is generated by jOOQ.
*/
package provendordb.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.TableRecordImpl;

import provendordb.tables.DbMethArg;


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
public class DbMethArgRecord extends TableRecordImpl<DbMethArgRecord> implements Record9<String, String, String, Integer, String, Integer, Integer, Integer, String> {

    private static final long serialVersionUID = 217894894;

    /**
     * Setter for <code>db_meth_arg.meth_name</code>.
     */
    public void setMethName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_meth_arg.meth_name</code>.
     */
    public String getMethName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>db_meth_arg.class_name</code>.
     */
    public void setClassName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_meth_arg.class_name</code>.
     */
    public String getClassName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>db_meth_arg.meth_type</code>.
     */
    public void setMethType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>db_meth_arg.meth_type</code>.
     */
    public String getMethType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>db_meth_arg.index_of</code>.
     */
    public void setIndexOf(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>db_meth_arg.index_of</code>.
     */
    public Integer getIndexOf() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>db_meth_arg.data_type</code>.
     */
    public void setDataType(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>db_meth_arg.data_type</code>.
     */
    public String getDataType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>db_meth_arg.prec</code>.
     */
    public void setPrec(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>db_meth_arg.prec</code>.
     */
    public Integer getPrec() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>db_meth_arg.scale</code>.
     */
    public void setScale(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>db_meth_arg.scale</code>.
     */
    public Integer getScale() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>db_meth_arg.code_set</code>.
     */
    public void setCodeSet(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>db_meth_arg.code_set</code>.
     */
    public Integer getCodeSet() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>db_meth_arg.domain_class_name</code>.
     */
    public void setDomainClassName(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>db_meth_arg.domain_class_name</code>.
     */
    public String getDomainClassName() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<String, String, String, Integer, String, Integer, Integer, Integer, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<String, String, String, Integer, String, Integer, Integer, Integer, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return DbMethArg.DB_METH_ARG.METH_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return DbMethArg.DB_METH_ARG.CLASS_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return DbMethArg.DB_METH_ARG.METH_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return DbMethArg.DB_METH_ARG.INDEX_OF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return DbMethArg.DB_METH_ARG.DATA_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return DbMethArg.DB_METH_ARG.PREC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return DbMethArg.DB_METH_ARG.SCALE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return DbMethArg.DB_METH_ARG.CODE_SET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return DbMethArg.DB_METH_ARG.DOMAIN_CLASS_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getMethName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getClassName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getMethType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getIndexOf();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getDataType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getPrec();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getScale();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getCodeSet();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getDomainClassName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getMethName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getClassName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getMethType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getIndexOf();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getDataType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getPrec();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getScale();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getCodeSet();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getDomainClassName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbMethArgRecord value1(String value) {
        setMethName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbMethArgRecord value2(String value) {
        setClassName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbMethArgRecord value3(String value) {
        setMethType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbMethArgRecord value4(Integer value) {
        setIndexOf(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbMethArgRecord value5(String value) {
        setDataType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbMethArgRecord value6(Integer value) {
        setPrec(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbMethArgRecord value7(Integer value) {
        setScale(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbMethArgRecord value8(Integer value) {
        setCodeSet(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbMethArgRecord value9(String value) {
        setDomainClassName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbMethArgRecord values(String value1, String value2, String value3, Integer value4, String value5, Integer value6, Integer value7, Integer value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DbMethArgRecord
     */
    public DbMethArgRecord() {
        super(DbMethArg.DB_METH_ARG);
    }

    /**
     * Create a detached, initialised DbMethArgRecord
     */
    public DbMethArgRecord(String methName, String className, String methType, Integer indexOf, String dataType, Integer prec, Integer scale, Integer codeSet, String domainClassName) {
        super(DbMethArg.DB_METH_ARG);

        set(0, methName);
        set(1, className);
        set(2, methType);
        set(3, indexOf);
        set(4, dataType);
        set(5, prec);
        set(6, scale);
        set(7, codeSet);
        set(8, domainClassName);
    }
}
