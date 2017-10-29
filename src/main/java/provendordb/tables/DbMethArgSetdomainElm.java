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
import provendordb.tables.records.DbMethArgSetdomainElmRecord;


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
public class DbMethArgSetdomainElm extends TableImpl<DbMethArgSetdomainElmRecord> {

    private static final long serialVersionUID = -1762759954;

    /**
     * The reference instance of <code>db_meth_arg_setdomain_elm</code>
     */
    public static final DbMethArgSetdomainElm DB_METH_ARG_SETDOMAIN_ELM = new DbMethArgSetdomainElm();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DbMethArgSetdomainElmRecord> getRecordType() {
        return DbMethArgSetdomainElmRecord.class;
    }

    /**
     * The column <code>db_meth_arg_setdomain_elm.meth_name</code>.
     */
    public final TableField<DbMethArgSetdomainElmRecord, String> METH_NAME = createField("meth_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>db_meth_arg_setdomain_elm.class_name</code>.
     */
    public final TableField<DbMethArgSetdomainElmRecord, String> CLASS_NAME = createField("class_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>db_meth_arg_setdomain_elm.meth_type</code>.
     */
    public final TableField<DbMethArgSetdomainElmRecord, String> METH_TYPE = createField("meth_type", org.jooq.impl.SQLDataType.VARCHAR(8), this, "");

    /**
     * The column <code>db_meth_arg_setdomain_elm.index_of</code>.
     */
    public final TableField<DbMethArgSetdomainElmRecord, Integer> INDEX_OF = createField("index_of", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>db_meth_arg_setdomain_elm.data_type</code>.
     */
    public final TableField<DbMethArgSetdomainElmRecord, String> DATA_TYPE = createField("data_type", org.jooq.impl.SQLDataType.VARCHAR(9), this, "");

    /**
     * The column <code>db_meth_arg_setdomain_elm.prec</code>.
     */
    public final TableField<DbMethArgSetdomainElmRecord, Integer> PREC = createField("prec", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>db_meth_arg_setdomain_elm.scale</code>.
     */
    public final TableField<DbMethArgSetdomainElmRecord, Integer> SCALE = createField("scale", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>db_meth_arg_setdomain_elm.code_set</code>.
     */
    public final TableField<DbMethArgSetdomainElmRecord, Integer> CODE_SET = createField("code_set", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>db_meth_arg_setdomain_elm.domain_class_name</code>.
     */
    public final TableField<DbMethArgSetdomainElmRecord, String> DOMAIN_CLASS_NAME = createField("domain_class_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>db_meth_arg_setdomain_elm</code> table reference
     */
    public DbMethArgSetdomainElm() {
        this(DSL.name("db_meth_arg_setdomain_elm"), null);
    }

    /**
     * Create an aliased <code>db_meth_arg_setdomain_elm</code> table reference
     */
    public DbMethArgSetdomainElm(String alias) {
        this(DSL.name(alias), DB_METH_ARG_SETDOMAIN_ELM);
    }

    /**
     * Create an aliased <code>db_meth_arg_setdomain_elm</code> table reference
     */
    public DbMethArgSetdomainElm(Name alias) {
        this(alias, DB_METH_ARG_SETDOMAIN_ELM);
    }

    private DbMethArgSetdomainElm(Name alias, Table<DbMethArgSetdomainElmRecord> aliased) {
        this(alias, aliased, null);
    }

    private DbMethArgSetdomainElm(Name alias, Table<DbMethArgSetdomainElmRecord> aliased, Field<?>[] parameters) {
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
    public DbMethArgSetdomainElm as(String alias) {
        return new DbMethArgSetdomainElm(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbMethArgSetdomainElm as(Name alias) {
        return new DbMethArgSetdomainElm(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DbMethArgSetdomainElm rename(String name) {
        return new DbMethArgSetdomainElm(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DbMethArgSetdomainElm rename(Name name) {
        return new DbMethArgSetdomainElm(name, null);
    }
}