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
import provendordb.tables.records._DbPartitionRecord;


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
public class _DbPartition extends TableImpl<_DbPartitionRecord> {

    private static final long serialVersionUID = -1621800136;

    /**
     * The reference instance of <code>_db_partition</code>
     */
    public static final _DbPartition _DB_PARTITION = new _DbPartition();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<_DbPartitionRecord> getRecordType() {
        return _DbPartitionRecord.class;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public final TableField<_DbPartitionRecord, Object> CLASS_OF = createField("class_of", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>_db_partition.pname</code>.
     */
    public final TableField<_DbPartitionRecord, String> PNAME = createField("pname", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>_db_partition.ptype</code>.
     */
    public final TableField<_DbPartitionRecord, Integer> PTYPE = createField("ptype", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>_db_partition.pexpr</code>.
     */
    public final TableField<_DbPartitionRecord, String> PEXPR = createField("pexpr", org.jooq.impl.SQLDataType.VARCHAR(2048), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public final TableField<_DbPartitionRecord, Object> PVALUES = createField("pvalues", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>_db_partition.comment</code>.
     */
    public final TableField<_DbPartitionRecord, String> COMMENT = createField("comment", org.jooq.impl.SQLDataType.VARCHAR(1024), this, "");

    /**
     * Create a <code>_db_partition</code> table reference
     */
    public _DbPartition() {
        this(DSL.name("_db_partition"), null);
    }

    /**
     * Create an aliased <code>_db_partition</code> table reference
     */
    public _DbPartition(String alias) {
        this(DSL.name(alias), _DB_PARTITION);
    }

    /**
     * Create an aliased <code>_db_partition</code> table reference
     */
    public _DbPartition(Name alias) {
        this(alias, _DB_PARTITION);
    }

    private _DbPartition(Name alias, Table<_DbPartitionRecord> aliased) {
        this(alias, aliased, null);
    }

    private _DbPartition(Name alias, Table<_DbPartitionRecord> aliased, Field<?>[] parameters) {
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
    public _DbPartition as(String alias) {
        return new _DbPartition(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _DbPartition as(Name alias) {
        return new _DbPartition(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public _DbPartition rename(String name) {
        return new _DbPartition(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public _DbPartition rename(Name name) {
        return new _DbPartition(name, null);
    }
}
