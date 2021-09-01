package edu.ayit.dao;

import edu.ayit.pojo.MembersBean;
import edu.ayit.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @program: acm管理系统
 * @description: members成员 service 层
 * @author: Jingyang Yao
 * @create: 2021/08/25
 */

public class MembersDao {

    /**
     * @description: 添加成员, 返回添加是否成功信息
     * @author: Jingyang Yao
     * @date: 2021/8/25
     */

    public void addMember(MembersBean membersBean) throws SQLException {
        String sql = "insert into members(nickname,name,student_number,department,major," +
                                 "grade,class_name,id_card,phone_number,email,photo_name,join_date,is_exit," +
                                "account,password)" +
                     "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        Connection connection = JDBCUtils.getConnection();

        //预编译sql语句
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, membersBean.getNickname());
        preparedStatement.setObject(2, membersBean.getName());
        preparedStatement.setObject(3, membersBean.getStudentNumber());
        preparedStatement.setObject(4, membersBean.getDepartment());
        preparedStatement.setObject(5, membersBean.getMajor());
        preparedStatement.setObject(6, membersBean.getGrade());
        preparedStatement.setObject(7, membersBean.getClassName());
        preparedStatement.setObject(8, membersBean.getIdCard());
        preparedStatement.setObject(9, membersBean.getPhoneNumber());
        preparedStatement.setObject(10, membersBean.getEmail());
        preparedStatement.setObject(11, membersBean.getPhotoName());
        preparedStatement.setObject(12, membersBean.getJoinDate());
        preparedStatement.setObject(13, membersBean.getIsExit());
        preparedStatement.setObject(14, membersBean.getAccount());
        preparedStatement.setObject(15, membersBean.getPassword());

        //执行
        preparedStatement.execute();

        JDBCUtils.closeConnection(connection);
    }

    /**
     * @description: 通过acm查询成员
     * @author: Jingyang Yao
     * @date: 2021/8/25
     */
    public MembersBean queryMemberByAcmId(int acmId) {
        return null;
    }


}
