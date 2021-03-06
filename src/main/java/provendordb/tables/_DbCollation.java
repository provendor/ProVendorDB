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
import provendordb.tables.records._DbCollationRecord;


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
public class _DbCollation extends TableImpl<_DbCollationRecord> {

    private static final long serialVersionUID = 1727002650;

    /**
     * The reference instance of <code>_db_collation</code>
     */
    public static final _DbCollation _DB_COLLATION = new _DbCollation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<_DbCollationRecord> getRecordType() {
        return _DbCollationRecord.class;
    }

    /**
     * The column <code>_db_collation.coll_id</code>.
     */
    public final TableField<_DbCollationRecord, Integer> COLL_ID = createField("coll_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>_db_collation.coll_name</code>.
     */
    public final TableField<_DbCollationRecord, String> COLL_NAME = createField("coll_name", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>_db_collation.charset_id</code>.
     */
    public final TableField<_DbCollationRecord, Integer> CHARSET_ID = createField("charset_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>_db_collation.built_in</code>.
     */
    public final TableField<_DbCollationRecord, Integer> BUILT_IN = createField("built_in", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>_db_collation.expansions</code>.
     */
    public final TableField<_DbCollationRecord, Integer> EXPANSIONS = createField("expansions", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>_db_collation.contractions</code>.
     */
    public final TableField<_DbCollationRecord, Integer> CONTRACTIONS = createField("contractions", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>_db_collation.uca_strength</code>.
     */
    public final TableField<_DbCollationRecord, Integer> UCA_STRENGTH = createField("uca_strength", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>_db_collation.checksum</code>.
     */
    public final TableField<_DbCollationRecord, String> CHECKSUM = createField("checksum", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * Create a <code>_db_collation</code> table reference
     */
    public _DbCollation() {
        this(DSL.name("_db_collation"), null);
    }

    /**
     * Create an aliased <code>_db_collation</code> table reference
     */
    public _DbCollation(String alias) {
        this(DSL.name(alias), _DB_COLLATION);
    }

    /**
     * Create an aliased <code>_db_collation</code> table reference
     */
    public _DbCollation(Name alias) {
        this(alias, _DB_COLLATION);
    }

    private _DbCollation(Name alias, Table<_DbCollationRecord> aliased) {
        this(alias, aliased, null);
    }

    private _DbCollation(Name alias, Table<_DbCollationRecord> aliased, Field<?>[] parameters) {
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
    public _DbCollation as(String alias) {
        return new _DbCollation(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _DbCollation as(Name alias) {
        return new _DbCollation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public _DbCollation rename(String name) {
        return new _DbCollation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public _DbCollation rename(Name name) {
        return new _DbCollation(name, null);
    }
}
