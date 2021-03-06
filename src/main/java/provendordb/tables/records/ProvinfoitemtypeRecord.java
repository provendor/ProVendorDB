/*
 * This file is generated by jOOQ.
*/
package provendordb.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import provendordb.tables.Provinfoitemtype;


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
public class ProvinfoitemtypeRecord extends UpdatableRecordImpl<ProvinfoitemtypeRecord> implements Record4<String, String, String, String> {

    private static final long serialVersionUID = 637431125;

    /**
     * Setter for <code>provinfoitemtype.provinfoitemtypeid</code>.
     */
    public void setProvinfoitemtypeid(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>provinfoitemtype.provinfoitemtypeid</code>.
     */
    public String getProvinfoitemtypeid() {
        return (String) get(0);
    }

    /**
     * Setter for <code>provinfoitemtype.provinfoitemtypename</code>.
     */
    public void setProvinfoitemtypename(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>provinfoitemtype.provinfoitemtypename</code>.
     */
    public String getProvinfoitemtypename() {
        return (String) get(1);
    }

    /**
     * Setter for <code>provinfoitemtype.provinfoitemtypedesc</code>.
     */
    public void setProvinfoitemtypedesc(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>provinfoitemtype.provinfoitemtypedesc</code>.
     */
    public String getProvinfoitemtypedesc() {
        return (String) get(2);
    }

    /**
     * Setter for <code>provinfoitemtype.provinfoitemid</code>.
     */
    public void setProvinfoitemid(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>provinfoitemtype.provinfoitemid</code>.
     */
    public String getProvinfoitemid() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Provinfoitemtype.PROVINFOITEMTYPE.PROVINFOITEMTYPEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Provinfoitemtype.PROVINFOITEMTYPE.PROVINFOITEMTYPENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Provinfoitemtype.PROVINFOITEMTYPE.PROVINFOITEMTYPEDESC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Provinfoitemtype.PROVINFOITEMTYPE.PROVINFOITEMID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getProvinfoitemtypeid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getProvinfoitemtypename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getProvinfoitemtypedesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getProvinfoitemid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getProvinfoitemtypeid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getProvinfoitemtypename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getProvinfoitemtypedesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getProvinfoitemid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProvinfoitemtypeRecord value1(String value) {
        setProvinfoitemtypeid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProvinfoitemtypeRecord value2(String value) {
        setProvinfoitemtypename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProvinfoitemtypeRecord value3(String value) {
        setProvinfoitemtypedesc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProvinfoitemtypeRecord value4(String value) {
        setProvinfoitemid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProvinfoitemtypeRecord values(String value1, String value2, String value3, String value4) {
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
     * Create a detached ProvinfoitemtypeRecord
     */
    public ProvinfoitemtypeRecord() {
        super(Provinfoitemtype.PROVINFOITEMTYPE);
    }

    /**
     * Create a detached, initialised ProvinfoitemtypeRecord
     */
    public ProvinfoitemtypeRecord(String provinfoitemtypeid, String provinfoitemtypename, String provinfoitemtypedesc, String provinfoitemid) {
        super(Provinfoitemtype.PROVINFOITEMTYPE);

        set(0, provinfoitemtypeid);
        set(1, provinfoitemtypename);
        set(2, provinfoitemtypedesc);
        set(3, provinfoitemid);
    }
}
