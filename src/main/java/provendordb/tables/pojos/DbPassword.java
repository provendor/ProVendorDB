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
public class DbPassword implements Serializable {

    private static final long serialVersionUID = 1112470354;

    private String password;

    public DbPassword() {}

    public DbPassword(DbPassword value) {
        this.password = value.password;
    }

    public DbPassword(
        String password
    ) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DbPassword (");

        sb.append(password);

        sb.append(")");
        return sb.toString();
    }
}