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
public class _DbIndexKey implements Serializable {

    private static final long serialVersionUID = -714437487;

    private Object  indexOf;
    private String  keyAttrName;
    private Integer keyOrder;
    private Integer ascDesc;
    private Integer keyPrefixLength;
    private String  func;

    public _DbIndexKey() {}

    public _DbIndexKey(_DbIndexKey value) {
        this.indexOf = value.indexOf;
        this.keyAttrName = value.keyAttrName;
        this.keyOrder = value.keyOrder;
        this.ascDesc = value.ascDesc;
        this.keyPrefixLength = value.keyPrefixLength;
        this.func = value.func;
    }

    public _DbIndexKey(
        Object  indexOf,
        String  keyAttrName,
        Integer keyOrder,
        Integer ascDesc,
        Integer keyPrefixLength,
        String  func
    ) {
        this.indexOf = indexOf;
        this.keyAttrName = keyAttrName;
        this.keyOrder = keyOrder;
        this.ascDesc = ascDesc;
        this.keyPrefixLength = keyPrefixLength;
        this.func = func;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public Object getIndexOf() {
        return this.indexOf;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public void setIndexOf(Object indexOf) {
        this.indexOf = indexOf;
    }

    public String getKeyAttrName() {
        return this.keyAttrName;
    }

    public void setKeyAttrName(String keyAttrName) {
        this.keyAttrName = keyAttrName;
    }

    public Integer getKeyOrder() {
        return this.keyOrder;
    }

    public void setKeyOrder(Integer keyOrder) {
        this.keyOrder = keyOrder;
    }

    public Integer getAscDesc() {
        return this.ascDesc;
    }

    public void setAscDesc(Integer ascDesc) {
        this.ascDesc = ascDesc;
    }

    public Integer getKeyPrefixLength() {
        return this.keyPrefixLength;
    }

    public void setKeyPrefixLength(Integer keyPrefixLength) {
        this.keyPrefixLength = keyPrefixLength;
    }

    public String getFunc() {
        return this.func;
    }

    public void setFunc(String func) {
        this.func = func;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("_DbIndexKey (");

        sb.append(indexOf);
        sb.append(", ").append(keyAttrName);
        sb.append(", ").append(keyOrder);
        sb.append(", ").append(ascDesc);
        sb.append(", ").append(keyPrefixLength);
        sb.append(", ").append(func);

        sb.append(")");
        return sb.toString();
    }
}
