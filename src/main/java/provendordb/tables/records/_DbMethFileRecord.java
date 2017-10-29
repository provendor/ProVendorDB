/*
 * This file is generated by jOOQ.
*/
package provendordb.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;

import provendordb.tables._DbMethFile;


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
public class _DbMethFileRecord extends TableRecordImpl<_DbMethFileRecord> implements Record3<Object, Object, String> {

    private static final long serialVersionUID = -69522325;

    /**
     * Setter for <code>_db_meth_file.class_of</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public void setClassOf(Object value) {
        set(0, value);
    }

    /**
     * Getter for <code>_db_meth_file.class_of</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public Object getClassOf() {
        return (Object) get(0);
    }

    /**
     * Setter for <code>_db_meth_file.from_class_of</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public void setFromClassOf(Object value) {
        set(1, value);
    }

    /**
     * Getter for <code>_db_meth_file.from_class_of</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public Object getFromClassOf() {
        return (Object) get(1);
    }

    /**
     * Setter for <code>_db_meth_file.path_name</code>.
     */
    public void setPathName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>_db_meth_file.path_name</code>.
     */
    public String getPathName() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Object, Object, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Object, Object, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field1() {
        return _DbMethFile._DB_METH_FILE.CLASS_OF;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field2() {
        return _DbMethFile._DB_METH_FILE.FROM_CLASS_OF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return _DbMethFile._DB_METH_FILE.PATH_NAME;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object component1() {
        return getClassOf();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object component2() {
        return getFromClassOf();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPathName();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object value1() {
        return getClassOf();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object value2() {
        return getFromClassOf();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPathName();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public _DbMethFileRecord value1(Object value) {
        setClassOf(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public _DbMethFileRecord value2(Object value) {
        setFromClassOf(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _DbMethFileRecord value3(String value) {
        setPathName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _DbMethFileRecord values(Object value1, Object value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached _DbMethFileRecord
     */
    public _DbMethFileRecord() {
        super(_DbMethFile._DB_METH_FILE);
    }

    /**
     * Create a detached, initialised _DbMethFileRecord
     */
    public _DbMethFileRecord(Object classOf, Object fromClassOf, String pathName) {
        super(_DbMethFile._DB_METH_FILE);

        set(0, classOf);
        set(1, fromClassOf);
        set(2, pathName);
    }
}
