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
public class _DbDataType implements Serializable {

    private static final long serialVersionUID = 1812729973;

    private Integer typeId;
    private String  typeName;

    public _DbDataType() {}

    public _DbDataType(_DbDataType value) {
        this.typeId = value.typeId;
        this.typeName = value.typeName;
    }

    public _DbDataType(
        Integer typeId,
        String  typeName
    ) {
        this.typeId = typeId;
        this.typeName = typeName;
    }

    public Integer getTypeId() {
        return this.typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return this.typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("_DbDataType (");

        sb.append(typeId);
        sb.append(", ").append(typeName);

        sb.append(")");
        return sb.toString();
    }
}