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
import provendordb.tables.records._DbDomainRecord;


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
public class _DbDomain extends TableImpl<_DbDomainRecord> {

    private static final long serialVersionUID = 1134815852;

    /**
     * The reference instance of <code>_db_domain</code>
     */
    public static final _DbDomain _DB_DOMAIN = new _DbDomain();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<_DbDomainRecord> getRecordType() {
        return _DbDomainRecord.class;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public final TableField<_DbDomainRecord, Object> OBJECT_OF = createField("object_of", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>_db_domain.data_type</code>.
     */
    public final TableField<_DbDomainRecord, Integer> DATA_TYPE = createField("data_type", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>_db_domain.prec</code>.
     */
    public final TableField<_DbDomainRecord, Integer> PREC = createField("prec", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>_db_domain.scale</code>.
     */
    public final TableField<_DbDomainRecord, Integer> SCALE = createField("scale", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public final TableField<_DbDomainRecord, Object> CLASS_OF = createField("class_of", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>_db_domain.code_set</code>.
     */
    public final TableField<_DbDomainRecord, Integer> CODE_SET = createField("code_set", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>_db_domain.collation_id</code>.
     */
    public final TableField<_DbDomainRecord, Integer> COLLATION_ID = createField("collation_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public final TableField<_DbDomainRecord, Object> ENUMERATION = createField("enumeration", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public final TableField<_DbDomainRecord, Object> SET_DOMAINS = createField("set_domains", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * Create a <code>_db_domain</code> table reference
     */
    public _DbDomain() {
        this(DSL.name("_db_domain"), null);
    }

    /**
     * Create an aliased <code>_db_domain</code> table reference
     */
    public _DbDomain(String alias) {
        this(DSL.name(alias), _DB_DOMAIN);
    }

    /**
     * Create an aliased <code>_db_domain</code> table reference
     */
    public _DbDomain(Name alias) {
        this(alias, _DB_DOMAIN);
    }

    private _DbDomain(Name alias, Table<_DbDomainRecord> aliased) {
        this(alias, aliased, null);
    }

    private _DbDomain(Name alias, Table<_DbDomainRecord> aliased, Field<?>[] parameters) {
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
    public _DbDomain as(String alias) {
        return new _DbDomain(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _DbDomain as(Name alias) {
        return new _DbDomain(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public _DbDomain rename(String name) {
        return new _DbDomain(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public _DbDomain rename(Name name) {
        return new _DbDomain(name, null);
    }
}