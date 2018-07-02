package com.baizhi.factoryBean;

import org.springframework.beans.factory.FactoryBean;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by mjli on 2018/6/28.
 */
public class ConnectionFB implements FactoryBean<Connection> {
    /*
    获得复杂对象
     */

    /*获取目标对象*/
    @Override
    public Connection getObject() throws Exception {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection conn = DriverManager.getConnection("");
        return conn;
    }

    @Override
    public Class<?> getObjectType() {/*获得目标对象的类型*/
        return null;
    }

    @Override
    public boolean isSingleton() {/*控制该对象是单例还是多例*/
        return false;
    }
}
