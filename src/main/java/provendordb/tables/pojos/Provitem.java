/*
 * This file is generated by jOOQ.
*/
package provendordb.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


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
public class Provitem implements Serializable {

    private static final long serialVersionUID = 211919515;

    private Integer provitemid;
    private String  provitemnumber;
    private String  provitemname;
    private String  provitemdescription;
    private String  provitemtypeid;
    private String  provitemgroupid;
    private String  provitemfarmerid;
    private String  provitemquantity;
    private Integer provitemminprice;
    private Integer provitemmaxprice;
    private String  provitemdeals;

    public Provitem() {}

    public Provitem(Provitem value) {
        this.provitemid = value.provitemid;
        this.provitemnumber = value.provitemnumber;
        this.provitemname = value.provitemname;
        this.provitemdescription = value.provitemdescription;
        this.provitemtypeid = value.provitemtypeid;
        this.provitemgroupid = value.provitemgroupid;
        this.provitemfarmerid = value.provitemfarmerid;
        this.provitemquantity = value.provitemquantity;
        this.provitemminprice = value.provitemminprice;
        this.provitemmaxprice = value.provitemmaxprice;
        this.provitemdeals = value.provitemdeals;
    }

    public Provitem(
        Integer provitemid,
        String  provitemnumber,
        String  provitemname,
        String  provitemdescription,
        String  provitemtypeid,
        String  provitemgroupid,
        String  provitemfarmerid,
        String  provitemquantity,
        Integer provitemminprice,
        Integer provitemmaxprice,
        String  provitemdeals
    ) {
        this.provitemid = provitemid;
        this.provitemnumber = provitemnumber;
        this.provitemname = provitemname;
        this.provitemdescription = provitemdescription;
        this.provitemtypeid = provitemtypeid;
        this.provitemgroupid = provitemgroupid;
        this.provitemfarmerid = provitemfarmerid;
        this.provitemquantity = provitemquantity;
        this.provitemminprice = provitemminprice;
        this.provitemmaxprice = provitemmaxprice;
        this.provitemdeals = provitemdeals;
    }

    public Integer getProvitemid() {
        return this.provitemid;
    }

    public void setProvitemid(Integer provitemid) {
        this.provitemid = provitemid;
    }

    public String getProvitemnumber() {
        return this.provitemnumber;
    }

    public void setProvitemnumber(String provitemnumber) {
        this.provitemnumber = provitemnumber;
    }

    public String getProvitemname() {
        return this.provitemname;
    }

    public void setProvitemname(String provitemname) {
        this.provitemname = provitemname;
    }

    public String getProvitemdescription() {
        return this.provitemdescription;
    }

    public void setProvitemdescription(String provitemdescription) {
        this.provitemdescription = provitemdescription;
    }

    public String getProvitemtypeid() {
        return this.provitemtypeid;
    }

    public void setProvitemtypeid(String provitemtypeid) {
        this.provitemtypeid = provitemtypeid;
    }

    public String getProvitemgroupid() {
        return this.provitemgroupid;
    }

    public void setProvitemgroupid(String provitemgroupid) {
        this.provitemgroupid = provitemgroupid;
    }

    public String getProvitemfarmerid() {
        return this.provitemfarmerid;
    }

    public void setProvitemfarmerid(String provitemfarmerid) {
        this.provitemfarmerid = provitemfarmerid;
    }

    public String getProvitemquantity() {
        return this.provitemquantity;
    }

    public void setProvitemquantity(String provitemquantity) {
        this.provitemquantity = provitemquantity;
    }

    public Integer getProvitemminprice() {
        return this.provitemminprice;
    }

    public void setProvitemminprice(Integer provitemminprice) {
        this.provitemminprice = provitemminprice;
    }

    public Integer getProvitemmaxprice() {
        return this.provitemmaxprice;
    }

    public void setProvitemmaxprice(Integer provitemmaxprice) {
        this.provitemmaxprice = provitemmaxprice;
    }

    public String getProvitemdeals() {
        return this.provitemdeals;
    }

    public void setProvitemdeals(String provitemdeals) {
        this.provitemdeals = provitemdeals;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Provitem (");

        sb.append(provitemid);
        sb.append(", ").append(provitemnumber);
        sb.append(", ").append(provitemname);
        sb.append(", ").append(provitemdescription);
        sb.append(", ").append(provitemtypeid);
        sb.append(", ").append(provitemgroupid);
        sb.append(", ").append(provitemfarmerid);
        sb.append(", ").append(provitemquantity);
        sb.append(", ").append(provitemminprice);
        sb.append(", ").append(provitemmaxprice);
        sb.append(", ").append(provitemdeals);

        sb.append(")");
        return sb.toString();
    }
}
