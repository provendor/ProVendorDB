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
public class DbAuthorization implements Serializable {

    private static final long serialVersionUID = -1925342755;

    private Object owner;
    private Object grants;

    public DbAuthorization() {}

    public DbAuthorization(DbAuthorization value) {
        this.owner = value.owner;
        this.grants = value.grants;
    }

    public DbAuthorization(
        Object owner,
        Object grants
    ) {
        this.owner = owner;
        this.grants = grants;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public Object getOwner() {
        return this.owner;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public void setOwner(Object owner) {
        this.owner = owner;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public Object getGrants() {
        return this.grants;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public void setGrants(Object grants) {
        this.grants = grants;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DbAuthorization (");

        sb.append(owner);
        sb.append(", ").append(grants);

        sb.append(")");
        return sb.toString();
    }
}
