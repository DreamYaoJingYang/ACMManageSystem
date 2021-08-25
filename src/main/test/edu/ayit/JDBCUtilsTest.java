package edu.ayit;

import edu.ayit.utils.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;

/**
 * @program: acm管理系统
 * @description: 测试类
 * @author: Jingyang Yao
 * @create: 2021/08/25
 */
public class JDBCUtilsTest {

    /**
    *@Description: 测试获取连接方法
    *@Author: Jingyang Yao
    *@date: 2021/8/25
    */
    @Test
   public void getConnectionTest(){
        Connection connection = JDBCUtils.getConnection();
        System.out.println(connection);
        JDBCUtils.closeConnection(connection);
    }


}
