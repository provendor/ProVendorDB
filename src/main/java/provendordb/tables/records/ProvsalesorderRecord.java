/*
 * This file is generated by jOOQ.
*/
package provendordb.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;

import provendordb.tables.Provsalesorder;


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
public class ProvsalesorderRecord extends UpdatableRecordImpl<ProvsalesorderRecord> implements Record8<Integer, String, Integer, String, String, String, byte[], Integer> {

    private static final long serialVersionUID = 765888649;

    /**
     * Setter for <code>provsalesorder.provsalesorderid</code>.
     */
    public void setProvsalesorderid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>provsalesorder.provsalesorderid</code>.
     */
    public Integer getProvsalesorderid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>provsalesorder.provsalesordernumber</code>.
     */
    public void setProvsalesordernumber(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>provsalesorder.provsalesordernumber</code>.
     */
    public String getProvsalesordernumber() {
        return (String) get(1);
    }

    /**
     * Setter for <code>provsalesorder.provsalesorderamount</code>.
     */
    public void setProvsalesorderamount(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>provsalesorder.provsalesorderamount</code>.
     */
    public Integer getProvsalesorderamount() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>provsalesorder.provsalesordergeoloc</code>.
     */
    public void setProvsalesordergeoloc(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>provsalesorder.provsalesordergeoloc</code>.
     */
    public String getProvsalesordergeoloc() {
        return (String) get(3);
    }

    /**
     * Setter for <code>provsalesorder.provsalesorderaddress</code>.
     */
    public void setProvsalesorderaddress(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>provsalesorder.provsalesorderaddress</code>.
     */
    public String getProvsalesorderaddress() {
        return (String) get(4);
    }

    /**
     * Setter for <code>provsalesorder.provsalesorderdivision</code>.
     */
    public void setProvsalesorderdivision(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>provsalesorder.provsalesorderdivision</code>.
     */
    public String getProvsalesorderdivision() {
        return (String) get(5);
    }

    /**
     * Setter for <code>provsalesorder.provsalesorderpaid</code>.
     */
    public void setProvsalesorderpaid(byte... value) {
        set(6, value);
    }

    /**
     * Getter for <code>provsalesorder.provsalesorderpaid</code>.
     */
    public byte[] getProvsalesorderpaid() {
        return (byte[]) get(6);
    }

    /**
     * Setter for <code>provsalesorder.provsalesorderuserid</code>.
     */
    public void setProvsalesorderuserid(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>provsalesorder.provsalesorderuserid</code>.
     */
    public Integer getProvsalesorderuserid() {
        return (Integer) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, Integer, String, String, String, byte[], Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, Integer, String, String, String, byte[], Integer> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Provsalesorder.PROVSALESORDER.PROVSALESORDERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Provsalesorder.PROVSALESORDER.PROVSALESORDERNUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Provsalesorder.PROVSALESORDER.PROVSALESORDERAMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Provsalesorder.PROVSALESORDER.PROVSALESORDERGEOLOC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Provsalesorder.PROVSALESORDER.PROVSALESORDERADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Provsalesorder.PROVSALESORDER.PROVSALESORDERDIVISION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field7() {
        return Provsalesorder.PROVSALESORDER.PROVSALESORDERPAID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return Provsalesorder.PROVSALESORDER.PROVSALESORDERUSERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getProvsalesorderid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getProvsalesordernumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getProvsalesorderamount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getProvsalesordergeoloc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getProvsalesorderaddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getProvsalesorderdivision();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component7() {
        return getProvsalesorderpaid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getProvsalesorderuserid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getProvsalesorderid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getProvsalesordernumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getProvsalesorderamount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getProvsalesordergeoloc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getProvsalesorderaddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getProvsalesorderdivision();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value7() {
        return getProvsalesorderpaid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getProvsalesorderuserid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProvsalesorderRecord value1(Integer value) {
        setProvsalesorderid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProvsalesorderRecord value2(String value) {
        setProvsalesordernumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProvsalesorderRecord value3(Integer value) {
        setProvsalesorderamount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProvsalesorderRecord value4(String value) {
        setProvsalesordergeoloc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProvsalesorderRecord value5(String value) {
        setProvsalesorderaddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProvsalesorderRecord value6(String value) {
        setProvsalesorderdivision(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProvsalesorderRecord value7(byte... value) {
        setProvsalesorderpaid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProvsalesorderRecord value8(Integer value) {
        setProvsalesorderuserid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProvsalesorderRecord values(Integer value1, String value2, Integer value3, String value4, String value5, String value6, byte[] value7, Integer value8) {
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
     * Create a detached ProvsalesorderRecord
     */
    public ProvsalesorderRecord() {
        super(Provsalesorder.PROVSALESORDER);
    }

    /**
     * Create a detached, initialised ProvsalesorderRecord
     */
    public ProvsalesorderRecord(Integer provsalesorderid, String provsalesordernumber, Integer provsalesorderamount, String provsalesordergeoloc, String provsalesorderaddress, String provsalesorderdivision, byte[] provsalesorderpaid, Integer provsalesorderuserid) {
        super(Provsalesorder.PROVSALESORDER);

        set(0, provsalesorderid);
        set(1, provsalesordernumber);
        set(2, provsalesorderamount);
        set(3, provsalesordergeoloc);
        set(4, provsalesorderaddress);
        set(5, provsalesorderdivision);
        set(6, provsalesorderpaid);
        set(7, provsalesorderuserid);
    }
}
