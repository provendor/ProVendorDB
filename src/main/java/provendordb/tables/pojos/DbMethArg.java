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
public class DbMethArg implements Serializable {

    private static final long serialVersionUID = -961085660;

    private String  methName;
    private String  className;
    private String  methType;
    private Integer indexOf;
    private String  dataType;
    private Integer prec;
    private Integer scale;
    private Integer codeSet;
    private String  domainClassName;

    public DbMethArg() {}

    public DbMethArg(DbMethArg value) {
        this.methName = value.methName;
        this.className = value.className;
        this.methType = value.methType;
        this.indexOf = value.indexOf;
        this.dataType = value.dataType;
        this.prec = value.prec;
        this.scale = value.scale;
        this.codeSet = value.codeSet;
        this.domainClassName = value.domainClassName;
    }

    public DbMethArg(
        String  methName,
        String  className,
        String  methType,
        Integer indexOf,
        String  dataType,
        Integer prec,
        Integer scale,
        Integer codeSet,
        String  domainClassName
    ) {
        this.methName = methName;
        this.className = className;
        this.methType = methType;
        this.indexOf = indexOf;
        this.dataType = dataType;
        this.prec = prec;
        this.scale = scale;
        this.codeSet = codeSet;
        this.domainClassName = domainClassName;
    }

    public String getMethName() {
        return this.methName;
    }

    public void setMethName(String methName) {
        this.methName = methName;
    }

    public String getClassName() {
        return this.className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethType() {
        return this.methType;
    }

    public void setMethType(String methType) {
        this.methType = methType;
    }

    public Integer getIndexOf() {
        return this.indexOf;
    }

    public void setIndexOf(Integer indexOf) {
        this.indexOf = indexOf;
    }

    public String getDataType() {
        return this.dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public Integer getPrec() {
        return this.prec;
    }

    public void setPrec(Integer prec) {
        this.prec = prec;
    }

    public Integer getScale() {
        return this.scale;
    }

    public void setScale(Integer scale) {
        this.scale = scale;
    }

    public Integer getCodeSet() {
        return this.codeSet;
    }

    public void setCodeSet(Integer codeSet) {
        this.codeSet = codeSet;
    }

    public String getDomainClassName() {
        return this.domainClassName;
    }

    public void setDomainClassName(String domainClassName) {
        this.domainClassName = domainClassName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DbMethArg (");

        sb.append(methName);
        sb.append(", ").append(className);
        sb.append(", ").append(methType);
        sb.append(", ").append(indexOf);
        sb.append(", ").append(dataType);
        sb.append(", ").append(prec);
        sb.append(", ").append(scale);
        sb.append(", ").append(codeSet);
        sb.append(", ").append(domainClassName);

        sb.append(")");
        return sb.toString();
    }
}
