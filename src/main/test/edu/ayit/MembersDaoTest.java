package edu.ayit;

import edu.ayit.dao.MembersDao;
import edu.ayit.pojo.MembersBean;
import org.junit.Test;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: acm管理系统
 * @description: MembersDao测试类
 * @author: Jingyang Yao
 * @create: 2021/08/25
 */
public class MembersDaoTest {

    private MembersDao membersDao = new MembersDao();
    /**
    *@description: 测试 addMember 方法
    *@author: Jingyang Yao
    *@date: 2021/8/25
    */
    @Test
    public void addMemberTest() throws SQLException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date joinDate = null;
        try {
            joinDate = simpleDateFormat.parse("2018-11-27");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        MembersBean membersBean = new MembersBean("大佬","姚景阳","18031310101","计算机学院","物联网工程",2018,1,"410752200101213487","13353653628","yaojingyang@acm.com","yaojingyang.jpg",joinDate,0,"yaojingyang","200012");
        membersDao.addMember(membersBean);
    }
}
