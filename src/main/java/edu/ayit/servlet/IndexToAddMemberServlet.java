package edu.ayit.servlet;

import edu.ayit.dao.MembersDao;
import edu.ayit.pojo.MembersBean;
import lombok.SneakyThrows;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/**
 * @description: 添加成员servlet类；通过表单提交的信息，添加成员
 * @author Jingyang Yao
 * @date: 2021/8/29
 * @version 1.0
 */
public class IndexToAddMemberServlet  extends HttpServlet {

    private MembersDao membersDao = new MembersDao();

    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");//防止中文乱码
        //获取所有参数键值对，通过反射对其bean对象赋值
        Map<String, String[]> parameterMap = req.getParameterMap();
        Class<MembersBean> memberBeanClass = (Class<MembersBean>) IndexToAddMemberServlet.class.getClassLoader().loadClass("edu.ayit.pojo.MembersBean");
        MembersBean membersBean = memberBeanClass.newInstance();

        for (Map.Entry<String, String[]> entry : parameterMap.entrySet()){

            String fieldName = (String) entry.getKey();
            String fieldValue = ((String[])entry.getValue())[0];
            Field field = memberBeanClass.getDeclaredField(fieldName);
            field.setAccessible(true);

            //特殊处理数据类型
            String typeName = field.getType().getName();
            if(typeName.equalsIgnoreCase("int")){
                field.set(membersBean,Integer.valueOf(fieldValue));
            }else if(typeName.equalsIgnoreCase("java.util.date")){
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date date = simpleDateFormat.parse(fieldValue);
                field.set(membersBean,date);
            }else {
                field.set(membersBean,fieldValue);
            }
        }
        /*数据库操作 添加成员*/
        membersDao.addMember(membersBean);
        resp.sendRedirect("/ACMManageSystem/index.jsp");
    }
}
