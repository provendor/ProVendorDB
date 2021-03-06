/*
 * This file is generated by jOOQ.
*/
package provendordb.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import provendordb.DefaultSchema;
import provendordb.Keys;
import provendordb.tables.records.DbHaApplyInfoRecord;


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
public class DbHaApplyInfo extends TableImpl<DbHaApplyInfoRecord> {

    private static final long serialVersionUID = -1952429699;

    /**
     * The reference instance of <code>db_ha_apply_info</code>
     */
    public static final DbHaApplyInfo DB_HA_APPLY_INFO = new DbHaApplyInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DbHaApplyInfoRecord> getRecordType() {
        return DbHaApplyInfoRecord.class;
    }

    /**
     * The column <code>db_ha_apply_info.db_name</code>.
     */
    public final TableField<DbHaApplyInfoRecord, String> DB_NAME = createField("db_name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>db_ha_apply_info.db_creation_time</code>.
     */
    public final TableField<DbHaApplyInfoRecord, Timestamp> DB_CREATION_TIME = createField("db_creation_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>db_ha_apply_info.copied_log_path</code>.
     */
    public final TableField<DbHaApplyInfoRecord, String> COPIED_LOG_PATH = createField("copied_log_path", org.jooq.impl.SQLDataType.VARCHAR(4096).nullable(false), this, "");

    /**
     * The column <code>db_ha_apply_info.committed_lsa_pageid</code>.
     */
    public final TableField<DbHaApplyInfoRecord, Long> COMMITTED_LSA_PAGEID = createField("committed_lsa_pageid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>db_ha_apply_info.committed_lsa_offset</code>.
     */
    public final TableField<DbHaApplyInfoRecord, Integer> COMMITTED_LSA_OFFSET = createField("committed_lsa_offset", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>db_ha_apply_info.committed_rep_pageid</code>.
     */
    public final TableField<DbHaApplyInfoRecord, Long> COMMITTED_REP_PAGEID = createField("committed_rep_pageid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>db_ha_apply_info.committed_rep_offset</code>.
     */
    public final TableField<DbHaApplyInfoRecord, Integer> COMMITTED_REP_OFFSET = createField("committed_rep_offset", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>db_ha_apply_info.append_lsa_pageid</code>.
     */
    public final TableField<DbHaApplyInfoRecord, Long> APPEND_LSA_PAGEID = createField("append_lsa_pageid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>db_ha_apply_info.append_lsa_offset</code>.
     */
    public final TableField<DbHaApplyInfoRecord, Integer> APPEND_LSA_OFFSET = createField("append_lsa_offset", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>db_ha_apply_info.eof_lsa_pageid</code>.
     */
    public final TableField<DbHaApplyInfoRecord, Long> EOF_LSA_PAGEID = createField("eof_lsa_pageid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>db_ha_apply_info.eof_lsa_offset</code>.
     */
    public final TableField<DbHaApplyInfoRecord, Integer> EOF_LSA_OFFSET = createField("eof_lsa_offset", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>db_ha_apply_info.final_lsa_pageid</code>.
     */
    public final TableField<DbHaApplyInfoRecord, Long> FINAL_LSA_PAGEID = createField("final_lsa_pageid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>db_ha_apply_info.final_lsa_offset</code>.
     */
    public final TableField<DbHaApplyInfoRecord, Integer> FINAL_LSA_OFFSET = createField("final_lsa_offset", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>db_ha_apply_info.required_lsa_pageid</code>.
     */
    public final TableField<DbHaApplyInfoRecord, Long> REQUIRED_LSA_PAGEID = createField("required_lsa_pageid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>db_ha_apply_info.required_lsa_offset</code>.
     */
    public final TableField<DbHaApplyInfoRecord, Integer> REQUIRED_LSA_OFFSET = createField("required_lsa_offset", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>db_ha_apply_info.log_record_time</code>.
     */
    public final TableField<DbHaApplyInfoRecord, Timestamp> LOG_RECORD_TIME = createField("log_record_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>db_ha_apply_info.log_commit_time</code>.
     */
    public final TableField<DbHaApplyInfoRecord, Timestamp> LOG_COMMIT_TIME = createField("log_commit_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>db_ha_apply_info.last_access_time</code>.
     */
    public final TableField<DbHaApplyInfoRecord, Timestamp> LAST_ACCESS_TIME = createField("last_access_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>db_ha_apply_info.status</code>.
     */
    public final TableField<DbHaApplyInfoRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>db_ha_apply_info.insert_counter</code>.
     */
    public final TableField<DbHaApplyInfoRecord, Long> INSERT_COUNTER = createField("insert_counter", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>db_ha_apply_info.update_counter</code>.
     */
    public final TableField<DbHaApplyInfoRecord, Long> UPDATE_COUNTER = createField("update_counter", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>db_ha_apply_info.delete_counter</code>.
     */
    public final TableField<DbHaApplyInfoRecord, Long> DELETE_COUNTER = createField("delete_counter", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>db_ha_apply_info.schema_counter</code>.
     */
    public final TableField<DbHaApplyInfoRecord, Long> SCHEMA_COUNTER = createField("schema_counter", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>db_ha_apply_info.commit_counter</code>.
     */
    public final TableField<DbHaApplyInfoRecord, Long> COMMIT_COUNTER = createField("commit_counter", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>db_ha_apply_info.fail_counter</code>.
     */
    public final TableField<DbHaApplyInfoRecord, Long> FAIL_COUNTER = createField("fail_counter", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>db_ha_apply_info.start_time</code>.
     */
    public final TableField<DbHaApplyInfoRecord, Timestamp> START_TIME = createField("start_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>db_ha_apply_info</code> table reference
     */
    public DbHaApplyInfo() {
        this(DSL.name("db_ha_apply_info"), null);
    }

    /**
     * Create an aliased <code>db_ha_apply_info</code> table reference
     */
    public DbHaApplyInfo(String alias) {
        this(DSL.name(alias), DB_HA_APPLY_INFO);
    }

    /**
     * Create an aliased <code>db_ha_apply_info</code> table reference
     */
    public DbHaApplyInfo(Name alias) {
        this(alias, DB_HA_APPLY_INFO);
    }

    private DbHaApplyInfo(Name alias, Table<DbHaApplyInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private DbHaApplyInfo(Name alias, Table<DbHaApplyInfoRecord> aliased, Field<?>[] parameters) {
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
    public List<UniqueKey<DbHaApplyInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<DbHaApplyInfoRecord>>asList(Keys.DB_HA_APPLY_INFO__U_DB_HA_APPLY_INFO_DB_NAME_COPIED_LOG_PATH);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbHaApplyInfo as(String alias) {
        return new DbHaApplyInfo(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbHaApplyInfo as(Name alias) {
        return new DbHaApplyInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DbHaApplyInfo rename(String name) {
        return new DbHaApplyInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DbHaApplyInfo rename(Name name) {
        return new DbHaApplyInfo(name, null);
    }
}
