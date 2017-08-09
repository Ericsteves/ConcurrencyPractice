 package com.cn.test;

import java.util.Date;

//import org.apache.commons.lang.time.DateFormatUtils;

import oracle.jdbc.dcn.DatabaseChangeEvent;
import oracle.jdbc.dcn.DatabaseChangeListener;
import oracle.jdbc.dcn.RowChangeDescription;
import oracle.jdbc.dcn.RowChangeDescription.RowOperation;
import oracle.jdbc.dcn.TableChangeDescription;
import oracle.sql.ROWID;

public class DataBaseChangeListenerTest implements DatabaseChangeListener {
    @Override
    public void onDatabaseChangeNotification(
            DatabaseChangeEvent databaseChangeEvent) {
        TableChangeDescription[] tds = databaseChangeEvent
                .getTableChangeDescription();
        /*System.out.println("============================="
                + DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss")
                + "=============================");*/
        System.out.println("'TableChangeDescription'(数据表的变化次数):" + tds.length);
        for (TableChangeDescription td : tds) {
            System.out.println("数据库表id：" + td.getObjectNumber());
            System.out.println("数据表名称：" + td.getTableName());
            // 获得返回的行级变化描述通知 行id、影响这一行的DML操作(行是插入、更新或删除的一种)
            RowChangeDescription[] rds = td.getRowChangeDescription();
            for (RowChangeDescription rd : rds) {
                RowOperation rowOperation = rd.getRowOperation();
                System.out.println("数据库表行级变化：" + rowOperation.toString());
                ROWID rowid = rd.getRowid();
                System.out.println(rowid.stringValue());
                //JavaCallKettle.runTransfer(rowid.stringValue());
            }
        }
    }
}