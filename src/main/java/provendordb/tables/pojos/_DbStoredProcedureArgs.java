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
public class _DbStoredProcedureArgs implements Serializable {

    private static final long serialVersionUID = -754790471;

    private String  spName;
    private Integer indexOf;
    private String  argName;
    private Integer dataType;
    private Integer mode;
    private String  comment;

    public _DbStoredProcedureArgs() {}

    public _DbStoredProcedureArgs(_DbStoredProcedureArgs value) {
        this.spName = value.spName;
        this.indexOf = value.indexOf;
        this.argName = value.argName;
        this.dataType = value.dataType;
        this.mode = value.mode;
        this.comment = value.comment;
    }

    public _DbStoredProcedureArgs(
        String  spName,
        Integer indexOf,
        String  argName,
        Integer dataType,
        Integer mode,
        String  comment
    ) {
        this.spName = spName;
        this.indexOf = indexOf;
        this.argName = argName;
        this.dataType = dataType;
        this.mode = mode;
        this.comment = comment;
    }

    public String getSpName() {
        return this.spName;
    }

    public void setSpName(String spName) {
        this.spName = spName;
    }

    public Integer getIndexOf() {
        return this.indexOf;
    }

    public void setIndexOf(Integer indexOf) {
        this.indexOf = indexOf;
    }

    public String getArgName() {
        return this.argName;
    }

    public void setArgName(String argName) {
        this.argName = argName;
    }

    public Integer getDataType() {
        return this.dataType;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    public Integer getMode() {
        return this.mode;
    }

    public void setMode(Integer mode) {
        this.mode = mode;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("_DbStoredProcedureArgs (");

        sb.append(spName);
        sb.append(", ").append(indexOf);
        sb.append(", ").append(argName);
        sb.append(", ").append(dataType);
        sb.append(", ").append(mode);
        sb.append(", ").append(comment);

        sb.append(")");
        return sb.toString();
    }
}