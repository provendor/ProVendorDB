/*
 * This file is generated by jOOQ.
*/
package provendordb.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.TableRecordImpl;

import provendordb.tables._DbAttribute;


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
public class _DbAttributeRecord extends TableRecordImpl<_DbAttributeRecord> implements Record11<Object, String, Integer, Object, String, Integer, Integer, String, Object, Integer, String> {

    private static final long serialVersionUID = -565677252;

    /**
     * Setter for <code>_db_attribute.class_of</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public void setClassOf(Object value) {
        set(0, value);
    }

    /**
     * Getter for <code>_db_attribute.class_of</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public Object getClassOf() {
        return (Object) get(0);
    }

    /**
     * Setter for <code>_db_attribute.attr_name</code>.
     */
    public void setAttrName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>_db_attribute.attr_name</code>.
     */
    public String getAttrName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>_db_attribute.attr_type</code>.
     */
    public void setAttrType(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>_db_attribute.attr_type</code>.
     */
    public Integer getAttrType() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>_db_attribute.from_class_of</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public void setFromClassOf(Object value) {
        set(3, value);
    }

    /**
     * Getter for <code>_db_attribute.from_class_of</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public Object getFromClassOf() {
        return (Object) get(3);
    }

    /**
     * Setter for <code>_db_attribute.from_attr_name</code>.
     */
    public void setFromAttrName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>_db_attribute.from_attr_name</code>.
     */
    public String getFromAttrName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>_db_attribute.def_order</code>.
     */
    public void setDefOrder(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>_db_attribute.def_order</code>.
     */
    public Integer getDefOrder() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>_db_attribute.data_type</code>.
     */
    public void setDataType(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>_db_attribute.data_type</code>.
     */
    public Integer getDataType() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>_db_attribute.default_value</code>.
     */
    public void setDefaultValue(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>_db_attribute.default_value</code>.
     */
    public String getDefaultValue() {
        return (String) get(7);
    }

    /**
     * Setter for <code>_db_attribute.domains</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public void setDomains(Object value) {
        set(8, value);
    }

    /**
     * Getter for <code>_db_attribute.domains</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public Object getDomains() {
        return (Object) get(8);
    }

    /**
     * Setter for <code>_db_attribute.is_nullable</code>.
     */
    public void setIsNullable(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>_db_attribute.is_nullable</code>.
     */
    public Integer getIsNullable() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>_db_attribute.comment</code>.
     */
    public void setComment(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>_db_attribute.comment</code>.
     */
    public String getComment() {
        return (String) get(10);
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Object, String, Integer, Object, String, Integer, Integer, String, Object, Integer, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Object, String, Integer, Object, String, Integer, Integer, String, Object, Integer, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field1() {
        return _DbAttribute._DB_ATTRIBUTE.CLASS_OF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return _DbAttribute._DB_ATTRIBUTE.ATTR_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return _DbAttribute._DB_ATTRIBUTE.ATTR_TYPE;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field4() {
        return _DbAttribute._DB_ATTRIBUTE.FROM_CLASS_OF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return _DbAttribute._DB_ATTRIBUTE.FROM_ATTR_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return _DbAttribute._DB_ATTRIBUTE.DEF_ORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return _DbAttribute._DB_ATTRIBUTE.DATA_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return _DbAttribute._DB_ATTRIBUTE.DEFAULT_VALUE;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field9() {
        return _DbAttribute._DB_ATTRIBUTE.DOMAINS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return _DbAttribute._DB_ATTRIBUTE.IS_NULLABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return _DbAttribute._DB_ATTRIBUTE.COMMENT;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object component1() {
        return getClassOf();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getAttrName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getAttrType();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object component4() {
        return getFromClassOf();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getFromAttrName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getDefOrder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getDataType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getDefaultValue();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object component9() {
        return getDomains();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getIsNullable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getComment();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object value1() {
        return getClassOf();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getAttrName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getAttrType();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object value4() {
        return getFromClassOf();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getFromAttrName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getDefOrder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getDataType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getDefaultValue();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object value9() {
        return getDomains();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getIsNullable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getComment();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public _DbAttributeRecord value1(Object value) {
        setClassOf(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _DbAttributeRecord value2(String value) {
        setAttrName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _DbAttributeRecord value3(Integer value) {
        setAttrType(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public _DbAttributeRecord value4(Object value) {
        setFromClassOf(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _DbAttributeRecord value5(String value) {
        setFromAttrName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _DbAttributeRecord value6(Integer value) {
        setDefOrder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _DbAttributeRecord value7(Integer value) {
        setDataType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _DbAttributeRecord value8(String value) {
        setDefaultValue(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public _DbAttributeRecord value9(Object value) {
        setDomains(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _DbAttributeRecord value10(Integer value) {
        setIsNullable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _DbAttributeRecord value11(String value) {
        setComment(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _DbAttributeRecord values(Object value1, String value2, Integer value3, Object value4, String value5, Integer value6, Integer value7, String value8, Object value9, Integer value10, String value11) {
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
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached _DbAttributeRecord
     */
    public _DbAttributeRecord() {
        super(_DbAttribute._DB_ATTRIBUTE);
    }

    /**
     * Create a detached, initialised _DbAttributeRecord
     */
    public _DbAttributeRecord(Object classOf, String attrName, Integer attrType, Object fromClassOf, String fromAttrName, Integer defOrder, Integer dataType, String defaultValue, Object domains, Integer isNullable, String comment) {
        super(_DbAttribute._DB_ATTRIBUTE);

        set(0, classOf);
        set(1, attrName);
        set(2, attrType);
        set(3, fromClassOf);
        set(4, fromAttrName);
        set(5, defOrder);
        set(6, dataType);
        set(7, defaultValue);
        set(8, domains);
        set(9, isNullable);
        set(10, comment);
    }
}
