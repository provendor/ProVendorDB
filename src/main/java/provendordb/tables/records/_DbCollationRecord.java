/*
 * This file is generated by jOOQ.
*/
package provendordb.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;

import provendordb.tables._DbCollation;


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
public class _DbCollationRecord extends TableRecordImpl<_DbCollationRecord> implements Record8<Integer, String, Integer, Integer, Integer, Integer, Integer, String> {

    private static final long serialVersionUID = 201336442;

    /**
     * Setter for <code>_db_collation.coll_id</code>.
     */
    public void setCollId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>_db_collation.coll_id</code>.
     */
    public Integer getCollId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>_db_collation.coll_name</code>.
     */
    public void setCollName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>_db_collation.coll_name</code>.
     */
    public String getCollName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>_db_collation.charset_id</code>.
     */
    public void setCharsetId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>_db_collation.charset_id</code>.
     */
    public Integer getCharsetId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>_db_collation.built_in</code>.
     */
    public void setBuiltIn(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>_db_collation.built_in</code>.
     */
    public Integer getBuiltIn() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>_db_collation.expansions</code>.
     */
    public void setExpansions(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>_db_collation.expansions</code>.
     */
    public Integer getExpansions() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>_db_collation.contractions</code>.
     */
    public void setContractions(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>_db_collation.contractions</code>.
     */
    public Integer getContractions() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>_db_collation.uca_strength</code>.
     */
    public void setUcaStrength(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>_db_collation.uca_strength</code>.
     */
    public Integer getUcaStrength() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>_db_collation.checksum</code>.
     */
    public void setChecksum(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>_db_collation.checksum</code>.
     */
    public String getChecksum() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, Integer, Integer, Integer, Integer, Integer, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, Integer, Integer, Integer, Integer, Integer, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return _DbCollation._DB_COLLATION.COLL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return _DbCollation._DB_COLLATION.COLL_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return _DbCollation._DB_COLLATION.CHARSET_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return _DbCollation._DB_COLLATION.BUILT_IN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return _DbCollation._DB_COLLATION.EXPANSIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return _DbCollation._DB_COLLATION.CONTRACTIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return _DbCollation._DB_COLLATION.UCA_STRENGTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return _DbCollation._DB_COLLATION.CHECKSUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getCollId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getCollName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getCharsetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getBuiltIn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getExpansions();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getContractions();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getUcaStrength();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getChecksum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getCollId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getCollName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getCharsetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getBuiltIn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getExpansions();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getContractions();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getUcaStrength();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getChecksum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _DbCollationRecord value1(Integer value) {
        setCollId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _DbCollationRecord value2(String value) {
        setCollName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _DbCollationRecord value3(Integer value) {
        setCharsetId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _DbCollationRecord value4(Integer value) {
        setBuiltIn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _DbCollationRecord value5(Integer value) {
        setExpansions(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _DbCollationRecord value6(Integer value) {
        setContractions(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _DbCollationRecord value7(Integer value) {
        setUcaStrength(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _DbCollationRecord value8(String value) {
        setChecksum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _DbCollationRecord values(Integer value1, String value2, Integer value3, Integer value4, Integer value5, Integer value6, Integer value7, String value8) {
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
     * Create a detached _DbCollationRecord
     */
    public _DbCollationRecord() {
        super(_DbCollation._DB_COLLATION);
    }

    /**
     * Create a detached, initialised _DbCollationRecord
     */
    public _DbCollationRecord(Integer collId, String collName, Integer charsetId, Integer builtIn, Integer expansions, Integer contractions, Integer ucaStrength, String checksum) {
        super(_DbCollation._DB_COLLATION);

        set(0, collId);
        set(1, collName);
        set(2, charsetId);
        set(3, builtIn);
        set(4, expansions);
        set(5, contractions);
        set(6, ucaStrength);
        set(7, checksum);
    }
}
