package edu.ayit.servlet;

import edu.ayit.pojo.MembersBean;
import lombok.SneakyThrows;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;

/**
 * @description: 添加成员servlet类；通过表单提交的信息，添加成员
 * @author Jingyang Yao
 * @date: 2021/8/29
 * @version 1.0
 */
public class IndexToAddMemberServlet extends HttpServlet {

    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf8");//防止中文乱码
        //获取所有参数键值对，通过反射对其bean对象赋值
        Map<String, String[]> parameterMap = req.getParameterMap();
        Class<MembersBean> memberBeanClass = (Class<MembersBean>) IndexToAddMemberServlet.class.getClassLoader().loadClass("edu.ayit.pojo.MembersBean");
        MembersBean membersBean = memberBeanClass.newInstance();
        for (Iterator it = parameterMap.entrySet().iterator();it.hasNext();){
            Map.Entry entry = (Map.Entry) it.next();
            String fieldName = (String) entry.getKey();
            Object fieldValue = ((String[])entry.getValue())[0];
            Field field = memberBeanClass.getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(membersBean,fieldValue);
        }
        System.out.println(membersBean);
    }
}
