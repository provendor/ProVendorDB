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
import provendordb.tables.records.DbRootRecord;


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
public class DbRoot extends TableImpl<DbRootRecord> {

    private static final long serialVersionUID = -393644066;

    /**
     * The reference instance of <code>db_root</code>
     */
    public static final DbRoot DB_ROOT = new DbRoot();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DbRootRecord> getRecordType() {
        return DbRootRecord.class;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public final TableField<DbRootRecord, Object> TRIGGERS = createField("triggers", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>db_root.charset</code>.
     */
    public final TableField<DbRootRecord, Integer> CHARSET = createField("charset", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>db_root.lang</code>.
     */
    public final TableField<DbRootRecord, String> LANG = createField("lang", org.jooq.impl.SQLDataType.VARCHAR(1073741823), this, "");

    /**
     * The column <code>db_root.timezone_checksum</code>.
     */
    public final TableField<DbRootRecord, String> TIMEZONE_CHECKSUM = createField("timezone_checksum", org.jooq.impl.SQLDataType.VARCHAR(1073741823), this, "");

    /**
     * Create a <code>db_root</code> table reference
     */
    public DbRoot() {
        this(DSL.name("db_root"), null);
    }

    /**
     * Create an aliased <code>db_root</code> table reference
     */
    public DbRoot(String alias) {
        this(DSL.name(alias), DB_ROOT);
    }

    /**
     * Create an aliased <code>db_root</code> table reference
     */
    public DbRoot(Name alias) {
        this(alias, DB_ROOT);
    }

    private DbRoot(Name alias, Table<DbRootRecord> aliased) {
        this(alias, aliased, null);
    }

    private DbRoot(Name alias, Table<DbRootRecord> aliased, Field<?>[] parameters) {
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
    public DbRoot as(String alias) {
        return new DbRoot(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbRoot as(Name alias) {
        return new DbRoot(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DbRoot rename(String name) {
        return new DbRoot(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DbRoot rename(Name name) {
        return new DbRoot(name, null);
    }
}
