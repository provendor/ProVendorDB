/*
 * This file is generated by jOOQ.
*/
package provendordb.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Record2;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;

import provendordb.tables.Provitem;


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
public class ProvitemRecord extends UpdatableRecordImpl<ProvitemRecord> implements Record11<Integer, String, String, String, String, String, String, String, Integer, Integer, String> {

    private static final long serialVersionUID = -898274312;

    /**
     * Setter for <code>provitem.provitemid</code>.
     */
    public void setProvitemid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>provitem.provitemid</code>.
     */
    public Integer getProvitemid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>provitem.provitemnumber</code>.
     */
    public void setProvitemnumber(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>provitem.provitemnumber</code>.
     */
    public String getProvitemnumber() {
        return (String) get(1);
    }

    /**
     * Setter for <code>provitem.provitemname</code>.
     */
    public void setProvitemname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>provitem.provitemname</code>.
     */
    public String getProvitemname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>provitem.provitemdescription</code>.
     */
    public void setProvitemdescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>provitem.provitemdescription</code>.
     */
    public String getProvitemdescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>provitem.provitemtypeid</code>.
     */
    public void setProvitemtypeid(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>provitem.provitemtypeid</code>.
     */
    public String getProvitemtypeid() {
        return (String) get(4);
    }

    /**
     * Setter for <code>provitem.provitemgroupid</code>.
     */
    public void setProvitemgroupid(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>provitem.provitemgroupid</code>.
     */
    public String getProvitemgroupid() {
        return (String) get(5);
    }

    /**
     * Setter for <code>provitem.provitemfarmerid</code>.
     */
    public void setProvitemfarmerid(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>provitem.provitemfarmerid</code>.
     */
    public String getProvitemfarmerid() {
        return (String) get(6);
    }

    /**
     * Setter for <code>provitem.provitemquantity</code>.
     */
    public void setProvitemquantity(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>provitem.provitemquantity</code>.
     */
    public String getProvitemquantity() {
        return (String) get(7);
    }

    /**
     * Setter for <code>provitem.provitemminprice</code>.
     */
    public void setProvitemminprice(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>provitem.provitemminprice</code>.
     */
    public Integer getProvitemminprice() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>provitem.provitemmaxprice</code>.
     */
    public void setProvitemmaxprice(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>provitem.provitemmaxprice</code>.
     */
    public Integer getProvitemmaxprice() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>provitem.provitemdeals</code>.
     */
    public void setProvitemdeals(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>provitem.provitemdeals</code>.
     */
    public String getProvitemdeals() {
        return (String) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Integer, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, String, String, String, String, String, String, String, Integer, Integer, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, String, String, String, String, String, String, String, Integer, Integer, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Provitem.PROVITEM.PROVITEMID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Provitem.PROVITEM.PROVITEMNUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Provitem.PROVITEM.PROVITEMNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Provitem.PROVITEM.PROVITEMDESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Provitem.PROVITEM.PROVITEMTYPEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Provitem.PROVITEM.PROVITEMGROUPID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Provitem.PROVITEM.PROVITEMFARMERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Provitem.PROVITEM.PROVITEMQUANTITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return Provitem.PROVITEM.PROVITEMMINPRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return Provitem.PROVITEM.PROVITEMMAXPRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Provitem.PROVITEM.PROVITEMDEALS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getProvitemid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getProvitemnumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getProvitemname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getProvitemdescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getProvitemtypeid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getProvitemgroupid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getProvitemfarmerid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getProvitemquantity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getProvitemminprice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getProvitemmaxprice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getProvitemdeals();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getProvitemid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getProvitemnumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getProvitemname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getProvitemdescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getProvitemtypeid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getProvitemgroupid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getProvitemfarmerid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getProvitemquantity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getProvitemminprice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getProvitemmaxprice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getProvitemdeals();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProvitemRecord value1(Integer value) {
        setProvitemid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProvitemRecord value2(String value) {
        setProvitemnumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProvitemRecord value3(String value) {
        setProvitemname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProvitemRecord value4(String value) {
        setProvitemdescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProvitemRecord value5(String value) {
        setProvitemtypeid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProvitemRecord value6(String value) {
        setProvitemgroupid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProvitemRecord value7(String value) {
        setProvitemfarmerid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProvitemRecord value8(String value) {
        setProvitemquantity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProvitemRecord value9(Integer value) {
        setProvitemminprice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProvitemRecord value10(Integer value) {
        setProvitemmaxprice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProvitemRecord value11(String value) {
        setProvitemdeals(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProvitemRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, Integer value9, Integer value10, String value11) {
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
     * Create a detached ProvitemRecord
     */
    public ProvitemRecord() {
        super(Provitem.PROVITEM);
    }

    /**
     * Create a detached, initialised ProvitemRecord
     */
    public ProvitemRecord(Integer provitemid, String provitemnumber, String provitemname, String provitemdescription, String provitemtypeid, String provitemgroupid, String provitemfarmerid, String provitemquantity, Integer provitemminprice, Integer provitemmaxprice, String provitemdeals) {
        super(Provitem.PROVITEM);

        set(0, provitemid);
        set(1, provitemnumber);
        set(2, provitemname);
        set(3, provitemdescription);
        set(4, provitemtypeid);
        set(5, provitemgroupid);
        set(6, provitemfarmerid);
        set(7, provitemquantity);
        set(8, provitemminprice);
        set(9, provitemmaxprice);
        set(10, provitemdeals);
    }
}
