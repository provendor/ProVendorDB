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
public class DbAuth implements Serializable {

    private static final long serialVersionUID = 596748903;

    private String grantorName;
    private String granteeName;
    private String className;
    private String authType;
    private String isGrantable;

    public DbAuth() {}

    public DbAuth(DbAuth value) {
        this.grantorName = value.grantorName;
        this.granteeName = value.granteeName;
        this.className = value.className;
        this.authType = value.authType;
        this.isGrantable = value.isGrantable;
    }

    public DbAuth(
        String grantorName,
        String granteeName,
        String className,
        String authType,
        String isGrantable
    ) {
        this.grantorName = grantorName;
        this.granteeName = granteeName;
        this.className = className;
        this.authType = authType;
        this.isGrantable = isGrantable;
    }

    public String getGrantorName() {
        return this.grantorName;
    }

    public void setGrantorName(String grantorName) {
        this.grantorName = grantorName;
    }

    public String getGranteeName() {
        return this.granteeName;
    }

    public void setGranteeName(String granteeName) {
        this.granteeName = granteeName;
    }

    public String getClassName() {
        return this.className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getAuthType() {
        return this.authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public String getIsGrantable() {
        return this.isGrantable;
    }

    public void setIsGrantable(String isGrantable) {
        this.isGrantable = isGrantable;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DbAuth (");

        sb.append(grantorName);
        sb.append(", ").append(granteeName);
        sb.append(", ").append(className);
        sb.append(", ").append(authType);
        sb.append(", ").append(isGrantable);

        sb.append(")");
        return sb.toString();
    }
}
