/*
 * This file is generated by jOOQ.
*/
package provendordb.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;

import provendordb.tables.DbAttrSetdomainElm;


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
public class DbAttrSetdomainElmRecord extends TableRecordImpl<DbAttrSetdomainElmRecord> implements Record8<String, String, String, String, Integer, Integer, Integer, String> {

    private static final long serialVersionUID = 1392054180;

    /**
     * Setter for <code>db_attr_setdomain_elm.attr_name</code>.
     */
    public void setAttrName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_attr_setdomain_elm.attr_name</code>.
     */
    public String getAttrName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>db_attr_setdomain_elm.class_name</code>.
     */
    public void setClassName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_attr_setdomain_elm.class_name</code>.
     */
    public String getClassName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>db_attr_setdomain_elm.attr_type</code>.
     */
    public void setAttrType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>db_attr_setdomain_elm.attr_type</code>.
     */
    public String getAttrType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>db_attr_setdomain_elm.data_type</code>.
     */
    public void setDataType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>db_attr_setdomain_elm.data_type</code>.
     */
    public String getDataType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>db_attr_setdomain_elm.prec</code>.
     */
    public void setPrec(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>db_attr_setdomain_elm.prec</code>.
     */
    public Integer getPrec() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>db_attr_setdomain_elm.scale</code>.
     */
    public void setScale(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>db_attr_setdomain_elm.scale</code>.
     */
    public Integer getScale() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>db_attr_setdomain_elm.code_set</code>.
     */
    public void setCodeSet(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>db_attr_setdomain_elm.code_set</code>.
     */
    public Integer getCodeSet() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>db_attr_setdomain_elm.domain_class_name</code>.
     */
    public void setDomainClassName(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>db_attr_setdomain_elm.domain_class_name</code>.
     */
    public String getDomainClassName() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, String, String, String, Integer, Integer, Integer, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, String, String, String, Integer, Integer, Integer, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return DbAttrSetdomainElm.DB_ATTR_SETDOMAIN_ELM.ATTR_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return DbAttrSetdomainElm.DB_ATTR_SETDOMAIN_ELM.CLASS_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return DbAttrSetdomainElm.DB_ATTR_SETDOMAIN_ELM.ATTR_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return DbAttrSetdomainElm.DB_ATTR_SETDOMAIN_ELM.DATA_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return DbAttrSetdomainElm.DB_ATTR_SETDOMAIN_ELM.PREC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return DbAttrSetdomainElm.DB_ATTR_SETDOMAIN_ELM.SCALE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return DbAttrSetdomainElm.DB_ATTR_SETDOMAIN_ELM.CODE_SET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return DbAttrSetdomainElm.DB_ATTR_SETDOMAIN_ELM.DOMAIN_CLASS_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getAttrName();
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
        return getAttrType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getDataType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getPrec();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getScale();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getCodeSet();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getDomainClassName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getAttrName();
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
        return getAttrType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDataType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getPrec();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getScale();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getCodeSet();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getDomainClassName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbAttrSetdomainElmRecord value1(String value) {
        setAttrName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbAttrSetdomainElmRecord value2(String value) {
        setClassName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbAttrSetdomainElmRecord value3(String value) {
        setAttrType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbAttrSetdomainElmRecord value4(String value) {
        setDataType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbAttrSetdomainElmRecord value5(Integer value) {
        setPrec(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbAttrSetdomainElmRecord value6(Integer value) {
        setScale(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbAttrSetdomainElmRecord value7(Integer value) {
        setCodeSet(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbAttrSetdomainElmRecord value8(String value) {
        setDomainClassName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbAttrSetdomainElmRecord values(String value1, String value2, String value3, String value4, Integer value5, Integer value6, Integer value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DbAttrSetdomainElmRecord
     */
    public DbAttrSetdomainElmRecord() {
        super(DbAttrSetdomainElm.DB_ATTR_SETDOMAIN_ELM);
    }

    /**
     * Create a detached, initialised DbAttrSetdomainElmRecord
     */
    public DbAttrSetdomainElmRecord(String attrName, String className, String attrType, String dataType, Integer prec, Integer scale, Integer codeSet, String domainClassName) {
        super(DbAttrSetdomainElm.DB_ATTR_SETDOMAIN_ELM);

        set(0, attrName);
        set(1, className);
        set(2, attrType);
        set(3, dataType);
        set(4, prec);
        set(5, scale);
        set(6, codeSet);
        set(7, domainClassName);
    }
}
