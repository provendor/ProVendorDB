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
public class DbDirectSuperClass implements Serializable {

    private static final long serialVersionUID = -1892115752;

    private String className;
    private String superClassName;

    public DbDirectSuperClass() {}

    public DbDirectSuperClass(DbDirectSuperClass value) {
        this.className = value.className;
        this.superClassName = value.superClassName;
    }

    public DbDirectSuperClass(
        String className,
        String superClassName
    ) {
        this.className = className;
        this.superClassName = superClassName;
    }

    public String getClassName() {
        return this.className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSuperClassName() {
        return this.superClassName;
    }

    public void setSuperClassName(String superClassName) {
        this.superClassName = superClassName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DbDirectSuperClass (");

        sb.append(className);
        sb.append(", ").append(superClassName);

        sb.append(")");
        return sb.toString();
    }
}
