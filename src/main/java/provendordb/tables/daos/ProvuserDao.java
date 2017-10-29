/*
 * This file is generated by jOOQ.
*/
package provendordb.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import provendordb.tables.Provuser;
import provendordb.tables.records.ProvuserRecord;


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
public class ProvuserDao extends DAOImpl<ProvuserRecord, provendordb.tables.pojos.Provuser, Integer> {

    /**
     * Create a new ProvuserDao without any configuration
     */
    public ProvuserDao() {
        super(Provuser.PROVUSER, provendordb.tables.pojos.Provuser.class);
    }

    /**
     * Create a new ProvuserDao with an attached configuration
     */
    public ProvuserDao(Configuration configuration) {
        super(Provuser.PROVUSER, provendordb.tables.pojos.Provuser.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(provendordb.tables.pojos.Provuser object) {
        return object.getProvuserid();
    }

    /**
     * Fetch records that have <code>provuserid IN (values)</code>
     */
    public List<provendordb.tables.pojos.Provuser> fetchByProvuserid(Integer... values) {
        return fetch(Provuser.PROVUSER.PROVUSERID, values);
    }

    /**
     * Fetch a unique record that has <code>provuserid = value</code>
     */
    public provendordb.tables.pojos.Provuser fetchOneByProvuserid(Integer value) {
        return fetchOne(Provuser.PROVUSER.PROVUSERID, value);
    }

    /**
     * Fetch records that have <code>provusername IN (values)</code>
     */
    public List<provendordb.tables.pojos.Provuser> fetchByProvusername(String... values) {
        return fetch(Provuser.PROVUSER.PROVUSERNAME, values);
    }

    /**
     * Fetch records that have <code>provuseraadhar IN (values)</code>
     */
    public List<provendordb.tables.pojos.Provuser> fetchByProvuseraadhar(Integer... values) {
        return fetch(Provuser.PROVUSER.PROVUSERAADHAR, values);
    }

    /**
     * Fetch records that have <code>provuserfirstname IN (values)</code>
     */
    public List<provendordb.tables.pojos.Provuser> fetchByProvuserfirstname(String... values) {
        return fetch(Provuser.PROVUSER.PROVUSERFIRSTNAME, values);
    }

    /**
     * Fetch records that have <code>provuserlastname IN (values)</code>
     */
    public List<provendordb.tables.pojos.Provuser> fetchByProvuserlastname(String... values) {
        return fetch(Provuser.PROVUSER.PROVUSERLASTNAME, values);
    }

    /**
     * Fetch records that have <code>provuserpassword IN (values)</code>
     */
    public List<provendordb.tables.pojos.Provuser> fetchByProvuserpassword(String... values) {
        return fetch(Provuser.PROVUSER.PROVUSERPASSWORD, values);
    }

    /**
     * Fetch records that have <code>provuseremail IN (values)</code>
     */
    public List<provendordb.tables.pojos.Provuser> fetchByProvuseremail(String... values) {
        return fetch(Provuser.PROVUSER.PROVUSEREMAIL, values);
    }

    /**
     * Fetch records that have <code>provusermobile IN (values)</code>
     */
    public List<provendordb.tables.pojos.Provuser> fetchByProvusermobile(String... values) {
        return fetch(Provuser.PROVUSER.PROVUSERMOBILE, values);
    }

    /**
     * Fetch records that have <code>provusermobile2 IN (values)</code>
     */
    public List<provendordb.tables.pojos.Provuser> fetchByProvusermobile2(String... values) {
        return fetch(Provuser.PROVUSER.PROVUSERMOBILE2, values);
    }

    /**
     * Fetch records that have <code>provuseraddress IN (values)</code>
     */
    public List<provendordb.tables.pojos.Provuser> fetchByProvuseraddress(String... values) {
        return fetch(Provuser.PROVUSER.PROVUSERADDRESS, values);
    }

    /**
     * Fetch records that have <code>provusercity IN (values)</code>
     */
    public List<provendordb.tables.pojos.Provuser> fetchByProvusercity(String... values) {
        return fetch(Provuser.PROVUSER.PROVUSERCITY, values);
    }

    /**
     * Fetch records that have <code>provuserstate IN (values)</code>
     */
    public List<provendordb.tables.pojos.Provuser> fetchByProvuserstate(String... values) {
        return fetch(Provuser.PROVUSER.PROVUSERSTATE, values);
    }

    /**
     * Fetch records that have <code>provusercountry IN (values)</code>
     */
    public List<provendordb.tables.pojos.Provuser> fetchByProvusercountry(String... values) {
        return fetch(Provuser.PROVUSER.PROVUSERCOUNTRY, values);
    }

    /**
     * Fetch records that have <code>provuserdivision IN (values)</code>
     */
    public List<provendordb.tables.pojos.Provuser> fetchByProvuserdivision(String... values) {
        return fetch(Provuser.PROVUSER.PROVUSERDIVISION, values);
    }

    /**
     * Fetch records that have <code>provinterests IN (values)</code>
     */
    public List<provendordb.tables.pojos.Provuser> fetchByProvinterests(String... values) {
        return fetch(Provuser.PROVUSER.PROVINTERESTS, values);
    }

    /**
     * Fetch records that have <code>provuserwishlist IN (values)</code>
     */
    public List<provendordb.tables.pojos.Provuser> fetchByProvuserwishlist(String... values) {
        return fetch(Provuser.PROVUSER.PROVUSERWISHLIST, values);
    }

    /**
     * Fetch records that have <code>provuserrole IN (values)</code>
     */
    public List<provendordb.tables.pojos.Provuser> fetchByProvuserrole(Integer... values) {
        return fetch(Provuser.PROVUSER.PROVUSERROLE, values);
    }

    /**
     * Fetch records that have <code>provuseratings IN (values)</code>
     */
    public List<provendordb.tables.pojos.Provuser> fetchByProvuseratings(Integer... values) {
        return fetch(Provuser.PROVUSER.PROVUSERATINGS, values);
    }

    /**
     * Fetch records that have <code>provusernumber IN (values)</code>
     */
    public List<provendordb.tables.pojos.Provuser> fetchByProvusernumber(Integer... values) {
        return fetch(Provuser.PROVUSER.PROVUSERNUMBER, values);
    }
}
