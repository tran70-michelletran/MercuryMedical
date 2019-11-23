package com.mercurymedical.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	
	public static class DBConnector {
		private static String dbURL = "databaseURL";
		private static String driverName = "com.mysql.jdbc.Driver";
		private static String username = "username";
		private static String password = "password";
		private static Connection con = null;

		/**
		 * This method establishes a connection to sql server
		 * 
		 * @Connection returns the connection to the database
		 */
		public static Connection getConnection() {
			try {
				Class.forName(driverName);
				try {
					con = DriverManager.getConnection(dbURL, username, password);
				} catch (SQLException ex) {
					String sqlMessage = ex.getMessage();
					String sqlState = ex.getSQLState();
					int vendorCode = ex.getErrorCode();

					System.err.println("Exception occurred:");
					System.err.println("Message: " + sqlMessage);
					System.err.println("SQL State: " + sqlState);
					System.err.println("Vendor code: " + vendorCode);
				}
			} catch (ClassNotFoundException ex) {
				System.out.println("Driver not found.");
			}
			return con;
		}
	}
	
	public static void closeJDBCObjects(Connection conn, Statement stmt, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
            
            if (stmt != null) {
                stmt.close();
            }
            
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ignored) {
        }
    }
    
    public static void closeJDBCObjects(Connection conn, Statement stmt) {
        closeJDBCObjects(conn, stmt, null);
    }

}
