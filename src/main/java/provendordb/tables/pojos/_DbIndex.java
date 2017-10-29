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
public class _DbIndex implements Serializable {

    private static final long serialVersionUID = 799812226;

    private Object  classOf;
    private String  indexName;
    private Integer isUnique;
    private Integer keyCount;
    private Object  keyAttrs;
    private Integer isReverse;
    private Integer isPrimaryKey;
    private Integer isForeignKey;
    private String  filterExpression;
    private Integer haveFunction;
    private String  comment;

    public _DbIndex() {}

    public _DbIndex(_DbIndex value) {
        this.classOf = value.classOf;
        this.indexName = value.indexName;
        this.isUnique = value.isUnique;
        this.keyCount = value.keyCount;
        this.keyAttrs = value.keyAttrs;
        this.isReverse = value.isReverse;
        this.isPrimaryKey = value.isPrimaryKey;
        this.isForeignKey = value.isForeignKey;
        this.filterExpression = value.filterExpression;
        this.haveFunction = value.haveFunction;
        this.comment = value.comment;
    }

    public _DbIndex(
        Object  classOf,
        String  indexName,
        Integer isUnique,
        Integer keyCount,
        Object  keyAttrs,
        Integer isReverse,
        Integer isPrimaryKey,
        Integer isForeignKey,
        String  filterExpression,
        Integer haveFunction,
        String  comment
    ) {
        this.classOf = classOf;
        this.indexName = indexName;
        this.isUnique = isUnique;
        this.keyCount = keyCount;
        this.keyAttrs = keyAttrs;
        this.isReverse = isReverse;
        this.isPrimaryKey = isPrimaryKey;
        this.isForeignKey = isForeignKey;
        this.filterExpression = filterExpression;
        this.haveFunction = haveFunction;
        this.comment = comment;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public Object getClassOf() {
        return this.classOf;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public void setClassOf(Object classOf) {
        this.classOf = classOf;
    }

    public String getIndexName() {
        return this.indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public Integer getIsUnique() {
        return this.isUnique;
    }

    public void setIsUnique(Integer isUnique) {
        this.isUnique = isUnique;
    }

    public Integer getKeyCount() {
        return this.keyCount;
    }

    public void setKeyCount(Integer keyCount) {
        this.keyCount = keyCount;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public Object getKeyAttrs() {
        return this.keyAttrs;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public void setKeyAttrs(Object keyAttrs) {
        this.keyAttrs = keyAttrs;
    }

    public Integer getIsReverse() {
        return this.isReverse;
    }

    public void setIsReverse(Integer isReverse) {
        this.isReverse = isReverse;
    }

    public Integer getIsPrimaryKey() {
        return this.isPrimaryKey;
    }

    public void setIsPrimaryKey(Integer isPrimaryKey) {
        this.isPrimaryKey = isPrimaryKey;
    }

    public Integer getIsForeignKey() {
        return this.isForeignKey;
    }

    public void setIsForeignKey(Integer isForeignKey) {
        this.isForeignKey = isForeignKey;
    }

    public String getFilterExpression() {
        return this.filterExpression;
    }

    public void setFilterExpression(String filterExpression) {
        this.filterExpression = filterExpression;
    }

    public Integer getHaveFunction() {
        return this.haveFunction;
    }

    public void setHaveFunction(Integer haveFunction) {
        this.haveFunction = haveFunction;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("_DbIndex (");

        sb.append(classOf);
        sb.append(", ").append(indexName);
        sb.append(", ").append(isUnique);
        sb.append(", ").append(keyCount);
        sb.append(", ").append(keyAttrs);
        sb.append(", ").append(isReverse);
        sb.append(", ").append(isPrimaryKey);
        sb.append(", ").append(isForeignKey);
        sb.append(", ").append(filterExpression);
        sb.append(", ").append(haveFunction);
        sb.append(", ").append(comment);

        sb.append(")");
        return sb.toString();
    }
}
