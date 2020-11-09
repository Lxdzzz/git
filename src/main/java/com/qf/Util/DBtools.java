package com.qf.Util;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.util.Properties;


public class DBtools {
    private static DruidDataSource ds;
    static {
        Properties prop = new Properties();
        try {
            prop.load(DBtools.class.getClassLoader().getResourceAsStream("db.properties"));
            ds= (DruidDataSource) DruidDataSourceFactory.createDataSource(prop);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public  static DruidDataSource getDataSource(){
        return ds;
    }
}
