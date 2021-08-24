package edu.ayit.Utils;


import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @Description 数据库操作工具类
 * @Author Jingyang Yao
 * @Date 2021/8/24
 * @Version 1.0
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


}