package com.cn.test;


import java.sql.*;
import java.util.Properties;


import oracle.jdbc.*;
import oracle.jdbc.dcn.*;


public class DBChangeNotification {
	static final String USERNAME = "dev9i";
	static final String PASSWORD = "pass";
	static String URL = "jdbc:oracle:thin:@192.168.168.10:1521:ZLORANEW";


	public static void main(String[] argv) {

		DBChangeNotification demo = new DBChangeNotification();
		try {
			demo.run();
		} catch (SQLException mainSQLException) {
			mainSQLException.printStackTrace();
		}
	}
	
	
	void run() throws SQLException {
		OracleConnection conn = connect();
		
		// first step: create a registration on the server:
		Properties prop = new Properties();
		
		
		// if connected through the VPN, you need to provide the TCP address of
		// the client.
		// For example:
		// prop.setProperty(OracleConnection.NTF_LOCAL_HOST,"14.14.13.12");
		
		
		// Ask the server to send the ROWIDs as part of the DCN events (small
		// performance
		// cost):
		// prop.setProperty(OracleConnection.DCN_NOTIFY_ROWIDS, "true");
		//
		// Set the DCN_QUERY_CHANGE_NOTIFICATION option for query registration
		// with finer granularity.
		prop.setProperty(OracleConnection.DCN_NOTIFY_ROWIDS, "true");
		prop.setProperty(OracleConnection.DCN_IGNORE_DELETEOP, "true");
		// prop.setProperty(OracleConnection.NTF_TIMEOUT, "3600");
		// The following operation does a roundtrip to the database to create a
		// new
		// registration for DCN. It sends the client address (ip address and
		// port) that
		// the server will use to connect to the client and send the
		// notification
		// when necessary. Note that for now the registration is empty (we
		// haven't registered
		// any table). This also opens a new thread in the drivers. This thread
		// will be
		// dedicated to DCN (accept connection to the server and dispatch the
		// events to
		// the listeners).
		DatabaseChangeRegistration dcr = conn.registerDatabaseChangeNotification(prop);
		
		
		try {
			// add the listener:
			
			
			dcr.addListener(new DatabaseChangeListener() {
			
			
				@Override
				public void onDatabaseChangeNotification(DatabaseChangeEvent e) {
				// TODO Auto-generated method stub
					DatabaseChangeEvent.EventType etype = e.getEventType();
					System.out.println("receive " + etype + " event, RegId="+e.getRegistrationId());
				}
			
			
			});
			conn.setAutoCommit(true);
			String sql = "update KB_DATASOURCE_FACT_34 set LINE_NAME=? where id = 5 ";
			PreparedStatement upPstmt = conn.prepareStatement(sql);
			upPstmt.setString(1, "江中牌健胃消食片生产线111111111");
			upPstmt.executeUpdate();
		
		
		} catch (SQLException ex) {
			// if an exception occurs, we need to close the registration in
			// order
			// to interrupt the thread otherwise it will be hanging around.
			if (conn != null)
			conn.unregisterDatabaseChangeNotification(dcr);
			throw ex;
		} finally {
			try {
				// Note that we close the connection!
				conn.close();
			} catch (Exception innerex) {
				innerex.printStackTrace();
			}
		}
	}
	
	
	/**
	* Creates a connection the database.
	*/
	OracleConnection connect() throws SQLException {
		OracleDriver dr = new OracleDriver();
		Properties prop = new Properties();
		prop.setProperty("user", DBChangeNotification.USERNAME);
		prop.setProperty("password", DBChangeNotification.PASSWORD);
		Connection conn = dr.connect(DBChangeNotification.URL, prop);
		OracleConnection oconn = (OracleConnection) conn.unwrap(OracleConnection.class);
		return oconn;
	}
}