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
public class DbUser implements Serializable {

    private static final long serialVersionUID = -1706805388;

    private String  name;
    private Integer id;
    private Object  password;
    private Object  directGroups;
    private Object  groups;
    private Object  authorization;
    private Object  triggers;
    private String  comment;

    public DbUser() {}

    public DbUser(DbUser value) {
        this.name = value.name;
        this.id = value.id;
        this.password = value.password;
        this.directGroups = value.directGroups;
        this.groups = value.groups;
        this.authorization = value.authorization;
        this.triggers = value.triggers;
        this.comment = value.comment;
    }

    public DbUser(
        String  name,
        Integer id,
        Object  password,
        Object  directGroups,
        Object  groups,
        Object  authorization,
        Object  triggers,
        String  comment
    ) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.directGroups = directGroups;
        this.groups = groups;
        this.authorization = authorization;
        this.triggers = triggers;
        this.comment = comment;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public Object getPassword() {
        return this.password;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public void setPassword(Object password) {
        this.password = password;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public Object getDirectGroups() {
        return this.directGroups;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public void setDirectGroups(Object directGroups) {
        this.directGroups = directGroups;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public Object getGroups() {
        return this.groups;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public void setGroups(Object groups) {
        this.groups = groups;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public Object getAuthorization() {
        return this.authorization;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public void setAuthorization(Object authorization) {
        this.authorization = authorization;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public Object getTriggers() {
        return this.triggers;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public void setTriggers(Object triggers) {
        this.triggers = triggers;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DbUser (");

        sb.append(name);
        sb.append(", ").append(id);
        sb.append(", ").append(password);
        sb.append(", ").append(directGroups);
        sb.append(", ").append(groups);
        sb.append(", ").append(authorization);
        sb.append(", ").append(triggers);
        sb.append(", ").append(comment);

        sb.append(")");
        return sb.toString();
    }
}
