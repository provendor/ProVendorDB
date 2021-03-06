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
import provendordb.tables.records.DbPartitionRecord;


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
public class DbPartition extends TableImpl<DbPartitionRecord> {

    private static final long serialVersionUID = -2008965867;

    /**
     * The reference instance of <code>db_partition</code>
     */
    public static final DbPartition DB_PARTITION = new DbPartition();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DbPartitionRecord> getRecordType() {
        return DbPartitionRecord.class;
    }

    /**
     * The column <code>db_partition.class_name</code>.
     */
    public final TableField<DbPartitionRecord, String> CLASS_NAME = createField("class_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>db_partition.partition_name</code>.
     */
    public final TableField<DbPartitionRecord, String> PARTITION_NAME = createField("partition_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>db_partition.partition_class_name</code>.
     */
    public final TableField<DbPartitionRecord, String> PARTITION_CLASS_NAME = createField("partition_class_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>db_partition.partition_type</code>.
     */
    public final TableField<DbPartitionRecord, String> PARTITION_TYPE = createField("partition_type", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>db_partition.partition_expr</code>.
     */
    public final TableField<DbPartitionRecord, String> PARTITION_EXPR = createField("partition_expr", org.jooq.impl.SQLDataType.VARCHAR(2048), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public final TableField<DbPartitionRecord, Object> PARTITION_VALUES = createField("partition_values", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>db_partition.comment</code>.
     */
    public final TableField<DbPartitionRecord, String> COMMENT = createField("comment", org.jooq.impl.SQLDataType.VARCHAR(1024), this, "");

    /**
     * Create a <code>db_partition</code> table reference
     */
    public DbPartition() {
        this(DSL.name("db_partition"), null);
    }

    /**
     * Create an aliased <code>db_partition</code> table reference
     */
    public DbPartition(String alias) {
        this(DSL.name(alias), DB_PARTITION);
    }

    /**
     * Create an aliased <code>db_partition</code> table reference
     */
    public DbPartition(Name alias) {
        this(alias, DB_PARTITION);
    }

    private DbPartition(Name alias, Table<DbPartitionRecord> aliased) {
        this(alias, aliased, null);
    }

    private DbPartition(Name alias, Table<DbPartitionRecord> aliased, Field<?>[] parameters) {
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
    public DbPartition as(String alias) {
        return new DbPartition(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbPartition as(Name alias) {
        return new DbPartition(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DbPartition rename(String name) {
        return new DbPartition(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DbPartition rename(Name name) {
        return new DbPartition(name, null);
    }
}
