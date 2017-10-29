/*
 * This file is generated by jOOQ.
*/
package provendordb.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;

import provendordb.tables._DbPartition;


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
public class _DbPartitionRecord extends TableRecordImpl<_DbPartitionRecord> implements Record6<Object, String, Integer, String, Object, String> {

    private static final long serialVersionUID = 1412696408;

    /**
     * Setter for <code>_db_partition.class_of</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public void setClassOf(Object value) {
        set(0, value);
    }

    /**
     * Getter for <code>_db_partition.class_of</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public Object getClassOf() {
        return (Object) get(0);
    }

    /**
     * Setter for <code>_db_partition.pname</code>.
     */
    public void setPname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>_db_partition.pname</code>.
     */
    public String getPname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>_db_partition.ptype</code>.
     */
    public void setPtype(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>_db_partition.ptype</code>.
     */
    public Integer getPtype() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>_db_partition.pexpr</code>.
     */
    public void setPexpr(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>_db_partition.pexpr</code>.
     */
    public String getPexpr() {
        return (String) get(3);
    }

    /**
     * Setter for <code>_db_partition.pvalues</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public void setPvalues(Object value) {
        set(4, value);
    }

    /**
     * Getter for <code>_db_partition.pvalues</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public Object getPvalues() {
        return (Object) get(4);
    }

    /**
     * Setter for <code>_db_partition.comment</code>.
     */
    public void setComment(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>_db_partition.comment</code>.
     */
    public String getComment() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Object, String, Integer, String, Object, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Object, String, Integer, String, Object, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field1() {
        return _DbPartition._DB_PARTITION.CLASS_OF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return _DbPartition._DB_PARTITION.PNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return _DbPartition._DB_PARTITION.PTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return _DbPartition._DB_PARTITION.PEXPR;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field5() {
        return _DbPartition._DB_PARTITION.PVALUES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return _DbPartition._DB_PARTITION.COMMENT;
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
        return getPname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getPtype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getPexpr();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object component5() {
        return getPvalues();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
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
        return getPname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getPtype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPexpr();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object value5() {
        return getPvalues();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getComment();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public _DbPartitionRecord value1(Object value) {
        setClassOf(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _DbPartitionRecord value2(String value) {
        setPname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _DbPartitionRecord value3(Integer value) {
        setPtype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _DbPartitionRecord value4(String value) {
        setPexpr(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public _DbPartitionRecord value5(Object value) {
        setPvalues(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _DbPartitionRecord value6(String value) {
        setComment(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _DbPartitionRecord values(Object value1, String value2, Integer value3, String value4, Object value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached _DbPartitionRecord
     */
    public _DbPartitionRecord() {
        super(_DbPartition._DB_PARTITION);
    }

    /**
     * Create a detached, initialised _DbPartitionRecord
     */
    public _DbPartitionRecord(Object classOf, String pname, Integer ptype, String pexpr, Object pvalues, String comment) {
        super(_DbPartition._DB_PARTITION);

        set(0, classOf);
        set(1, pname);
        set(2, ptype);
        set(3, pexpr);
        set(4, pvalues);
        set(5, comment);
    }
}