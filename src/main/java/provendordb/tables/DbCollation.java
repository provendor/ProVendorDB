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
import provendordb.tables.records.DbCollationRecord;


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
public class DbCollation extends TableImpl<DbCollationRecord> {

    private static final long serialVersionUID = -1337089298;

    /**
     * The reference instance of <code>db_collation</code>
     */
    public static final DbCollation DB_COLLATION = new DbCollation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DbCollationRecord> getRecordType() {
        return DbCollationRecord.class;
    }

    /**
     * The column <code>db_collation.coll_id</code>.
     */
    public final TableField<DbCollationRecord, Integer> COLL_ID = createField("coll_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>db_collation.coll_name</code>.
     */
    public final TableField<DbCollationRecord, String> COLL_NAME = createField("coll_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>db_collation.charset_name</code>.
     */
    public final TableField<DbCollationRecord, String> CHARSET_NAME = createField("charset_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>db_collation.is_builtin</code>.
     */
    public final TableField<DbCollationRecord, String> IS_BUILTIN = createField("is_builtin", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>db_collation.has_expansions</code>.
     */
    public final TableField<DbCollationRecord, String> HAS_EXPANSIONS = createField("has_expansions", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>db_collation.contractions</code>.
     */
    public final TableField<DbCollationRecord, Integer> CONTRACTIONS = createField("contractions", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>db_collation.uca_strength</code>.
     */
    public final TableField<DbCollationRecord, String> UCA_STRENGTH = createField("uca_strength", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>db_collation</code> table reference
     */
    public DbCollation() {
        this(DSL.name("db_collation"), null);
    }

    /**
     * Create an aliased <code>db_collation</code> table reference
     */
    public DbCollation(String alias) {
        this(DSL.name(alias), DB_COLLATION);
    }

    /**
     * Create an aliased <code>db_collation</code> table reference
     */
    public DbCollation(Name alias) {
        this(alias, DB_COLLATION);
    }

    private DbCollation(Name alias, Table<DbCollationRecord> aliased) {
        this(alias, aliased, null);
    }

    private DbCollation(Name alias, Table<DbCollationRecord> aliased, Field<?>[] parameters) {
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
    public DbCollation as(String alias) {
        return new DbCollation(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbCollation as(Name alias) {
        return new DbCollation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DbCollation rename(String name) {
        return new DbCollation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DbCollation rename(Name name) {
        return new DbCollation(name, null);
    }
}
