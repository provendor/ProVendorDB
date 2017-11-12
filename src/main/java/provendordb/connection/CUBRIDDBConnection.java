package provendordb.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

public class CUBRIDDBConnection {

	public static DSLContext dbConnect;
	public static Connection connection = null;
	
	public static DSLContext getConnection() {
		if(connection==null) {
			try {
				Class.forName("cubrid.jdbc.driver.CUBRIDDriver");
				connection = DriverManager.getConnection("jdbc:cubrid:localhost:30000:demodb:::?charset=UTF-8", "dba", "");
				dbConnect = DSL.using(connection, SQLDialect.CUBRID);
			} catch (Exception e) {
				System.err.println("SQLException : " + e.getMessage());
			}
		}
		return dbConnect;
	}
}
