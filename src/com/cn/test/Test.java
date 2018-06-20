package com.cn.test;

import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException {
//        OracleDataSource dataSource = new OracleDataSource();
//        dataSource.setUser("dev9i");
//        dataSource.setPassword("pass");
//        dataSource.setURL("jdbc:oracle:thin:@192.168.168.10:1521:ZLORANEW");
//        final OracleConnection conn = (OracleConnection) dataSource
//                .getConnection();
//        Properties prop = new Properties();
//        prop.setProperty(OracleConnection.DCN_NOTIFY_ROWIDS, "true");// 要取得更改记录的rowid
//        // 设置超时，这里是1个小时，届时数据库和驱动器的资源自动释放。如果为0或不设置，则用不过期，直到程序停止监听，当数据库发送更新通知时，因为没有监听端口，数据库随后释放资源
//        prop.setProperty(OracleConnection.NTF_TIMEOUT, "0");
//        DatabaseChangeRegistration databaseChangeRegistration = conn
//                .registerDatabaseChangeNotification(prop);
//        DatabaseChangeListener databaseChangeListener = new DataBaseChangeListenerTest();
//        databaseChangeRegistration.addListener(databaseChangeListener);
//        OracleStatement statement = (OracleStatement) conn.createStatement();
//        statement.setDatabaseChangeRegistration(databaseChangeRegistration);
//        statement.executeQuery("select * from KB_DATASOURCE_FACT_34 t ");
//        //statement.executeQuery("select * from DTQY_JXKH_CL where 1=2");
//        statement.close();
//        conn.close();
//        System.err.println("数据库更改通知开启：");
//        System.out.println("For Git test");
    }
}