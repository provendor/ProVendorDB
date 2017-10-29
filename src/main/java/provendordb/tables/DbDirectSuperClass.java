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
import provendordb.tables.records.DbDirectSuperClassRecord;


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
public class DbDirectSuperClass extends TableImpl<DbDirectSuperClassRecord> {

    private static final long serialVersionUID = -720190175;

    /**
     * The reference instance of <code>db_direct_super_class</code>
     */
    public static final DbDirectSuperClass DB_DIRECT_SUPER_CLASS = new DbDirectSuperClass();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DbDirectSuperClassRecord> getRecordType() {
        return DbDirectSuperClassRecord.class;
    }

    /**
     * The column <code>db_direct_super_class.class_name</code>.
     */
    public final TableField<DbDirectSuperClassRecord, String> CLASS_NAME = createField("class_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>db_direct_super_class.super_class_name</code>.
     */
    public final TableField<DbDirectSuperClassRecord, String> SUPER_CLASS_NAME = createField("super_class_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>db_direct_super_class</code> table reference
     */
    public DbDirectSuperClass() {
        this(DSL.name("db_direct_super_class"), null);
    }

    /**
     * Create an aliased <code>db_direct_super_class</code> table reference
     */
    public DbDirectSuperClass(String alias) {
        this(DSL.name(alias), DB_DIRECT_SUPER_CLASS);
    }

    /**
     * Create an aliased <code>db_direct_super_class</code> table reference
     */
    public DbDirectSuperClass(Name alias) {
        this(alias, DB_DIRECT_SUPER_CLASS);
    }

    private DbDirectSuperClass(Name alias, Table<DbDirectSuperClassRecord> aliased) {
        this(alias, aliased, null);
    }

    private DbDirectSuperClass(Name alias, Table<DbDirectSuperClassRecord> aliased, Field<?>[] parameters) {
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
    public DbDirectSuperClass as(String alias) {
        return new DbDirectSuperClass(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbDirectSuperClass as(Name alias) {
        return new DbDirectSuperClass(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DbDirectSuperClass rename(String name) {
        return new DbDirectSuperClass(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DbDirectSuperClass rename(Name name) {
        return new DbDirectSuperClass(name, null);
    }
}
