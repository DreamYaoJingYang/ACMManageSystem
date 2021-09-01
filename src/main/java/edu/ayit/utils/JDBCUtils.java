package edu.ayit.utils;


import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @description: 数据库操作工具类
 * @author Jingyang Yao
 * @date: 2021/8/24
 * @version: 1.0
 */
public class JDBCUtils {

    /*
     * @Author Jingyang Yao
     * @Description 获取数据库连接
     * @Date 22:00 2021/8/24
     * @Param
     * @return
     */
    public static Connection getConnection(){
        //加载 jdbc.properties 文件，配置数据库
        InputStream resourceAsStream = JDBCUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");//通过系统加载器 获取资源流
        Properties properties = new Properties();
        try {
            properties.load(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String url = (String) properties.get("url");
        String username = (String) properties.get("username");
        String password = (String) properties.get("password");
        String driverClass = (String) properties.get("driverClass");


        Connection connection = null;
        try {
            //加载驱动
            Class.forName(driverClass);
            //DriverManager 获取连接
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    /**
    *@description: 关闭数据库链接
    *@author: Jingyang Yao
    *@date: 2021/8/25
    */
    public static void closeConnection(Connection connection){
        try {
            if(connection!=null){
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
