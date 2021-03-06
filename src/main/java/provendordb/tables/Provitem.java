/*
 * This file is generated by jOOQ.
*/
package provendordb.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import provendordb.DefaultSchema;
import provendordb.Keys;
import provendordb.tables.records.ProvitemRecord;


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
public class Provitem extends TableImpl<ProvitemRecord> {

    private static final long serialVersionUID = -575596658;

    /**
     * The reference instance of <code>provitem</code>
     */
    public static final Provitem PROVITEM = new Provitem();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProvitemRecord> getRecordType() {
        return ProvitemRecord.class;
    }

    /**
     * The column <code>provitem.provitemid</code>.
     */
    public final TableField<ProvitemRecord, Integer> PROVITEMID = createField("provitemid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>provitem.provitemnumber</code>.
     */
    public final TableField<ProvitemRecord, String> PROVITEMNUMBER = createField("provitemnumber", org.jooq.impl.SQLDataType.VARCHAR(4096).nullable(false), this, "");

    /**
     * The column <code>provitem.provitemname</code>.
     */
    public final TableField<ProvitemRecord, String> PROVITEMNAME = createField("provitemname", org.jooq.impl.SQLDataType.VARCHAR(4096), this, "");

    /**
     * The column <code>provitem.provitemdescription</code>.
     */
    public final TableField<ProvitemRecord, String> PROVITEMDESCRIPTION = createField("provitemdescription", org.jooq.impl.SQLDataType.VARCHAR(4096), this, "");

    /**
     * The column <code>provitem.provitemtypeid</code>.
     */
    public final TableField<ProvitemRecord, String> PROVITEMTYPEID = createField("provitemtypeid", org.jooq.impl.SQLDataType.VARCHAR(4096), this, "");

    /**
     * The column <code>provitem.provitemgroupid</code>.
     */
    public final TableField<ProvitemRecord, String> PROVITEMGROUPID = createField("provitemgroupid", org.jooq.impl.SQLDataType.VARCHAR(4096), this, "");

    /**
     * The column <code>provitem.provitemfarmerid</code>.
     */
    public final TableField<ProvitemRecord, String> PROVITEMFARMERID = createField("provitemfarmerid", org.jooq.impl.SQLDataType.VARCHAR(4096), this, "");

    /**
     * The column <code>provitem.provitemquantity</code>.
     */
    public final TableField<ProvitemRecord, String> PROVITEMQUANTITY = createField("provitemquantity", org.jooq.impl.SQLDataType.VARCHAR(4096), this, "");

    /**
     * The column <code>provitem.provitemminprice</code>.
     */
    public final TableField<ProvitemRecord, Integer> PROVITEMMINPRICE = createField("provitemminprice", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>provitem.provitemmaxprice</code>.
     */
    public final TableField<ProvitemRecord, Integer> PROVITEMMAXPRICE = createField("provitemmaxprice", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>provitem.provitemdeals</code>.
     */
    public final TableField<ProvitemRecord, String> PROVITEMDEALS = createField("provitemdeals", org.jooq.impl.SQLDataType.VARCHAR(4096), this, "");

    /**
     * Create a <code>provitem</code> table reference
     */
    public Provitem() {
        this(DSL.name("provitem"), null);
    }

    /**
     * Create an aliased <code>provitem</code> table reference
     */
    public Provitem(String alias) {
        this(DSL.name(alias), PROVITEM);
    }

    /**
     * Create an aliased <code>provitem</code> table reference
     */
    public Provitem(Name alias) {
        this(alias, PROVITEM);
    }

    private Provitem(Name alias, Table<ProvitemRecord> aliased) {
        this(alias, aliased, null);
    }

    private Provitem(Name alias, Table<ProvitemRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<ProvitemRecord> getPrimaryKey() {
        return Keys.PROVITEM__PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ProvitemRecord>> getKeys() {
        return Arrays.<UniqueKey<ProvitemRecord>>asList(Keys.PROVITEM__PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ProvitemRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ProvitemRecord, ?>>asList(Keys.PROVITEM__ITEMINFOTYPEFK, Keys.PROVITEM__ITEMINFOGROUPFK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Provitem as(String alias) {
        return new Provitem(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Provitem as(Name alias) {
        return new Provitem(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Provitem rename(String name) {
        return new Provitem(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Provitem rename(Name name) {
        return new Provitem(name, null);
    }
}
