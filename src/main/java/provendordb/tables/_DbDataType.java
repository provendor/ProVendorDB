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
import provendordb.tables.records._DbDataTypeRecord;


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
public class _DbDataType extends TableImpl<_DbDataTypeRecord> {

    private static final long serialVersionUID = -1969448063;

    /**
     * The reference instance of <code>_db_data_type</code>
     */
    public static final _DbDataType _DB_DATA_TYPE = new _DbDataType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<_DbDataTypeRecord> getRecordType() {
        return _DbDataTypeRecord.class;
    }

    /**
     * The column <code>_db_data_type.type_id</code>.
     */
    public final TableField<_DbDataTypeRecord, Integer> TYPE_ID = createField("type_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>_db_data_type.type_name</code>.
     */
    public final TableField<_DbDataTypeRecord, String> TYPE_NAME = createField("type_name", org.jooq.impl.SQLDataType.VARCHAR(16), this, "");

    /**
     * Create a <code>_db_data_type</code> table reference
     */
    public _DbDataType() {
        this(DSL.name("_db_data_type"), null);
    }

    /**
     * Create an aliased <code>_db_data_type</code> table reference
     */
    public _DbDataType(String alias) {
        this(DSL.name(alias), _DB_DATA_TYPE);
    }

    /**
     * Create an aliased <code>_db_data_type</code> table reference
     */
    public _DbDataType(Name alias) {
        this(alias, _DB_DATA_TYPE);
    }

    private _DbDataType(Name alias, Table<_DbDataTypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private _DbDataType(Name alias, Table<_DbDataTypeRecord> aliased, Field<?>[] parameters) {
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
    public _DbDataType as(String alias) {
        return new _DbDataType(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _DbDataType as(Name alias) {
        return new _DbDataType(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public _DbDataType rename(String name) {
        return new _DbDataType(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public _DbDataType rename(Name name) {
        return new _DbDataType(name, null);
    }
}