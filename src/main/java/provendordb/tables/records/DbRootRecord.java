/*
 * This file is generated by jOOQ.
*/
package provendordb.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;

import provendordb.tables.DbRoot;


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
public class DbRootRecord extends TableRecordImpl<DbRootRecord> implements Record4<Object, Integer, String, String> {

    private static final long serialVersionUID = -1106390262;

    /**
     * Setter for <code>db_root.triggers</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public void setTriggers(Object value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_root.triggers</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public Object getTriggers() {
        return (Object) get(0);
    }

    /**
     * Setter for <code>db_root.charset</code>.
     */
    public void setCharset(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_root.charset</code>.
     */
    public Integer getCharset() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>db_root.lang</code>.
     */
    public void setLang(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>db_root.lang</code>.
     */
    public String getLang() {
        return (String) get(2);
    }

    /**
     * Setter for <code>db_root.timezone_checksum</code>.
     */
    public void setTimezoneChecksum(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>db_root.timezone_checksum</code>.
     */
    public String getTimezoneChecksum() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Object, Integer, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Object, Integer, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field1() {
        return DbRoot.DB_ROOT.TRIGGERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return DbRoot.DB_ROOT.CHARSET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return DbRoot.DB_ROOT.LANG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return DbRoot.DB_ROOT.TIMEZONE_CHECKSUM;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object component1() {
        return getTriggers();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getCharset();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getLang();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getTimezoneChecksum();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object value1() {
        return getTriggers();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getCharset();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLang();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTimezoneChecksum();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public DbRootRecord value1(Object value) {
        setTriggers(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbRootRecord value2(Integer value) {
        setCharset(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbRootRecord value3(String value) {
        setLang(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbRootRecord value4(String value) {
        setTimezoneChecksum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbRootRecord values(Object value1, Integer value2, String value3, String value4) {
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
     * Create a detached DbRootRecord
     */
    public DbRootRecord() {
        super(DbRoot.DB_ROOT);
    }

    /**
     * Create a detached, initialised DbRootRecord
     */
    public DbRootRecord(Object triggers, Integer charset, String lang, String timezoneChecksum) {
        super(DbRoot.DB_ROOT);

        set(0, triggers);
        set(1, charset);
        set(2, lang);
        set(3, timezoneChecksum);
    }
}
