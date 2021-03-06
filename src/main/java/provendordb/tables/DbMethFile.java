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
import provendordb.tables.records.DbMethFileRecord;


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
public class DbMethFile extends TableImpl<DbMethFileRecord> {

    private static final long serialVersionUID = 930635096;

    /**
     * The reference instance of <code>db_meth_file</code>
     */
    public static final DbMethFile DB_METH_FILE = new DbMethFile();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DbMethFileRecord> getRecordType() {
        return DbMethFileRecord.class;
    }

    /**
     * The column <code>db_meth_file.class_name</code>.
     */
    public final TableField<DbMethFileRecord, String> CLASS_NAME = createField("class_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>db_meth_file.path_name</code>.
     */
    public final TableField<DbMethFileRecord, String> PATH_NAME = createField("path_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>db_meth_file.from_class_name</code>.
     */
    public final TableField<DbMethFileRecord, String> FROM_CLASS_NAME = createField("from_class_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>db_meth_file</code> table reference
     */
    public DbMethFile() {
        this(DSL.name("db_meth_file"), null);
    }

    /**
     * Create an aliased <code>db_meth_file</code> table reference
     */
    public DbMethFile(String alias) {
        this(DSL.name(alias), DB_METH_FILE);
    }

    /**
     * Create an aliased <code>db_meth_file</code> table reference
     */
    public DbMethFile(Name alias) {
        this(alias, DB_METH_FILE);
    }

    private DbMethFile(Name alias, Table<DbMethFileRecord> aliased) {
        this(alias, aliased, null);
    }

    private DbMethFile(Name alias, Table<DbMethFileRecord> aliased, Field<?>[] parameters) {
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
    public DbMethFile as(String alias) {
        return new DbMethFile(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbMethFile as(Name alias) {
        return new DbMethFile(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DbMethFile rename(String name) {
        return new DbMethFile(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DbMethFile rename(Name name) {
        return new DbMethFile(name, null);
    }
}
