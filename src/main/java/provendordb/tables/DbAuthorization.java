/*
 * This file is generated by jOOQ.
*/
package provendordb.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import provendordb.DefaultSchema;
import provendordb.tables.records.DbAuthorizationRecord;


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
public class DbAuthorization extends TableImpl<DbAuthorizationRecord> {

    private static final long serialVersionUID = 883595559;

    /**
     * The reference instance of <code>db_authorization</code>
     */
    public static final DbAuthorization DB_AUTHORIZATION = new DbAuthorization();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DbAuthorizationRecord> getRecordType() {
        return DbAuthorizationRecord.class;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public final TableField<DbAuthorizationRecord, Object> OWNER = createField("owner", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public final TableField<DbAuthorizationRecord, Object> GRANTS = createField("grants", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * Create a <code>db_authorization</code> table reference
     */
    public DbAuthorization() {
        this(DSL.name("db_authorization"), null);
    }

    /**
     * Create an aliased <code>db_authorization</code> table reference
     */
    public DbAuthorization(String alias) {
        this(DSL.name(alias), DB_AUTHORIZATION);
    }

    /**
     * Create an aliased <code>db_authorization</code> table reference
     */
    public DbAuthorization(Name alias) {
        this(alias, DB_AUTHORIZATION);
    }

    private DbAuthorization(Name alias, Table<DbAuthorizationRecord> aliased) {
        this(alias, aliased, null);
    }

    private DbAuthorization(Name alias, Table<DbAuthorizationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbAuthorization as(String alias) {
        return new DbAuthorization(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbAuthorization as(Name alias) {
        return new DbAuthorization(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DbAuthorization rename(String name) {
        return new DbAuthorization(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DbAuthorization rename(Name name) {
        return new DbAuthorization(name, null);
    }
}
